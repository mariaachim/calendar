package com.example;

import java.sql.*;

public class DBConnection {

    static String dburl = "jdbc:mariadb://localhost";
    static String username = System.getenv("DATABASE_USER");
    static String password = System.getenv("DATABASE_PASS");

    static void exec(String[] args) {

    }

    static Statement createConnection(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(dburl, username, password);
            Statement stmt = conn.createStatement();
            return stmt;
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
            Statement stmt = null;
            return stmt;
        }
    }

    public static void main(String[] args) {
        Statement stmt = createConnection(args);
        try {
            stmt.executeQuery("CREATE DATABASE IF NOT EXISTS projects;");
            stmt.executeQuery("USE projects;");
            stmt.executeQuery("CREATE TABLE IF NOT EXISTS events;");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}