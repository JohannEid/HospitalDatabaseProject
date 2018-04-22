package com.company.View.CustomPanels;

import javax.swing.*;

public class HospitalisationManagement extends JTabbedPane
{
    private HospitalisationResearchPanel hospitalisationResearchPanel = new HospitalisationResearchPanel();
    private HospitalisationUpdatePanel hospitalisationUpdatePanel = new HospitalisationUpdatePanel();

    public HospitalisationManagement()
    {
        this.add(hospitalisationResearchPanel, "Hospitalisation(s) information.");
        this.add(hospitalisationUpdatePanel, "Hospitalisation update.");
    }
}
