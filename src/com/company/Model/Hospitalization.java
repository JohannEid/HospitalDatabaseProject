package com.company.Model;

public class Hospitalization extends Activity
{
    private Doctor doctor;

    public Hospitalization(Patient patient, Doctor doctor)
    {
        super(patient);
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
