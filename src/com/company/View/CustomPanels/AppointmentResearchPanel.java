/*
 * Created by JFormDesigner on Thu Apr 12 10:45:00 CEST 2018
 */

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

/**
 * @authors Johann Eid and Alannah Epaulard
 */
public class AppointmentResearchPanel extends ImagePanel {
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
    private JTextField doctorText;
    private JCheckBox doctorCheck;
    private JLabel label8;
    private JTextField patientText;
    private JCheckBox patientCheck;
    private JLabel label9;
    private JComboBox rotationBox;
    private JCheckBox rotationCheck;
    private JLabel label6;
    private JButton button1;
    private JCheckBox allCheckbox;
    private JComponent separator3;
    private JScrollPane scrollPane1;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-END:variables


    public AppointmentResearchPanel() {
        super("images/appoint.png");
        initComponents();
        button1.addActionListener(new SubmitListener());
        scrollPane1.setVisible(false);
        populateComboBox();

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

    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Johann Eid
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        label2 = new JLabel();
        label12 = new JLabel();
        label1 = new JLabel();
        label3 = new JLabel();
        separator2 = compFactory.createSeparator("Personal information");
        label4 = new JLabel();
        label5 = new JLabel();
        label7 = new JLabel();
        doctorText = new JTextField();
        doctorCheck = new JCheckBox();
        label8 = new JLabel();
        patientText = new JTextField();
        patientCheck = new JCheckBox();
        label9 = new JLabel();
        rotationBox = new JComboBox();
        rotationCheck = new JCheckBox();
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
            "[]"));

        //---- label2 ----
        label2.setText("Search information");
        add(label2, "cell 0 4 36 1");

        //---- label12 ----
        label12.setText("Select information ");
        add(label12, "cell 47 4 5 1");
        add(label1, "cell 8 5 4 1");
        add(label3, "cell 8 6");
        add(separator2, "cell 0 8 51 1");
        add(label4, "cell 5 9 18 1");
        add(label5, "cell 8 10");

        //---- label7 ----
        label7.setText("Doctor ID");
        add(label7, "cell 0 11");
        add(doctorText, "cell 1 11 26 1");

        //---- doctorCheck ----
        doctorCheck.setText("Doctor D");
        doctorCheck.setBackground(null);
        doctorCheck.setBorderPaintedFlat(true);
        doctorCheck.setOpaque(false);
        add(doctorCheck, "cell 50 11");

        //---- label8 ----
        label8.setText("Patient ID");
        add(label8, "cell 0 13");
        add(patientText, "cell 1 13 26 1");

        //---- patientCheck ----
        patientCheck.setText("Patient ID");
        patientCheck.setBackground(null);
        patientCheck.setOpaque(false);
        add(patientCheck, "cell 50 13");

        //---- label9 ----
        label9.setText("Rotation");
        add(label9, "cell 0 15");
        add(rotationBox, "cell 2 15 25 1");

        //---- rotationCheck ----
        rotationCheck.setText("Rotation");
        rotationCheck.setOpaque(false);
        add(rotationCheck, "cell 50 15");
        add(label6, "cell 8 17");

        //---- button1 ----
        button1.setText("Submit");
        add(button1, "cell 0 19 23 1");

        //---- allCheckbox ----
        allCheckbox.setText("All");
        allCheckbox.setOpaque(false);
        add(allCheckbox, "cell 50 19");
        add(separator3, "cell 0 22 54 1");
        add(scrollPane1, "cell 0 40 60 14");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void populateComboBox()
    {
        rotationBox.addItem("");
        rotationBox.addItem("Jour");
        rotationBox.addItem("Nuit");
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

                elementsToDisplay = ReadDataBase.readFromDatabase(selectedProjections, selectConditions(), DataType.Appointment, MainControl.conn);
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

            if(doctorCheck.isSelected())
            {
                projectTab.add(DataType.NumDoctor);
            }
            if(patientCheck.isSelected())
            {
                projectTab.add(DataType.NumPatient);
            }
            if(rotationCheck.isSelected())
            {
                projectTab.add(DataType.Rotation);
            }

            return projectTab;
        }

        private ArrayList<String> selectConditions()
        {
            ArrayList<String> selectTab = new ArrayList<>();

            if(!doctorText.getText().isEmpty())
            {
                selectTab.add(QueryBuilder.buildCondition(DataType.NumDoctor, doctorText.getText()));
            }
            if(!patientText.getText().isEmpty())
            {
                selectTab.add(QueryBuilder.buildCondition(DataType.NumPatient, patientText.getText()));

            }
            if(rotationBox.getSelectedItem() != "")
            {
                selectTab.add(QueryBuilder.buildCondition(DataType.Rotation, (String)rotationBox.getSelectedItem()));
            }
            return selectTab;
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

        private void selectAllCheckBoxes()
        {
            rotationCheck.setSelected(true);
            patientCheck.setSelected(true);
            doctorCheck.setSelected(true);
        }
    }

