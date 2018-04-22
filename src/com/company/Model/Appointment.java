package com.company.Model;

public class Appointment extends ElementHospital
{
    private Integer doctorId;
    private Integer patientId;
    private String rotation;

    public Appointment(Integer doctorId, Integer patientId, String rotation)
    {
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.rotation = rotation;
    }

    public String toString()
    {
        String docDisplay = (doctorId != null)? " Doctor ID : " + doctorId : "";
        String patientDisplay = (patientId != null)? " Patient ID : " + patientId : "";
        String rotationDisplay = (rotation != " ")? " Rotation : " + rotation : "";

        return docDisplay + patientDisplay + rotationDisplay;
    }
}
