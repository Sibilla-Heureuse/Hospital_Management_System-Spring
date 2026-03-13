package com.hospital.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/Hospital System";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password";   // put your password please I can't expose mine.

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}


