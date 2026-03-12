package com.hospital.model;

public class MedicalRecord {

    private int patientId;
    private int doctorId;
    private String diagnosis;
    private String treatment;

    public MedicalRecord(int patientId,int doctorId,String diagnosis,String treatment){
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }

    public int getPatientId(){ return patientId; }
    public int getDoctorId(){ return doctorId; }
    public String getDiagnosis(){ return diagnosis; }
    public String getTreatment(){ return treatment; }
}
