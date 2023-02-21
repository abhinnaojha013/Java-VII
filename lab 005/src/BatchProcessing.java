/*
    Title:
            Batch Processing

    Date modified; Author(s); Modification details
        2022-02-21; abhinna; Created the program
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessing {
    Connection connection;
    Statement statement;

    public BatchProcessing() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");

            connection.setAutoCommit(false);
            statement = connection.createStatement();

            statement.addBatch("INSERT INTO students VALUES (8, 401, 'Sanjay', 87.77)");
            statement.addBatch("INSERT INTO students VALUES (9, 411, 'Akshay', 86.99)");
            statement.addBatch("INSERT INTO students VALUES (10, 412, 'Suniel', 89.90)");

            // execute batch
            statement.executeBatch();

            connection.commit();;
            connection.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new BatchProcessing();
    }
}
