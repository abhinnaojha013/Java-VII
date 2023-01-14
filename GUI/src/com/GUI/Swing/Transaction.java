package com.GUI.Swing;

import java.sql.Statement;

public class Transaction {
    public static void main(String[] args) throws Exception {
        DBConnection dbConnection = new DBConnection();
        dbConnection.connection.setAutoCommit(false);

           Statement statement = dbConnection.connection.createStatement();
        statement.executeUpdate("INSERT INTO user VALUES ('11', 'Rajesh', 'Rajesh111')");
        statement.executeUpdate("INSERT INTO user VALUES ('12', 'Hritik', 'Hritik111')");
        statement.executeUpdate("INSERT INTO user VALUES ('13', 'Daniel', 'Daniel111')");

        // execute batch
        statement.executeBatch();

        dbConnection.connection.commit();;
        dbConnection.connection.close();
    }
}
