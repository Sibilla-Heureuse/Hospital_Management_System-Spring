package com.hospital.dao;

import com.hospital.database.DBConnection;
import com.hospital.model.MedicalRecord;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class MedicalRecordDAO {

    @Autowired
    private DBConnection db;

    public void insertRecord(MedicalRecord record) throws Exception {

        String sql="INSERT INTO medical_records(patient_id,doctor_id,diagnosis,treatment) VALUES(?,?,?,?)";

        Connection conn=db.getConnection();
        PreparedStatement ps=conn.prepareStatement(sql);

        ps.setInt(1,record.getPatientId());
        ps.setInt(2,record.getDoctorId());
        ps.setString(3,record.getDiagnosis());
        ps.setString(4,record.getTreatment());

        ps.executeUpdate();
    }
}