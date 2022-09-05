package com.example;

import java.sql.*;

public class DBConnection {

    static String db_url = "jdbc:mariadb://localhost";
    static String username = System.getenv("DATABASE_USER");
    static String password = System.getenv("DATABASE_PASS");

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(db_url, username, password);
            Statement stmt = conn.createStatement();
            stmt.executeQuery("CREATE DATABASE IF NOT EXISTS projects;");
            stmt.executeQuery("USE projects;");
            stmt.executeQuery("CREATE TABLE IF NOT EXISTS events;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}