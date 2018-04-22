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


public class InsurancePie extends JPanel
{
    private static ChartPanel panel;
    private static HashMap<String, Integer> mappingSpeciaToCount;

    public InsurancePie()
    {
        mappingSpeciaToCount = new HashMap<>();
        mappingSpeciaToCount.put("LMDE", 0);
        mappingSpeciaToCount.put("MNH", 0);
        mappingSpeciaToCount.put("MAAF", 0);
        mappingSpeciaToCount.put("MGEN", 0);
        mappingSpeciaToCount.put("MMA", 0);
        mappingSpeciaToCount.put("CCVRP", 0);
        mappingSpeciaToCount.put("MNFTC", 0);
        mappingSpeciaToCount.put("MAS", 0);
        mappingSpeciaToCount.put("AG2R", 0);
        mappingSpeciaToCount.put("MGSP", 0);
        mappingSpeciaToCount.put("MNAM", 0);

        getStats();
        createDoctorPanel();


    }

    public static void getStats()
    {
        try
        {
            String query = "SELECT * FROM malade;";
            Statement st = MainControl.conn.conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next())
            {
                String insurance = rs.getString(DataType.Insurance);
                if(mappingSpeciaToCount.containsKey(insurance))
                {
                    mappingSpeciaToCount.put(insurance, mappingSpeciaToCount.get(insurance) + 1);
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
        dataset.setValue("LMDE", new Double(mappingSpeciaToCount.get("LMDE")+ 1));
        dataset.setValue("MNH", new Double(mappingSpeciaToCount.get("MNH")+ 1));
        dataset.setValue("MAAF", new Double(mappingSpeciaToCount.get("MAAF")+ 1));
        dataset.setValue("MGEN", new Double(mappingSpeciaToCount.get("MGEN")+ 1));
        dataset.setValue("MMA", new Double(mappingSpeciaToCount.get("MMA")+ 1));
        dataset.setValue("CCVRP", new Double(mappingSpeciaToCount.get("CCVRP")+ 1));
        dataset.setValue("MNFTC", new Double(mappingSpeciaToCount.get("MNFTC")+ 1));
        dataset.setValue("MAS", new Double(mappingSpeciaToCount.get("MAS")+ 1));
        dataset.setValue("AG2R", new Double(mappingSpeciaToCount.get("AG2R")+ 1));
        dataset.setValue("MGSP", new Double(mappingSpeciaToCount.get("MGSP")+ 1));
        dataset.setValue("MNAM", new Double(mappingSpeciaToCount.get("MNAM") + 1));

        return dataset;
    }

    private static JFreeChart createChart(PieDataset dataset)
    {
        JFreeChart chart = ChartFactory.createPieChart(
                "Insurances ",   // chart title
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