package com.company.View.CustomPanels;

import com.company.Control.DataType;
import com.company.Control.MainControl;
import com.company.Control.QueryBuilder;
import com.company.Control.ReadDataBase;
import com.company.Model.ElementHospital;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class HospitalisationResearchPanel extends ImagePanel
{

    public HospitalisationResearchPanel()
    {
        super("images/hospitali.jpg");
        initComponents();
        scrollPane1.setVisible(false);

        allCheckbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                if(allCheckbox.isSelected())
                {
                    selectAllCheckBoxes();
                }
            }
        });
        button1.addActionListener(new SubmitListener());
    }

    private void initComponents()
    {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Johann Eid
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        label2 = new JLabel();
        label12 = new JLabel();
        label1 = new JLabel();
        label3 = new JLabel();
        separator2 = compFactory.createSeparator("Hospitalisation  information");
        label4 = new JLabel();
        label5 = new JLabel();
        label7 = new JLabel();
        IDText = new JTextField();
        IdBox = new JCheckBox();
        label8 = new JLabel();
        serviceText = new JTextField();
        serviceBox = new JCheckBox();
        label9 = new JLabel();
        roomText = new JTextField();
        roomBox = new JCheckBox();
        label13 = compFactory.createLabel("Bed number");
        BedText = new JTextField();
        bedBox = new JCheckBox();
        label6 = new JLabel();
        button1 = new JButton();
        allCheckbox = new JCheckBox();
        separator3 = compFactory.createSeparator("Search results:");
        scrollPane1 = new JScrollPane();

        //======== this ========
        setPreferredSize(new Dimension(1980, 1000));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label2 ----
        label2.setText("Search information");
        add(label2, "cell 0 4 43 1");

        //---- label12 ----
        label12.setText("Select information ");
        add(label12, "cell 55 4 5 1");
        add(label1, "cell 15 5 4 1");
        add(label3, "cell 15 6");
        add(separator2, "cell 0 8 59 1");
        add(label4, "cell 12 9 18 1");
        add(label5, "cell 15 10");

        //---- label7 ----
        label7.setText("Patient ID");
        add(label7, "cell 0 11");
        add(IDText, "cell 3 11 42 1");

        //---- IdBox ----
        IdBox.setText("Patient ID");
        IdBox.setBackground(null);
        IdBox.setBorderPaintedFlat(true);
        IdBox.setOpaque(false);
        add(IdBox, "cell 58 11");

        //---- label8 ----
        label8.setText("Service code");
        add(label8, "cell 0 13");
        add(serviceText, "cell 3 13 43 1");

        //---- serviceBox ----
        serviceBox.setText("Service code");
        serviceBox.setBackground(null);
        serviceBox.setOpaque(false);
        add(serviceBox, "cell 58 13");

        //---- label9 ----
        label9.setText("Room number");
        add(label9, "cell 0 15");
        add(roomText, "cell 2 15 44 1");

        //---- roomBox ----
        roomBox.setText("Room number");
        roomBox.setOpaque(false);
        add(roomBox, "cell 58 15");
        add(label13, "cell 0 17");
        add(BedText, "cell 2 17 44 1");

        //---- bedBox ----
        bedBox.setText("Bed number");
        bedBox.setOpaque(false);
        add(bedBox, "cell 58 17");
        add(label6, "cell 15 18");

        //---- button1 ----
        button1.setText("Submit");
        add(button1, "cell 0 20 30 1");

        //---- allCheckbox ----
        allCheckbox.setText("All");
        allCheckbox.setOpaque(false);
        add(allCheckbox, "cell 58 20");
        add(separator3, "cell 0 45 40 1");
        add(scrollPane1, "cell 0 46 68 14");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private ElementHospital[] elementsToDisplay;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Johann Eid
    private JLabel label2;
    private JLabel label12;
    private JLabel label1;
    private JLabel label3;
    private JComponent separator2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label7;
    private JTextField IDText;
    private JCheckBox IdBox;
    private JLabel label8;
    private JTextField serviceText;
    private JCheckBox serviceBox;
    private JLabel label9;
    private JTextField roomText;
    private JCheckBox roomBox;
    private JLabel label13;
    private JTextField BedText;
    private JCheckBox bedBox;
    private JLabel label6;
    private JButton button1;
    private JCheckBox allCheckbox;
    private JComponent separator3;
    private JScrollPane scrollPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables



    private void selectAllCheckBoxes()
    {
        roomBox.setSelected(true);
        serviceBox.setSelected(true);
        IdBox.setSelected(true);
        bedBox.setSelected(true);
    }
    private void addListView()
    {
        JList<ElementHospital> list = new JList<>(elementsToDisplay);
        list.setSelectionMode (ListSelectionModel.SINGLE_SELECTION);
        list.setVisibleRowCount(16);
        list.setFixedCellHeight(30);
        scrollPane1.setViewportView(list);
        scrollPane1.setVisible(true);
        revalidate();
        repaint();
    }

    class SubmitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource().equals(button1))
            {
                ArrayList<String> selectedProjections = selectProjection();

                if(selectedProjections.size() == 0)
                {
                    JOptionPane.showMessageDialog(null , "Please select at least one search information..." ,"Search error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                elementsToDisplay = ReadDataBase.readFromDatabase(selectedProjections, selectConditions(), DataType.Hospital, MainControl.conn);
                addListView();
            }
        }
    }

    public ArrayList<String> selectProjection()
    {
        ArrayList<String> projectTab = new ArrayList<String>();
        if(allCheckbox.isSelected())
        {
            projectTab.add(DataType.SelectAll);
            return  projectTab;
        }

        if(IdBox.isSelected())
        {
            projectTab.add(DataType.NumPatient);
        }
        if(bedBox.isSelected())
        {
            projectTab.add(DataType.Bed);
        }
        if(serviceBox.isSelected())
        {
            projectTab.add(DataType.CodeService);
        }
        if(roomBox.isSelected())
        {
            projectTab.add(DataType.NumRoom);
        }

        return projectTab;
    }

    private ArrayList<String> selectConditions()
    {
        ArrayList<String> selectTab = new ArrayList<>();

        if(!roomText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Room, roomText.getText()));
        }
        if(!serviceText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.CodeService, serviceText.getText()));

        }
        if(!IDText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.NumPatient, IDText.getText()));

        }
        if(!BedText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Bed, BedText.getText()));
        }

        return selectTab;
    }
}
