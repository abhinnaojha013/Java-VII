/*
    Title:
            Delete Record

    Date modified; Author(s); Modification details
        2022-02-21; abhinna; Created the program
*/

import java.sql.*;

public class DeleteRecord {
    Connection connection;
    PreparedStatement preparedStatement;

    public DeleteRecord() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");

            preparedStatement = connection.prepareStatement("DELETE FROM students WHERE id = ?");
            preparedStatement.setString(1, "1");

            int result = preparedStatement.executeUpdate();

            if (result > 0) {
                System.out.println("Success");
            }
            else {
                System.out.println("Failed");
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new DeleteRecord();
    }
}
