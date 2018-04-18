package com.company.Model;

public abstract class Human extends ElementHospital
{
    private BasicInfo basicInfo;

    public Human(BasicInfo basicInfo)
    {
        this.basicInfo = basicInfo;
    }

    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public String toString()
    {
        return basicInfo.toString();
    }
}
