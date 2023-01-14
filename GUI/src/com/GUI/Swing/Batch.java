package com.GUI.Swing;

import java.sql.Statement;

public class Batch {
    public static void main(String[] args) throws Exception {
        DBConnection dbConnection = new DBConnection();
        dbConnection.connection.setAutoCommit(false);

        Statement statement = dbConnection.connection.createStatement();
        statement.addBatch("INSERT INTO user VALUES ('8', 'Sanjay', 'Sanjay111')");
        statement.addBatch("INSERT INTO user VALUES ('9', 'Akshay', 'Akshay111')");
        statement.addBatch("INSERT INTO user VALUES ('10', 'Suniel', 'Suniel111')");

        // execute batch
        statement.executeBatch();

        dbConnection.connection.commit();;
        dbConnection.connection.close();
    }
}
