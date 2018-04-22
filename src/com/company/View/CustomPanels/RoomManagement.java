package com.company.View.CustomPanels;

import javax.swing.*;

public class RoomManagement extends JTabbedPane
{
    private RoomResearchPanel roomResearchPanel = new RoomResearchPanel();
    private RoomUpdatePanel roomUpdatePanel = new RoomUpdatePanel();

    public RoomManagement()
    {
        this.add(roomResearchPanel, "Room(s) information.");
        this.add(roomUpdatePanel, "room update.");
    }
}
