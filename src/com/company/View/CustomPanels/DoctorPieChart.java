package com.company.View.CustomPanels;

import com.company.Control.DataType;
import com.company.Control.MainControl;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;


public class DoctorPieChart extends JPanel
{
    private static ChartPanel panel;
    private static HashMap<String, Integer> mappingSpeciaToCount;

    public DoctorPieChart()
    {
        mappingSpeciaToCount = new HashMap<>();
        mappingSpeciaToCount.put("Cardiologue", 0);
        mappingSpeciaToCount.put("Orthopediste", 0);
        mappingSpeciaToCount.put("Anesthesiste", 0);
        mappingSpeciaToCount.put("Pneumologue", 0);
        mappingSpeciaToCount.put("Traumatologue", 0);
        mappingSpeciaToCount.put("Radiologue", 0);
        getStats();
        createDoctorPanel();


    }

    public static void getStats()
    {
        try
        {
            String query = "SELECT * FROM docteur;";
            Statement st = MainControl.conn.conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                String speciality = rs.getString(DataType.Speciality);
                if(mappingSpeciaToCount.containsKey(speciality))
                {
                    mappingSpeciaToCount.put(speciality, mappingSpeciaToCount.get(speciality) + 1);
                }

            }


        }

        catch (Exception ex)
        {

        }
    }

    private static PieDataset createDataset()
    {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Cardiologue", new Double(mappingSpeciaToCount.get("Cardiologue")));
        dataset.setValue("Orthopediste", new Double(mappingSpeciaToCount.get("Orthopediste")));
        dataset.setValue("Anesthesiste", new Double(mappingSpeciaToCount.get("Anesthesiste")));
        dataset.setValue("Pneumologue", new Double(mappingSpeciaToCount.get("Pneumologue")));
        dataset.setValue("Traumatologue", new Double(mappingSpeciaToCount.get("Traumatologue")));
        dataset.setValue("Radiologue", new Double(mappingSpeciaToCount.get("Radiologue")));
        return dataset;
    }

    private static JFreeChart createChart(PieDataset dataset)
    {
        JFreeChart chart = ChartFactory.createPieChart(
                "Doctor specialities",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);

        return chart;
    }

    public  void createDoctorPanel() {
        JFreeChart chart = createChart(createDataset());
        panel = new ChartPanel(chart);
        add(panel);
    }
}