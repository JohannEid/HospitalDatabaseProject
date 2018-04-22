package com.company.Control;

import com.company.View.CustomPanels.DoctorPieChart;
import com.company.View.CustomPanels.InsurancePie;
import com.company.View.CustomPanels.ServicePie;
import com.company.View.ViewManager;

public class MainControl
{
    public static Connexion conn;

    private static boolean connected;

    public static boolean isConnected() {
        return connected;
    }

    public static void setConnected(boolean isConnected)
    {
        MainControl.connected = isConnected;
        if(isConnected)
        {
            ViewManager.changeTabNavigation(true);
            ViewManager.doctorManagement.add(new DoctorPieChart(), "Doctors summary");
            ViewManager.hospitalisationManagement.add(new ServicePie(), "Service summary");
            ViewManager.patientManagement.add(new InsurancePie(), "Insurance summary");
        }
        else ViewManager.changeTabNavigation(false);
    }
}