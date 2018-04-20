package com.company.View.CustomPanels;

import javax.swing.*;

public class NurseManagement extends JTabbedPane {
    private NurseResearchPanel nurseResearchPanel = new NurseResearchPanel();
    private NurseUpdatePanel nurseUpdatePanel = new NurseUpdatePanel();

    public NurseManagement()
    {
        this.add(nurseResearchPanel, "Nurse(s) information.");
        this.add(nurseUpdatePanel, "Nurse update.");
    }
}
