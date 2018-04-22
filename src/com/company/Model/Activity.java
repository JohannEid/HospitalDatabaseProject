package com.company.Model;

public abstract class Activity extends ElementHospital
{
    private Integer patient;

    public Activity (Integer patient) {
        this.patient = patient;
    }

    public Integer getPatient() {
        return patient;
    }

    public void setPatient(Integer patient) {
        this.patient = patient;
    }


}
