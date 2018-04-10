package com.company.View;

import com.company.Control.Connexion;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class ConnexionMenu extends JFrame {
    private JLabel dataBaseLabel;
    private JLabel userLoginLabel;
    private JLabel userPasswordLabel;
    private JTextField dataBaseNameText;
    private JTextField userLoginText;
    private JTextField userPasswordText;
    private ImagePanel mainPanel;
    GridBagConstraints constraints;
    private JButton connectButton;
    private Connexion conn;
    private ButtonActionListener actionListener;



    public ConnexionMenu()
    {
        BufferedImage myImage = null;
        try
        {
            myImage = ImageIO.read(getClass().getResource("com/company/hospital.jpg"));
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }


        actionListener = new ButtonActionListener();
        mainPanel = new ImagePanel(myImage);

        mainPanel.setLayout(new GridBagLayout());
        constraints = new GridBagConstraints();


        dataBaseLabel = new JLabel("Data base name");
        userLoginLabel = new JLabel("Login");
        userPasswordLabel = new JLabel("Password");

        dataBaseNameText = new JTextField();
        userLoginText = new JTextField();
        userPasswordText = new JTextField();

        connectButton = new JButton("Connect");

        userPasswordText.setPreferredSize(new Dimension(200, 24));
        userLoginText.setPreferredSize(new Dimension(200, 24));
        dataBaseNameText.setPreferredSize(new Dimension(200, 24));
        connectButton.setPreferredSize(new Dimension(100, 24));
        connectButton.addActionListener(actionListener);


        constraints.gridx = 0;
        constraints.gridy = 0;
        mainPanel.add(dataBaseLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        mainPanel.add(dataBaseNameText, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        mainPanel.add(userLoginLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        mainPanel.add(userLoginText, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        mainPanel.add(userPasswordLabel, constraints);
        constraints.gridx = 1;
        constraints.gridy = 2;
        mainPanel.add(userPasswordText, constraints);
        constraints.gridx = 1;
        constraints.gridy = 4;
        mainPanel.add(connectButton, constraints);


        this.setContentPane(mainPanel);
        this.setSize(600, 400);
        this.setVisible(true);
    }

    class ImagePanel extends JComponent {
        private Image image;

        public ImagePanel(Image image) {
            this.image = image;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
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
                        "Connexion successful", JOptionPane.OK_OPTION);

            }

            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null ,ex.getMessage() ,"Connexion error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }


}
