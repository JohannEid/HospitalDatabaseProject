package com.company.View.CustomPanels;

import javax.swing.*;

public class AppointmentManagement extends JTabbedPane {

    private AppointmentResearchPanel appointmentResearchPanel = new AppointmentResearchPanel();

    public AppointmentManagement()
    {
        this.add(appointmentResearchPanel, "Appointement(s) information.");
    }
}
