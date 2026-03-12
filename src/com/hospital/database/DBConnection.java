package com.hospital.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.springframework.stereotype.Component;

@Component
public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/Hospital";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
