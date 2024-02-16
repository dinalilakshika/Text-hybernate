package org.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {

    private final static String URL = "jdbc:mysql://localhost:3306/ hibernate ";
    private final static Properties props = new Properties();

    static {
        props.setProperty("user", "root");
        props.setProperty("password", "Ijse@1234");
    }

    private static DbConnection dbConnection;
    private static Connection connection;

    private DbConnection() throws SQLException {
        connection = DriverManager.getConnection(URL, props);
    }

    public static DbConnection getInstance() throws SQLException {
        if(dbConnection == null) {
            return dbConnection = new DbConnection();
        } else {
            return dbConnection;
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}

