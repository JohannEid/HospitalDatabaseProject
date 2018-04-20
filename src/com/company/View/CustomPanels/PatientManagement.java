package com.company.View.CustomPanels;

import javax.swing.*;

public class PatientManagement extends JTabbedPane {
    private PatientResearchPanel patientResearchPanel = new PatientResearchPanel();
    private PatientUpdatePanel patientUpdatePanel = new PatientUpdatePanel();

    public PatientManagement()
    {
        this.add(patientResearchPanel, "Patient(s) information.");
        this.add(patientUpdatePanel, "Patient update.");
    }
}
