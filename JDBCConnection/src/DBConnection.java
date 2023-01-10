import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement;
        ResultSet resultSet;

        try {
//            load driver
            Class.forName("com.mysql.jdbc.Driver");

//            use cj one if the above does not work as the above one may be deprecated
            // Class.forName("com.mysql.cj.jdbc.Driver");

//            connect with database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_student_db", "root", "");

            System.out.println("Connection success");
        } catch (Exception exception) {
            //some exception

            System.out.println("Connection failure. \nReason: " + exception);
        }

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Student");
            System.out.print("id\tname\troll");
            while (resultSet.next()) {
                System.out.print("\n" + resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getString(3));
            }       
        } catch (Exception exception) {
            System.out.println("Error");
        }
    }
}
