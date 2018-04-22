package com.company.Model;

public class Service extends ElementHospital
{
    private String hostBuilding;
    private Integer superviser;
    private String name;
    String code;


    public Service(String code, String hostBuilding, Integer superviser, String name)
    {
        this.code = code;
        this.hostBuilding = hostBuilding;
        this.superviser = superviser;
        this.name = name;
    }

    public String getHostBuilding() {
        return hostBuilding;
    }

    public void setHostBuilding(String hostBuilding)
    {
        this.hostBuilding = hostBuilding;
    }

    public Integer getSuperviser() {
        return superviser;
    }

    public void setSuperviser(Integer superviser) {
        this.superviser = superviser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        String codeDisplay = (code != null)? " code : " + code : "";
        String nameDisplay = (name != null)? " nom : " + name : "";
        String buildingDisplay = (hostBuilding != null)? " batiment : " + hostBuilding : "";
        String directorDisplay = (superviser != null)? " directeur : " + superviser : "";


        return codeDisplay + nameDisplay + buildingDisplay + directorDisplay;
    }
}