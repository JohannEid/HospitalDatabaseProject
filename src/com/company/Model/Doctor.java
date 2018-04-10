package com.company.Model;

public class Doctor extends Employee
{
    EDoctorSpeciality speciality;

    public Doctor(BasicInfo basicInfo, int idNumber, EDoctorSpeciality speciality)
    {
        super(basicInfo, idNumber);
        this.speciality = speciality;
    }

    public EDoctorSpeciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(EDoctorSpeciality speciality) {
        this.speciality = speciality;
    }
}
