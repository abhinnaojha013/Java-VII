/*
    Title:
        Create table

    Date modified; Author(s); Modification details
        2022-02-21; abhinna; Created the program
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    Connection connection;
    Statement statement;

    public CreateTable() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");
            statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE students (id int, roll int, name varchar(100), marks float);");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new CreateTable();
    }
}
