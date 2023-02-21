/*
    Title:
        Select all from table

    Date modified; Author(s); Modification details
        2022-02-21; abhinna; Created the program
*/

import java.sql.*;

public class SelectStudentTable {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    public SelectStudentTable() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");
                statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM students");

            while (resultSet.next()) {
                        System.out.println("Student ID: " + resultSet.getString(1));
                System.out.println("Student roll: " + resultSet.getString(2));
                System.out.println("Student name: " + resultSet.getString(3));
                System.out.println("Student marks: " + resultSet.getString(4) + "\n");

            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SelectStudentTable();
    }
}
