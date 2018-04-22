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
 * @author Johann Eid
 */
public class HospitalisationUpdatePanel extends ImagePanel {

    public HospitalisationUpdatePanel()
    {
        super("images/hospitali.jpg");
        initComponents();

        listener = new ButtonListener();
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
        serviceText = new JTextField();
        label8 = new JLabel();
        roomText = new JTextField();
        dsds = new JLabel();
        bedText = new JTextField();
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
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("Update hospitalisation database");
        add(label1, "cell 0 0 2 1");

        //---- label4 ----
        label4.setText("Patient's number");
        add(label4, "cell 0 2");
        add(idText, "cell 1 2 26 1");
        add(separator5, "cell 0 4 33 1");

        //---- deleteButton ----
        deleteButton.setText("Delete");
        add(deleteButton, "cell 0 6 2 1");
        add(label5, "cell 0 7");
        add(separator1, "cell 0 8 27 1");

        //---- label7 ----
        label7.setText("Code Service");
        add(label7, "cell 0 10");
        add(serviceText, "cell 1 10 26 1");

        //---- label8 ----
        label8.setText("Room number");
        add(label8, "cell 0 12");
        add(roomText, "cell 1 12 26 1");

        //---- dsds ----
        dsds.setText("Bed number");
        add(dsds, "cell 0 14");
        add(bedText, "cell 1 14 26 1");
        add(separator3, "cell 0 16 27 1");

        //---- updateButton ----
        updateButton.setText("Update");
        add(updateButton, "cell 0 18 2 1");
        add(separator4, "cell 0 20 27 1");

        //---- insertButton ----
        insertButton.setText("Insert");
        add(insertButton, "cell 0 22 2 1");
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
    private JTextField serviceText;
    private JLabel label8;
    private JTextField roomText;
    private JLabel dsds;
    private JTextField bedText;
    private JComponent separator3;
    private JButton updateButton;
    private JComponent separator4;
    private JButton insertButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables


    private void selectUpdates()
    {
        if(!roomText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.NumRoom, roomText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.NumRoom, " ");

        if(!idText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.NumPatient, idText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.NumPatient, " ");

        if(!serviceText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.CodeService, serviceText.getText());
        }
        else DataType.mappingAttributeToParam.put(DataType.CodeService, " ");

        if(!bedText.getText().isEmpty())
        {
            DataType.mappingAttributeToParam.put(DataType.Bed, bedText.getText());

        }
        else DataType.mappingAttributeToParam.put(DataType.Bed, " ");

    }

    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if (e.getSource().equals(deleteButton))
            {
                if(idText.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null , "Please enter the room number" ,"Delete error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                List<String> tables = Arrays.asList(DataType.Hospital);

                UpdateDataBase.deleteFromDataBase(idText.getText(), tables);
            }

            if (e.getSource().equals(updateButton))
            {
                if(idText.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null , "Please enter the room number" ,"Update error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                selectUpdates();
                UpdateDataBase.updateDataBase(DataType.Hospital);
            }

            if (e.getSource().equals(insertButton))
            {
                if(idText.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null , "Please enter the room number" ,"Insert error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                selectUpdates();
                UpdateDataBase.insertIntoDataBase(DataType.Hospital);
            }
        }
    }
}
