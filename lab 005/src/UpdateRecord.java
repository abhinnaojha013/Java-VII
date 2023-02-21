/*
    Title:
        Update record

    Date modified; Author(s); Modification details
        2022-02-21; abhinna; Created the program
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecord {
    Connection connection;
    PreparedStatement preparedStatement;

    public UpdateRecord() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");

            preparedStatement = connection.prepareStatement("UPDATE students SET roll = ?, name = ?, marks = ? WHERE id = ?");
            preparedStatement.setString(1, "103");
            preparedStatement.setString(2, "Rama");
            preparedStatement.setString(3, "84");
            preparedStatement.setString(4, "1");


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
        new UpdateRecord();
    }
}
