package com.example.healthclinicapp.config;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {

    String url = "jdbc:mysql://localhost:3306/health_clinic_db";

    String user = "root";

    String pass = "dipanshu@123";

    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url,user,pass);
    }
}
