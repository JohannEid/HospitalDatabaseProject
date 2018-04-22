package com.company.View;

import com.company.View.CustomPanels.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class ViewManager extends JFrame {

    private static JTabbedPane tabbedPane = new JTabbedPane();
    private ConnexionManagement connexionManagement = new ConnexionManagement();
    public static NurseManagement nurseManagementPanel = new NurseManagement();
    public static ServiceManagement serviceManagement=new ServiceManagement();
    public static DoctorManagement doctorManagement = new DoctorManagement();
    public static PatientManagement patientManagement = new PatientManagement();
    public static RoomManagement roomManagement = new RoomManagement();
    public static AppointmentManagement appointmentManagement = new AppointmentManagement();
    public static HospitalisationManagement hospitalisationManagement = new HospitalisationManagement();



    public ViewManager()
    {

        tabbedPane.add(connexionManagement);
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
        setTabbedPanelSize(0, "Connexion");


        tabbedPane.add(doctorManagement);
        tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
        setTabbedPanelSize(1, "Doctors management");
        tabbedPane.setEnabledAt(1, false);

        tabbedPane.add(nurseManagementPanel);
        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
        setTabbedPanelSize(2, "Nurses management");
        tabbedPane.setEnabledAt(2, false);

        tabbedPane.add(patientManagement);
        tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
        setTabbedPanelSize(3, "Patients management");
        tabbedPane.setEnabledAt(3, false);

        tabbedPane.add(roomManagement);
        tabbedPane.setMnemonicAt(4, KeyEvent.VK_4);
        setTabbedPanelSize(4, "Room management");
        tabbedPane.setEnabledAt(4, false);

        tabbedPane.add(hospitalisationManagement);
        tabbedPane.setMnemonicAt(5, KeyEvent.VK_4);
        setTabbedPanelSize(5, "Care management");
        tabbedPane.setEnabledAt(5, false);

        tabbedPane.add(serviceManagement);
        tabbedPane.setMnemonicAt(6, KeyEvent.VK_4);
        setTabbedPanelSize(6, "Service management");
        tabbedPane.setEnabledAt(6, false);

        tabbedPane.add(appointmentManagement);
        tabbedPane.setMnemonicAt(7, KeyEvent.VK_4);
        setTabbedPanelSize(7, "Appointment management");
        tabbedPane.setEnabledAt(7, false);





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

    public static void changeTabNavigation(boolean isEnabled)
    {
        for(int i = 1; i < tabbedPane.getTabCount(); ++i)
        {
            tabbedPane.setEnabledAt(i, isEnabled);
        }
    }


}
