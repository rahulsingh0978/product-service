package com.fitcoder.productservice.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {




    public static void main(String[] args) {
        Connection conn = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            String url = "jdbc:mysql://localhost:3306/toptal";
            String user = "root";
            String password = "Admin@123";
            conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to database successfully!");

            // Perform database operations here...
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the database connection
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Database connection closed.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
