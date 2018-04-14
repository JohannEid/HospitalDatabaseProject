/*
 * Created by JFormDesigner on Thu Apr 12 10:45:00 CEST 2018
 */

package com.company.View.CustomPanels;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author unknown
 */
public class DoctorResearchPanel extends ImagePanel {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Johann Eid
    private JLabel label2;
    private JLabel label12;
    private JLabel label1;
    private JLabel label3;
    private JComponent separator2;
    private JCheckBox phoneCheckBox;
    private JLabel label4;
    private JLabel label5;
    private JLabel label7;
    private JTextField textField2;
    private JCheckBox nameCheckBox;
    private JLabel label8;
    private JTextField textField3;
    private JCheckBox firstNameCheckBox;
    private JLabel label6;
    private JLabel label9;
    private JTextField textField4;
    private JCheckBox adressCheckBox;
    private JLabel label13;
    private JTextField textField6;
    private JCheckBox idCheckbox;
    private JComponent separator1;
    private JCheckBox specialityCheckbox;
    private JLabel label11;
    private JTextField textField1;
    private JLabel label10;
    private JTextField textField5;
    private JCheckBox allCheckbox;
    private JButton button1;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-END:variables


    public DoctorResearchPanel() {
        super("images/doctor.jpg");
        initComponents();

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
        phoneCheckBox = new JCheckBox();
        label4 = new JLabel();
        label5 = new JLabel();
        label7 = new JLabel();
        textField2 = new JTextField();
        nameCheckBox = new JCheckBox();
        label8 = new JLabel();
        textField3 = new JTextField();
        firstNameCheckBox = new JCheckBox();
        label6 = new JLabel();
        label9 = new JLabel();
        textField4 = new JTextField();
        adressCheckBox = new JCheckBox();
        label13 = compFactory.createLabel("Adress");
        textField6 = new JTextField();
        idCheckbox = new JCheckBox();
        separator1 = compFactory.createSeparator("Medical information");
        specialityCheckbox = new JCheckBox();
        label11 = new JLabel();
        textField1 = new JTextField();
        label10 = new JLabel();
        textField5 = new JTextField();
        allCheckbox = new JCheckBox();
        button1 = new JButton();

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
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
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
            "[]"));

        //---- label2 ----
        label2.setText("Search information");
        add(label2, "cell 0 4 33 1");

        //---- label12 ----
        label12.setText("Select information ");
        add(label12, "cell 44 4 5 1");
        add(label1, "cell 6 5 3 1");
        add(label3, "cell 6 6");
        add(separator2, "cell 0 8 26 1");

        //---- phoneCheckBox ----
        phoneCheckBox.setText("Phone number");
        phoneCheckBox.setBackground(null);
        phoneCheckBox.setBorderPaintedFlat(true);
        phoneCheckBox.setOpaque(false);
        add(phoneCheckBox, "cell 47 8");
        add(label4, "cell 3 9 17 1");
        add(label5, "cell 6 10");

        //---- label7 ----
        label7.setText("Phone number");
        label7.setLabelFor(textField1);
        add(label7, "cell 0 11");
        add(textField2, "cell 1 11 23 1");

        //---- nameCheckBox ----
        nameCheckBox.setText("Name");
        nameCheckBox.setBackground(null);
        nameCheckBox.setOpaque(false);
        add(nameCheckBox, "cell 47 11");

        //---- label8 ----
        label8.setText("Name ");
        add(label8, "cell 0 14");
        add(textField3, "cell 1 14 23 1");

        //---- firstNameCheckBox ----
        firstNameCheckBox.setText("First name");
        firstNameCheckBox.setOpaque(false);
        add(firstNameCheckBox, "cell 47 14");
        add(label6, "cell 6 15");

        //---- label9 ----
        label9.setText("First name");
        add(label9, "cell 0 17");
        add(textField4, "cell 1 17 23 1");

        //---- adressCheckBox ----
        adressCheckBox.setText("Adress");
        add(adressCheckBox, "cell 47 17");
        add(label13, "cell 0 18");
        add(textField6, "cell 1 18 23 1");

        //---- idCheckbox ----
        idCheckbox.setText("Personal number");
        idCheckbox.setOpaque(false);
        add(idCheckbox, "cell 47 18");
        add(separator1, "cell 0 19 26 1");

        //---- specialityCheckbox ----
        specialityCheckbox.setText("Speciality");
        specialityCheckbox.setOpaque(false);
        add(specialityCheckbox, "cell 47 19");

        //---- label11 ----
        label11.setText("Personal number");
        add(label11, "cell 0 23");
        add(textField1, "cell 3 23 22 1");

        //---- label10 ----
        label10.setText("Speciality");
        add(label10, "cell 0 25");
        add(textField5, "cell 1 25 24 1");

        //---- allCheckbox ----
        allCheckbox.setText("All");
        allCheckbox.setOpaque(false);
        add(allCheckbox, "cell 47 25");

        //---- button1 ----
        button1.setText("Submit");
        add(button1, "cell 9 30 22 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

     class submitListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource().equals(button1))
            {

            }
        }

        public ArrayList<String> selectProjection()
        {
            ArrayList<String> projectTab = new ArrayList<String>();
            if(allCheckbox.isSelected())
            {
                projectTab.add("*");
                return  projectTab;
            }

            if(phoneCheckBox.isSelected())
            {
                projectTab.add("tel");
            }
            if(nameCheckBox.isSelected())
            {
                projectTab.add("nom");
            }
            if(firstNameCheckBox.isSelected())
            {
                projectTab.add("prenom");
            }
            if(adressCheckBox.isSelected())
            {
                projectTab.add("adresse");
            }
            if(specialityCheckbox.isSelected())
            {
                projectTab.add("specialite");
            }
            return projectTab;
        }
    }

}