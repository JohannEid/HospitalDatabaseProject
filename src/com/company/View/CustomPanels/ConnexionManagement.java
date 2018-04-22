/*
 * Created by JFormDesigner on Sun Apr 22 19:04:40 CEST 2018
 */

package com.company.View.CustomPanels;

import com.company.Control.Connexion;
import com.company.Control.MainControl;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @author Johann Eid
 */
public class ConnexionManagement extends ImagePanel {
    public ConnexionManagement()
    {
        super("images/connexion.jpg");
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Johann Eid
        DefaultComponentFactory compFactory = DefaultComponentFactory.getInstance();
        separator1 = compFactory.createSeparator("Connexion");
        label1 = new JLabel();
        databaseField = new JTextField();
        Login = new JLabel();
        loginField = new JTextField();
        label3 = new JLabel();
        passwordField = new JPasswordField();
        connectButton = new JButton();

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
            "[]"));
        add(separator1, "cell 0 10 34 1");

        //---- label1 ----
        label1.setText("DataBase");
        add(label1, "cell 5 12 2 1");
        add(databaseField, "cell 12 12 22 1");

        //---- Login ----
        Login.setText("Login");
        add(Login, "cell 5 14 4 1");
        add(loginField, "cell 12 14 22 1");

        //---- label3 ----
        label3.setText("Password");
        add(label3, "cell 5 16 4 1");
        add(passwordField, "cell 12 16 20 1");

        //---- connectButton ----
        connectButton.setText("Connect");
        add(connectButton, "cell 18 22 6 1");
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
        connectButton.addActionListener(new ButtonActionListener());
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Johann Eid
    private JComponent separator1;
    private JLabel label1;
    private JTextField databaseField;
    private JLabel Login;
    private JTextField loginField;
    private JLabel label3;
    private JPasswordField passwordField;
    private JButton connectButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    class ButtonActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
            if(e.getSource().equals(connectButton))
            {
                new ConnexionManagement.ConnexionRequest().start();
            }
        }
    }

    class ConnexionRequest extends Thread
    {
        public void run()
        {
            try
            {
                 MainControl.conn = new Connexion(databaseField.getText(), loginField.getText(), passwordField.getText());
              //  MainControl.conn = new Connexion("hopital", "root", "root");
                JOptionPane.showMessageDialog(null , "Successfully connected to "  + databaseField.getText() + "!!" ,
                        "Connexion successful", JOptionPane.INFORMATION_MESSAGE);
                MainControl.setConnected(true);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null ,ex.getMessage() ,"Connexion error", JOptionPane.ERROR_MESSAGE);
                MainControl.setConnected(false);
            }
        }
    }
}
