/*
    Title:
            Transaction Processing

    Date modified; Author(s); Modification details
        2022-02-21; abhinna; Created the program
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransactionProcessing {
    Connection connection;
    public TransactionProcessing() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");

            connection.setAutoCommit(false);

            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO students VALUES (11, 301, 'Rajesh', 56.66)");
            statement.executeUpdate("INSERT INTO students VALUES (12, 312, 'Hritik', 80.33)");
            statement.executeUpdate("INSERT INTO students VALUES (13, 313, 'Daniel', 92.34)");

            // execute batch
            statement.executeBatch();

            connection.commit();;
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new TransactionProcessing();
    }
}
