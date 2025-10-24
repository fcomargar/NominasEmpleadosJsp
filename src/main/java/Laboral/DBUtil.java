package Laboral;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class DBUtil {
    private static final String URL = "jdbc:mysql://localhost:3306/nominas?useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new ExceptionInInitializerError("No se pudo cargar el driver JDBC de MySQL: " + e.getMessage());
        }
    }

    private DBUtil() {}


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}