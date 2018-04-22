/*
 * Created by JFormDesigner on Sun Apr 22 21:28:33 CEST 2018
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
 * @author Alannah Epaulard
 */
public class ServiceUpdatePanel extends JPanel {
    private ButtonListener listener;
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Alannah Epaulard
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        label1 = new JLabel();
        label4 = new JLabel();
        codeText = new JTextField();
        separator5 = compFactory.createSeparator("Delete information linked to this ID");
        deleteButton = new JButton();
        label5 = new JLabel();
        label7 = new JLabel();
        nameText = new JTextField();
        label8 = new JLabel();
        buildingText = new JTextField();
        label9 = new JLabel();
        numberDirectorText = new JTextField();
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
                        "[]"));

        //---- label1 ----
        label1.setText("Update service database");
        add(label1, "cell 1 0 3 1");

        //---- label4 ----
        label4.setText("Code");
        add(label4, "cell 1 2");
        add(codeText, "cell 3 2 26 1");
        add(separator5, "cell 1 4 34 1");

        //---- deleteButton ----
        deleteButton.setText("Delete");
        add(deleteButton, "cell 1 6 3 1");
        add(label5, "cell 1 7");

        //---- label7 ----
        label7.setText("Name");
        add(label7, "cell 1 8");
        add(nameText, "cell 3 8 26 1");

        //---- label8 ----
        label8.setText("Building");
        add(label8, "cell 1 10");
        add(buildingText, "cell 3 10 26 1");

        //---- label9 ----
        label9.setText("Number Director");
        add(label9, "cell 1 12");
        add(numberDirectorText, "cell 3 12 26 1");
        add(separator3, "cell 1 15 28 1");

        //---- updateButton ----
        updateButton.setText("Update");
        add(updateButton, "cell 1 17 3 1");
        add(separator4, "cell 1 19 28 1");

        //---- insertButton ----
        insertButton.setText("Insert");
        add(insertButton, "cell 1 21 2 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Alannah Epaulard
    private JLabel label1;
    private JLabel label4;
    private JTextField codeText;
    private JComponent separator5;
    private JButton deleteButton;
    private JLabel label5;
    private JLabel label7;
    private JTextField nameText;
    private JLabel label8;
    private JTextField buildingText;
    private JLabel label9;
    private JTextField numberDirectorText;
    private JComponent separator3;
    private JButton updateButton;
    private JComponent separator4;
    private JButton insertButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    public void selectUpdates() {
        if(!codeText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.CodeService, codeText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.CodeService, " ");

        if(!nameText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.Service, nameText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.Service, " ");

        if(!buildingText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.Building, buildingText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.Building, " ");

        if(!numberDirectorText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.Superviser, numberDirectorText.getText());

        }
        else DataType.mappingAttributeToParam.put(DataType.Superviser, " ");

    }
    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource().equals(deleteButton))
            {
                if(codeText.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null , "Please enter le code du service" ,"Delete error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                List<String> tables = Arrays.asList(DataType.CodeService);

                UpdateDataBase.deleteFromDataBase(codeText.getText(), tables);
            }

            if (e.getSource().equals(updateButton))
            {
                if(codeText.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null , "Please enter the code service" ,"Update error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                selectUpdates();
                UpdateDataBase.updateDataBase(DataType.CodeService);
            }

            if (e.getSource().equals(insertButton))
            {
                if(codeText.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null , "Please enter the code service" ,"Insert error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                selectUpdates();
                UpdateDataBase.insertIntoDataBase(DataType.Room);
            }
        }
    }}


