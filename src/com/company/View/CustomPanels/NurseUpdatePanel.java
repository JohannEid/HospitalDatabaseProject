/*
 * Created by JFormDesigner on Thu Apr 19 11:17:38 CEST 2018
 */

package com.company.View.CustomPanels;

import com.company.Control.DataType;
import com.company.Control.UpdateDataBase;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

/**
 * @authors Johann Eid and Alannah Epaulard
 */
public class NurseUpdatePanel extends ImagePanel {

    public NurseUpdatePanel()
    {
        super("images/nurse.jpg");
        initComponents();

        listener = new ButtonListener();
        populateComboBox();
        deleteButton.addActionListener(listener);
        insertButton.addActionListener(listener);
        updateButton.addActionListener(listener);
    }

    private void initComponents()
    {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Johann Eid
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        label1 = new JLabel();
        label4 = new JLabel();
        idText = new JTextField();
        separator5 = compFactory.createSeparator("Delete information linked to this ID");
        deleteButton = new JButton();
        label5 = new JLabel();
        separator1 = compFactory.createSeparator("Personal information");
        label7 = new JLabel();
        nameText = new JTextField();
        label8 = new JLabel();
        firstNameText = new JTextField();
        label9 = new JLabel();
        adressText = new JTextField();
        label10 = new JLabel();
        phoneNumberText = new JTextField();
        separator2 = compFactory.createSeparator("Professional information");
        label11 = new JLabel();
        rotationBox = new JComboBox();
        label2 = new JLabel();
        salaryText = new JTextField();
        label3 = new JLabel();
        serviceText = new JTextField();
        separator3 = compFactory.createSeparator("Update existing information");
        updateButton = new JButton();
        separator4 = compFactory.createSeparator("Insert new information");
        insertButton = new JButton();

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
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
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
            "[]"));

        //---- label1 ----
        label1.setText("Update nurse database");
        add(label1, "cell 0 0 2 1");

        //---- label4 ----
        label4.setText("Personal number");
        add(label4, "cell 0 2");
        add(idText, "cell 1 2 26 1");
        add(separator5, "cell 0 4 33 1");

        //---- deleteButton ----
        deleteButton.setText("Delete");
        add(deleteButton, "cell 0 6 2 1");
        add(label5, "cell 0 7");
        add(separator1, "cell 0 8 27 1");

        //---- label7 ----
        label7.setText("Name");
        add(label7, "cell 0 10");
        add(nameText, "cell 1 10 26 1");

        //---- label8 ----
        label8.setText("First name");
        add(label8, "cell 0 12");
        add(firstNameText, "cell 1 12 26 1");

        //---- label9 ----
        label9.setText("Adress");
        add(label9, "cell 0 14");
        add(adressText, "cell 1 14 26 1");

        //---- label10 ----
        label10.setText("Phone number");
        add(label10, "cell 0 16");
        add(phoneNumberText, "cell 1 16 26 1");
        add(separator2, "cell 0 18 29 1");

        //---- label11 ----
        label11.setText("Rotation");
        add(label11, "cell 0 20");
        add(rotationBox, "cell 1 20 26 1");

        //---- label2 ----
        label2.setText("Salary");
        add(label2, "cell 0 22");
        add(salaryText, "cell 1 22 26 1");

        //---- label3 ----
        label3.setText("Service code");
        add(label3, "cell 0 24");
        add(serviceText, "cell 1 24 26 1");
        add(separator3, "cell 0 28 27 1");

        //---- updateButton ----
        updateButton.setText("Update");
        add(updateButton, "cell 0 30 2 1");
        add(separator4, "cell 0 32 27 1");

        //---- insertButton ----
        insertButton.setText("Insert");
        add(insertButton, "cell 0 35 2 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private ButtonListener listener;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Johann Eid
    private JLabel label1;
    private JLabel label4;
    private JTextField idText;
    private JComponent separator5;
    private JButton deleteButton;
    private JLabel label5;
    private JComponent separator1;
    private JLabel label7;
    private JTextField nameText;
    private JLabel label8;
    private JTextField firstNameText;
    private JLabel label9;
    private JTextField adressText;
    private JLabel label10;
    private JTextField phoneNumberText;
    private JComponent separator2;
    private JLabel label11;
    private JComboBox rotationBox;
    private JLabel label2;
    private JTextField salaryText;
    private JLabel label3;
    private JTextField serviceText;
    private JComponent separator3;
    private JButton updateButton;
    private JComponent separator4;
    private JButton insertButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void populateComboBox()
    {
        rotationBox.addItem("");
        rotationBox.addItem("Jour");
        rotationBox.addItem("Nuit");
    }

    private void selectUpdates()
    {
        if(!phoneNumberText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.PhoneNumber, phoneNumberText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.PhoneNumber, " ");

        if(!nameText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.Name, nameText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.Name, " ");

        if(!firstNameText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.FirstName, firstNameText.getText());

        }
        else DataType.mappingAttributeToParam.put(DataType.FirstName, " ");

        if(!adressText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.Adress, adressText.getText());

        }
        else DataType.mappingAttributeToParam.put(DataType.Adress, " ");

        if(!idText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.Num, idText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.Num, " ");

        if(!salaryText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.Salary, salaryText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.Salary, " ");

        if(!serviceText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.CodeService, serviceText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.CodeService, " ");

        if(rotationBox.getSelectedItem() != "")
        {
            DataType.mappingAttributeToParam.put(DataType.Speciality, (String) rotationBox.getSelectedItem());
        }
        else DataType.mappingAttributeToParam.put(DataType.Speciality, " ");
    }

    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource().equals(deleteButton))
            {
                if(idText.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null , "Please enter the nurse's ID" ,"Delete error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                List<String> tables = Arrays.asList(DataType.Nurse, DataType.Employee);

                UpdateDataBase.deleteFromDataBase(idText.getText(), tables);
            }

            if (e.getSource().equals(updateButton))
            {
                if(idText.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null , "Please enter the nurse's ID" ,"Update error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                selectUpdates();
                UpdateDataBase.updateDataBase(DataType.Employee + ", " + DataType.Nurse);
            }

            if (e.getSource().equals(insertButton))
            {
                if(idText.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null , "Please enter the nurse's ID" ,"Insert error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                selectUpdates();
                UpdateDataBase.insertIntoDataBase(DataType.Employee + ", " + DataType.Nurse);
            }
        }
    }
}
