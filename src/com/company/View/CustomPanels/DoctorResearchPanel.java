/*
 * Created by JFormDesigner on Thu Apr 12 10:45:00 CEST 2018
 */

package com.company.View.CustomPanels;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;

/**
 * @author unknown
 */
public class DoctorResearchPanel extends ImagePanel {
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Johann Eid
    private JLabel label2;
    private JLabel label1;
    private JLabel label3;
    private JComponent separator2;
    private JLabel label4;
    private JLabel label5;
    private JLabel label7;
    private JTextField textField2;
    private JLabel label9;
    private JLabel label6;
    private JLabel label8;
    private JTextField textField3;
    private JTextField textField4;
    private JComponent separator1;
    private JLabel label11;
    private JTextField textField1;
    private JLabel label10;
    private JTextField textField5;
    private JButton button1;

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
        label1 = new JLabel();
        label3 = new JLabel();
        separator2 = compFactory.createSeparator("Personal information");
        label4 = new JLabel();
        label5 = new JLabel();
        label7 = new JLabel();
        textField2 = new JTextField();
        label9 = new JLabel();
        label6 = new JLabel();
        label8 = new JLabel();
        textField3 = new JTextField();
        textField4 = new JTextField();
        separator1 = compFactory.createSeparator("Medical information");
        label11 = new JLabel();
        textField1 = new JTextField();
        label10 = new JLabel();
        textField5 = new JTextField();
        button1 = new JButton();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), getBorder()));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent e) {
                if ("border".equals(e.getPropertyName())) throw new RuntimeException();
            }
        });

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
                        "[]"));

        //---- label2 ----
        label2.setText("Search information");
        add(label2, "cell 0 2 31 1");
        add(label1, "cell 5 3 3 1");
        add(label3, "cell 5 4");
        add(separator2, "cell 0 6 24 1");
        add(label4, "cell 2 7 16 1");
        add(label5, "cell 5 8");

        //---- label7 ----
        label7.setText("Phone number");
        label7.setLabelFor(textField1);
        add(label7, "cell 0 9");
        add(textField2, "cell 1 9 22 1");

        //---- label9 ----
        label9.setText("First name");
        add(label9, "cell 0 13");
        add(label6, "cell 5 10");

        //---- label8 ----
        label8.setText("Name ");
        add(label8, "cell 0 11");
        add(textField3, "cell 1 11 22 1");
        add(textField4, "cell 1 13 21 1");
        add(separator1, "cell 0 15 24 1");

        //---- label11 ----
        label11.setText("Personal number");
        add(label11, "cell 0 17");
        add(textField1, "cell 1 17 22 1");

        //---- label10 ----
        label10.setText("Speciality");
        add(label10, "cell 0 20");
        add(textField5, "cell 1 20 22 1");

        //---- button1 ----
        button1.setText("Search");
        add(button1, "cell 1 21 22 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables

}
