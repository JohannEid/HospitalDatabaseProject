package com.company.Model;

public class Service extends Infrastructure
{
    private Building hostBuilding;
    private Superviser superviser;
    private String name;

    public Service(String code, Building hostBuilding, Superviser superviser, String name)
    {
        super(code);
        this.hostBuilding = hostBuilding;
        this.superviser = superviser;
        this.name = name;
    }

    public Building getHostBuilding() {
        return hostBuilding;
    }

    public void setHostBuilding(Building hostBuilding) {
        this.hostBuilding = hostBuilding;
    }

    public Superviser getSuperviser() {
        return superviser;
    }

    public void setSuperviser(Superviser superviser) {
        this.superviser = superviser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
