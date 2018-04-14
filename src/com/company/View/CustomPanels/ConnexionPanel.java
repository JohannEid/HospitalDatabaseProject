package com.company.View.CustomPanels;

import com.company.Control.Connexion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ConnexionPanel extends ImagePanel
{
    private JLabel dataBaseLabel = new JLabel("Data base name");
    private JLabel userLoginLabel = new JLabel("Login");
    private JLabel userPasswordLabel= new JLabel("Password");
    private JTextField dataBaseNameText = new JTextField();
    private JTextField userLoginText = new JTextField();
    private JTextField userPasswordText = new JTextField();
    GridBagConstraints constraints  = new GridBagConstraints();
    private JButton    connectButton = new JButton("Connect");
    private Connexion conn;
    private ButtonActionListener actionListener = new ButtonActionListener();
    private JLabel titleLabel = new JLabel("Hospital data login ");
    private JPanel connexionPanel = new JPanel();

    public ConnexionPanel()
    {
        super("images/hospital.jpg");

       connexionPanel.setLayout(new GridBagLayout());
       connexionPanel.setOpaque(false);


        userPasswordText.setPreferredSize(new Dimension(200, 24));
        userLoginText.setPreferredSize(new Dimension(200, 24));
        dataBaseNameText.setPreferredSize(new Dimension(200, 24));
        connectButton.setPreferredSize(new Dimension(100, 24));
        titleLabel.setPreferredSize(new Dimension(200, 48));

        connectButton.addActionListener(actionListener);

        constraints.gridx = 0;
        constraints.gridy = 0;
        connexionPanel.add(dataBaseLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        connexionPanel.add(dataBaseNameText, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        connexionPanel.add(userLoginLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        connexionPanel.add(userLoginText, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        connexionPanel.add(userPasswordLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        connexionPanel.add(userPasswordText, constraints);
        constraints.gridx = 1;
        constraints.gridy = 4;
        connexionPanel.add(connectButton, constraints);

        this.add(connexionPanel);
    }



    class ButtonActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e)
        {
            if(e.getSource().equals(connectButton))
            {
                new ConnexionRequest().start();
            }
        }
    }

    class ConnexionRequest extends Thread
    {
        public void run()
        {
            try
            {
                conn = new Connexion(dataBaseNameText.getText(), userLoginText.getText(), userPasswordText.getText());
                JOptionPane.showMessageDialog(null , "Successfully connected to "  + dataBaseNameText.getText() + "!!" ,
                        "Connexion successful", JOptionPane.INFORMATION_MESSAGE);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null ,ex.getMessage() ,"Connexion error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
