package com.company.View.CustomPanels;

import javax.swing.*;

public class ServiceManagement extends JTabbedPane {
    private ServiceResearchPanel serviceResearchPanel = new ServiceResearchPanel();
    private ServiceUpdatePanel serviceUpdatePanel=new ServiceUpdatePanel();


    public ServiceManagement()
    {

        this.add(serviceResearchPanel, "Service(s) information.");
        this.add(serviceUpdatePanel, "Service(s) update");
    }
}
