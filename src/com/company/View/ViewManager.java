package com.company.View;

import com.company.View.CustomPanels.ConnexionPanel;
import com.company.View.CustomPanels.DoctorManagement;
import com.company.View.CustomPanels.NurseManagementPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ViewManager extends JFrame {

    private JTabbedPane tabbedPane = new JTabbedPane();
    private ConnexionPanel connexionPanel = new ConnexionPanel();
    private NurseManagementPanel  nurseManagementPanel = new NurseManagementPanel();
    private DoctorManagement doctorManagement = new DoctorManagement();




    public ViewManager()
    {

        tabbedPane.add(connexionPanel);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        setTabbedPanelSize(0, "Connexion");


        tabbedPane.add(doctorManagement);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        setTabbedPanelSize(1, "Doctors management");

        tabbedPane.add(nurseManagementPanel);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        setTabbedPanelSize(2, "Nurses management");




        tabbedPane.setTabPlacement(SwingConstants.LEFT);


        this.setContentPane(tabbedPane);
        this.pack();
        this.setSize(new Dimension(1600,1200));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    private void setTabbedPanelSize(int i, String text)
    {
        JLabel lab = new JLabel(text);
        lab.setPreferredSize(new Dimension(200, 30));
        tabbedPane.setTabComponentAt(i, lab);
    }


}
