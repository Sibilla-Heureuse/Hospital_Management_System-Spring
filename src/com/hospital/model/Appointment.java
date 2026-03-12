package com.hospital.model;

import java.sql.Timestamp;

public class Appointment {

    private int doctorId;
    private int patientId;
    private Timestamp appointmentDate;
    private String status;

    public Appointment(int doctorId,int patientId,Timestamp appointmentDate,String status){
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
        this.status = status;
    }

    public int getDoctorId(){ return doctorId; }
    public int getPatientId(){ return patientId; }
    public Timestamp getAppointmentDate(){ return appointmentDate; }
    public String getStatus(){ return status; }
}
