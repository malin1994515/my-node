package org.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDemo {
    public static void main(String[] args) {

    }

    public static int insert() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
            preparedStatement = connection.prepareStatement("INSERT INTO test values (1, ");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
