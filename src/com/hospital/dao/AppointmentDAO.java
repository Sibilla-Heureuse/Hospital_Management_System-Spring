package com.hospital.dao;

import com.hospital.database.DBConnection;
import com.hospital.model.Appointment;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppointmentDAO {

    @Autowired
    private DBConnection db;

    public void insertAppointment(Appointment appointment) throws Exception {

        String sql="INSERT INTO appointments(doctor_id,patient_id,appointment_date,status) VALUES(?,?,?,?)";

        Connection conn=db.getConnection();
        PreparedStatement ps=conn.prepareStatement(sql);

        ps.setInt(1,appointment.getDoctorId());
        ps.setInt(2,appointment.getPatientId());
        ps.setTimestamp(3,appointment.getAppointmentDate());
        ps.setString(4,appointment.getStatus());

        ps.executeUpdate();
    }
}
