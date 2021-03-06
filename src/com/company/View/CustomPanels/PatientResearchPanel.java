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

public class PatientResearchPanel extends ImagePanel
{

    public PatientResearchPanel()
    {
        super("images/patient.png");
        initComponents();
        populateComboBox();
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
        separator2 = compFactory.createSeparator("Personal information");
        label4 = new JLabel();
        label5 = new JLabel();
        label7 = new JLabel();
        phoneText = new JTextField();
        phoneCheckBox = new JCheckBox();
        label8 = new JLabel();
        nameText = new JTextField();
        nameCheckBox = new JCheckBox();
        label9 = new JLabel();
        firstNameText = new JTextField();
        firstNameCheckBox = new JCheckBox();
        label6 = new JLabel();
        label13 = compFactory.createLabel("Adress");
        adressText = new JTextField();
        adressCheckBox = new JCheckBox();
        separator1 = compFactory.createSeparator("Medical information");
        label11 = new JLabel();
        idText = new JTextField();
        idCheckbox = new JCheckBox();
        label14 = new JLabel();
        insuranceCombo = new JComboBox();
        insuranceBox = new JCheckBox();
        button1 = new JButton();
        separator3 = compFactory.createSeparator("Search results:");
        allCheckbox = new JCheckBox();
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
            "[]"));

        //---- label2 ----
        label2.setText("Search information");
        add(label2, "cell 0 4 39 1");

        //---- label12 ----
        label12.setText("Select information ");
        add(label12, "cell 51 4 5 1");
        add(label1, "cell 11 5 4 1");
        add(label3, "cell 11 6");
        add(separator2, "cell 0 8 55 1");
        add(label4, "cell 8 9 18 1");
        add(label5, "cell 11 10");

        //---- label7 ----
        label7.setText("Phone number");
        label7.setLabelFor(idText);
        add(label7, "cell 0 11");
        add(phoneText, "cell 1 11 29 1");

        //---- phoneCheckBox ----
        phoneCheckBox.setText("Phone number");
        phoneCheckBox.setBackground(null);
        phoneCheckBox.setBorderPaintedFlat(true);
        phoneCheckBox.setOpaque(false);
        add(phoneCheckBox, "cell 54 11");

        //---- label8 ----
        label8.setText("Name ");
        add(label8, "cell 0 13");
        add(nameText, "cell 1 13 29 1");

        //---- nameCheckBox ----
        nameCheckBox.setText("Name");
        nameCheckBox.setBackground(null);
        nameCheckBox.setOpaque(false);
        add(nameCheckBox, "cell 54 13");

        //---- label9 ----
        label9.setText("First name");
        add(label9, "cell 0 15");
        add(firstNameText, "cell 1 15 29 1");

        //---- firstNameCheckBox ----
        firstNameCheckBox.setText("First name");
        firstNameCheckBox.setOpaque(false);
        add(firstNameCheckBox, "cell 54 15");
        add(label6, "cell 11 17");
        add(label13, "cell 0 21");
        add(adressText, "cell 1 21 29 1");

        //---- adressCheckBox ----
        adressCheckBox.setText("Adress");
        adressCheckBox.setOpaque(false);
        add(adressCheckBox, "cell 54 21");
        add(separator1, "cell 0 24 55 1");

        //---- label11 ----
        label11.setText("Personal number");
        add(label11, "cell 0 27");
        add(idText, "cell 1 27 30 1");

        //---- idCheckbox ----
        idCheckbox.setText("Personal number");
        idCheckbox.setOpaque(false);
        add(idCheckbox, "cell 54 27");

        //---- label14 ----
        label14.setText("Insurance");
        add(label14, "cell 0 29");
        add(insuranceCombo, "cell 2 29 28 1");

        //---- insuranceBox ----
        insuranceBox.setText("Insurance");
        insuranceBox.setOpaque(false);
        add(insuranceBox, "cell 54 29");

        //---- button1 ----
        button1.setText("Submit");
        add(button1, "cell 0 36 26 1");
        add(separator3, "cell 0 39 36 1");

        //---- allCheckbox ----
        allCheckbox.setText("All");
        allCheckbox.setOpaque(false);
        add(allCheckbox, "cell 54 39");
        add(scrollPane1, "cell 0 41 64 14");
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
    private JTextField phoneText;
    private JCheckBox phoneCheckBox;
    private JLabel label8;
    private JTextField nameText;
    private JCheckBox nameCheckBox;
    private JLabel label9;
    private JTextField firstNameText;
    private JCheckBox firstNameCheckBox;
    private JLabel label6;
    private JLabel label13;
    private JTextField adressText;
    private JCheckBox adressCheckBox;
    private JComponent separator1;
    private JLabel label11;
    private JTextField idText;
    private JCheckBox idCheckbox;
    private JLabel label14;
    private JComboBox insuranceCombo;
    private JCheckBox insuranceBox;
    private JButton button1;
    private JComponent separator3;
    private JCheckBox allCheckbox;
    private JScrollPane scrollPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    private void populateComboBox()
    {
        insuranceCombo.addItem("");
        insuranceCombo.addItem("MNAM");
        insuranceCombo.addItem("LMDE");
        insuranceCombo.addItem("MNH");
        insuranceCombo.addItem("MAAF");
        insuranceCombo.addItem("MGEN");
        insuranceCombo.addItem("MMA");
        insuranceCombo.addItem("CNAMTS");
        insuranceCombo.addItem("CCVRP");
        insuranceCombo.addItem("MNFTC");
        insuranceCombo.addItem("MAS");
        insuranceCombo.addItem("AG2R");
        insuranceCombo.addItem("MGSP");
    }


    private void selectAllCheckBoxes()
    {
        phoneCheckBox.setSelected(true);
        nameCheckBox.setSelected(true);
        firstNameCheckBox.setSelected(true);
        adressCheckBox.setSelected(true);
        insuranceBox.setSelected(true);
        idCheckbox.setSelected(true);
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
                elementsToDisplay = ReadDataBase.readFromDatabase(selectedProjections, selectConditions(), DataType.Patient, MainControl.conn);
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

        if(phoneCheckBox.isSelected())
        {
            projectTab.add(DataType.PhoneNumber);
        }
        if(nameCheckBox.isSelected())
        {
            projectTab.add(DataType.Name);
        }
        if(firstNameCheckBox.isSelected())
        {
            projectTab.add(DataType.FirstName);
        }
        if(adressCheckBox.isSelected())
        {
            projectTab.add(DataType.Adress);
        }

        if(idCheckbox.isSelected())
        {
            projectTab.add(DataType.Num);
        }

        if(insuranceBox.isSelected())
        {
            projectTab.add(DataType.Insurance);
        }
        return projectTab;
    }

    private ArrayList<String> selectConditions()
    {
        ArrayList<String> selectTab = new ArrayList<>();

        if(!phoneText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.PhoneNumber, phoneText.getText()));
        }
        if(!nameText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Name, nameText.getText()));

        }
        if(!firstNameText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.FirstName, firstNameText.getText()));

        }
        if(!adressText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Adress, adressText.getText()));

        }
        if(!idText.getText().isEmpty())
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Num, idText.getText()));

        }
        if((String) insuranceCombo.getSelectedItem() != "")
        {
            selectTab.add(QueryBuilder.buildCondition(DataType.Insurance, (String)insuranceCombo.getSelectedItem()));
        }

        return selectTab;
    }
}
