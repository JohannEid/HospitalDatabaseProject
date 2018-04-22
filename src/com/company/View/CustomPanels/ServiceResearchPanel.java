/*
 * Created by JFormDesigner on Fri Apr 20 17:06:50 CEST 2018
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
public class ServiceResearchPanel extends JPanel {
    private ElementHospital[] elementsToDisplay;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Alannah Epaulard
    private JPanel this2;
    private JLabel label2;
    private JLabel label12;
    private JLabel label7;
    private JTextField codeText;
    private JCheckBox codeCheckBox;
    private JLabel label1;
    private JLabel label8;
    private JTextField nameText;
    private JCheckBox nameCheckBox;
    private JLabel label3;
    private JLabel label9;
    private JTextField buildingLetterText;
    private JCheckBox buildingCheckBox;
    private JLabel label13;
    private JTextField numberDirectorText;
    private JCheckBox numberDirectorCheckBox;
    private JCheckBox allCheckbox;
    private JButton button1;
    private JComponent separator3;
    private JScrollPane scrollPane1;
    private JLabel label6;
    private JCheckBox adressCheckBox;
    private JCheckBox idCheckbox;
    private JCheckBox specialityCheckbox;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-END:variables


    public ServiceResearchPanel() {
        super();
        initComponents();
        button1.addActionListener(new ServiceResearchPanel.SubmitListener());
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

    }

    private void createUIComponents() {
        // TODO: add custom component creation code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Alannah Epaulard
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        this2 = new JPanel();
        label2 = new JLabel();
        label12 = new JLabel();
        label7 = new JLabel();
        codeText = new JTextField();
        codeCheckBox = new JCheckBox();
        label1 = new JLabel();
        label8 = new JLabel();
        nameText = new JTextField();
        nameCheckBox = new JCheckBox();
        label3 = new JLabel();
        label9 = new JLabel();
        buildingLetterText = new JTextField();
        buildingCheckBox = new JCheckBox();
        label13 = compFactory.createLabel("number director");
        numberDirectorText = new JTextField();
        numberDirectorCheckBox = new JCheckBox();
        allCheckbox = new JCheckBox();
        button1 = new JButton();
        separator3 = compFactory.createSeparator("Search results:");
        scrollPane1 = new JScrollPane();
        label6 = new JLabel();
        adressCheckBox = new JCheckBox();
        idCheckbox = new JCheckBox();
        specialityCheckbox = new JCheckBox();

        //======== this ========

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
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]"));

        //======== this2 ========
        {
            this2.setPreferredSize(new Dimension(1980, 1000));
            this2.setLayout(new MigLayout(
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
                "[43,fill]" +
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
                "[0,fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[0,fill]" +
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
            this2.add(label2, "cell 2 4 61 1");

            //---- label12 ----
            label12.setText("Select information ");
            this2.add(label12, "cell 49 4 5 1");

            //---- label7 ----
            label7.setText("Code");
            this2.add(label7, "cell 2 5");
            this2.add(codeText, "cell 9 5 38 1");

            //---- codeCheckBox ----
            codeCheckBox.setText("Code");
            codeCheckBox.setBackground(null);
            codeCheckBox.setBorderPaintedFlat(true);
            codeCheckBox.setOpaque(false);
            this2.add(codeCheckBox, "cell 52 5");
            this2.add(label1, "cell 26 6 8 1");

            //---- label8 ----
            label8.setText("Name ");
            this2.add(label8, "cell 2 7");
            this2.add(nameText, "cell 9 7 38 1");

            //---- nameCheckBox ----
            nameCheckBox.setText("Name");
            nameCheckBox.setBackground(null);
            nameCheckBox.setOpaque(false);
            this2.add(nameCheckBox, "cell 52 7");
            this2.add(label3, "cell 26 8");

            //---- label9 ----
            label9.setText("Building");
            this2.add(label9, "cell 2 9");
            this2.add(buildingLetterText, "cell 9 9 38 1");

            //---- buildingCheckBox ----
            buildingCheckBox.setText("Building");
            buildingCheckBox.setOpaque(false);
            this2.add(buildingCheckBox, "cell 52 9");
            this2.add(label13, "cell 2 11");
            this2.add(numberDirectorText, "cell 8 11 33 1");

            //---- numberDirectorCheckBox ----
            numberDirectorCheckBox.setText("number director");
            this2.add(numberDirectorCheckBox, "cell 52 11");

            //---- allCheckbox ----
            allCheckbox.setText("All");
            allCheckbox.setOpaque(false);
            this2.add(allCheckbox, "cell 52 14");

            //---- button1 ----
            button1.setText("Submit");
            this2.add(button1, "cell 10 17 29 1");
            this2.add(separator3, "cell 2 35 80 1");
            this2.add(scrollPane1, "cell 2 37 85 14");
            this2.add(label6, "cell 26 40");

            //---- adressCheckBox ----
            adressCheckBox.setText("Adress");
            adressCheckBox.setOpaque(false);
            this2.add(adressCheckBox, "cell 79 45");

            //---- idCheckbox ----
            idCheckbox.setText("Personal number");
            idCheckbox.setOpaque(false);
            this2.add(idCheckbox, "cell 79 52");

            //---- specialityCheckbox ----
            specialityCheckbox.setText("Speciality");
            specialityCheckbox.setOpaque(false);
            this2.add(specialityCheckbox, "cell 79 54");
        }
        add(this2, "cell 0 0");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
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

                elementsToDisplay = ReadDataBase.readFromDatabase(selectedProjections, selectConditions(), DataType.Service, MainControl.conn);
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

        if(codeCheckBox.isSelected())
        {
            projectTab.add(DataType.Code);
        }
        if(nameCheckBox.isSelected())
        {
            projectTab.add(DataType.Name);
        }
        if(buildingCheckBox.isSelected())
        {
            projectTab.add(DataType.Building);
        }
        if(numberDirectorCheckBox.isSelected())
        {
            projectTab.add(DataType.Superviser);
        }

        return projectTab;
    }

    private ArrayList<String> selectConditions()
    {
        ArrayList<String> selectTab = new ArrayList<>();

        if(!codeText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Code, codeText.getText()));
        }
        if(!nameText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Name, nameText.getText()));

        }
        if(!buildingLetterText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Building, buildingLetterText.getText()));

        }
        if(!numberDirectorText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Superviser, numberDirectorText.getText()));

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
        codeCheckBox.setSelected(true);
        nameCheckBox.setSelected(true);
        buildingCheckBox.setSelected(true);
        numberDirectorCheckBox.setSelected(true);
    }
}

