package com.company.Model;

public class Doctor extends Employee
{
    String speciality;


    public Doctor(BasicInfo basicInfo, Integer idNumber, String speciality)
    {
        super(basicInfo, idNumber);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String toString()
    {
        String specDisplay = (speciality != null)? " Speciality : " + speciality : "";
        return super.toString() +specDisplay;
    }
}
