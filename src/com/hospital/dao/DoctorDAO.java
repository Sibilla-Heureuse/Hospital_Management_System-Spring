package com.hospital.dao;

import com.hospital.database.DBConnection;
import com.hospital.model.Doctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DoctorDAO {

    @Autowired
    private DBConnection db;

    public void insertDoctor(Doctor doctor) throws Exception {

        String sql = "INSERT INTO doctors(first_name,last_name,specialty,email) VALUES(?,?,?,?)";

        Connection conn = db.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1,doctor.getFirstName());
        ps.setString(2,doctor.getLastName());
        ps.setString(3,doctor.getSpecialty());
        ps.setString(4,doctor.getEmail());

        ps.executeUpdate();
    }
}
