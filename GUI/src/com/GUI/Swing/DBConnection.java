package com.GUI.Swing;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection connection;

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");
            System.out.println("Connection success");
        } catch (Exception exception) {
            System.out.println("Connection error: " + exception);
        }
    }

//    public static void main(String[] args) {
//        new com.GUI.Swing.DBConnection();
//    }
}
