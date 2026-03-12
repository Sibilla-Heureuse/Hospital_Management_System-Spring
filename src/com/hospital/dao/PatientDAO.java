package com.hospital.dao;

import java.sql.PreparedStatement;


@Repository
public class PatientDAO {

    @Autowired
    private DBConnection db;

    public void insertPatient(Patient patient) throws Exception {

        String sql="INSERT INTO patients(first_name,last_name,gender,email) VALUES(?,?,?,?)";

        Connection conn=db.getConnection();
        PreparedStatement ps=conn.prepareStatement(sql);

        ps.setString(1,patient.getFirstName());
        ps.setString(2,patient.getLastName());
        ps.setString(3,patient.getGender());
        ps.setString(4,patient.getEmail());

        ps.executeUpdate();
    }
}
