package com.hospital.service;

import com.hospital.dao.*;
import com.hospital.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {

    @Autowired
    private DoctorDAO doctorDAO;

    @Autowired
    private PatientDAO patientDAO;

    @Autowired
    private AppointmentDAO appointmentDAO;

    @Autowired
    private MedicalRecordDAO medicalRecordDAO;

    public void saveDoctor(Doctor doctor) throws Exception{
        doctorDAO.insertDoctor(doctor);
    }

    public void savePatient(Patient patient) throws Exception{
        patientDAO.insertPatient(patient);
    }

    public void saveAppointment(Appointment appointment) throws Exception{
        appointmentDAO.insertAppointment(appointment);
    }

    public void saveRecord(MedicalRecord record) throws Exception{
        medicalRecordDAO.insertRecord(record);
    }
}
