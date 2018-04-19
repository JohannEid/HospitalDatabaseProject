package com.company.View.CustomPanels;

import javax.swing.*;

public class DoctorManagement extends JTabbedPane {
    private DoctorResearchPanel doctorResearchPanel = new DoctorResearchPanel();
    private DoctorUpdatePanel doctorUpdatePanel = new DoctorUpdatePanel();

    public DoctorManagement()
    {
        this.add(doctorResearchPanel, "Doctor(s) information.");
        this.add(doctorUpdatePanel, "Database update.");
    }
}
