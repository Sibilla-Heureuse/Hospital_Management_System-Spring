package com.hospital;

import com.hospital.config.AppConfig;
import com.hospital.model.*;
import com.hospital.service.HospitalService;
import java.sql.Timestamp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HospitalService service =
                context.getBean(HospitalService.class);

        Doctor doctor =
                new Doctor("John","Smith","Cardiology","john@gmail.com");

        Patient patient =
                new Patient("Alice","Brown","Female","alice@gmail.com");

        Appointment appointment =
                new Appointment(1,1,new Timestamp(System.currentTimeMillis()),"Scheduled");

        MedicalRecord record =
                new MedicalRecord(1,1,"Flu","Medication");

        service.saveDoctor(doctor);
        service.savePatient(patient);
        service.saveAppointment(appointment);
        service.saveRecord(record);

        System.out.println("Data inserted successfully!");
    }
}