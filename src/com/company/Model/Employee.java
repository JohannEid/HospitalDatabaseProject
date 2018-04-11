package com.company.Model;

public class Employee extends Human
{
    private int idNumber;

    public int getIdNumber()
    {
        return idNumber;
    }

    public void setIdNumber(int idNumber)
    {
        this.idNumber = idNumber;
    }

    public Employee(BasicInfo basicInfo, int idNumber)
    {
        super(basicInfo);
        this.idNumber = idNumber;
    }
}
