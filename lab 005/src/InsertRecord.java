/*
    Title:
        Insert Record

    Date modified; Author(s); Modification details
        2022-02-21; abhinna; Created the program
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class InsertRecord {
    Connection connection;
    Statement statement;

    public InsertRecord() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");
            statement = connection.createStatement();

            statement.executeUpdate("INSERT INTO students VALUES (1, 101, 'Ram', 89.21)");
            statement.executeUpdate("INSERT INTO students VALUES (2, 201, 'Shyam', 65.23)");
            statement.executeUpdate("INSERT INTO students VALUES (3, 202, 'Hari', 49.66)");
            statement.executeUpdate("INSERT INTO students VALUES (4, 203, 'Sita', 53.45)");
            statement.executeUpdate("INSERT INTO students VALUES (5, 103, 'Gita', 78.12)");

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new InsertRecord();
    }
}
