package com.company.Model;

public class Employee extends Human
{
    private Integer idNumber;

    public Integer getIdNumber()
    {
        return idNumber;
    }

    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    public Employee(BasicInfo basicInfo, Integer idNumber)
    {
        super(basicInfo);
        this.idNumber = idNumber;
    }

    public String toString()
    {
        String idNumberDisplay = (idNumber != null)? " ID :" + idNumber : "";
        return super.toString() + idNumberDisplay;
    }
}
