package com.company.Model;

public abstract class Activity extends ElementHospital
{
    private Patient patient;

    public Activity (Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


}
