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


public class ServicePie extends JPanel
{
    private static ChartPanel panel;
    private static HashMap<String, Integer> mappingSpeciaToCount;

    public ServicePie()
    {
        mappingSpeciaToCount = new HashMap<>();
        mappingSpeciaToCount.put("CHG", 0);
        mappingSpeciaToCount.put("REA", 0);
        getStats();
        createDoctorPanel();


    }

    public static void getStats()
    {
        try
        {
            String query = "SELECT * FROM hospitalisation;";
            Statement st = MainControl.conn.conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                String service = rs.getString(DataType.CodeService);
                if(mappingSpeciaToCount.containsKey(service))
                {
                    mappingSpeciaToCount.put(service, mappingSpeciaToCount.get(service) + 1);
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
        dataset.setValue("CHG", new Double(mappingSpeciaToCount.get("CHG")));
        dataset.setValue("REA", new Double(mappingSpeciaToCount.get("REA")));

        return dataset;
    }

    private static JFreeChart createChart(PieDataset dataset)
    {
        JFreeChart chart = ChartFactory.createPieChart(
                "Service spread",   // chart title
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