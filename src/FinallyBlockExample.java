import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Attempt to open a database connection
            connection = DriverManager.getConnection("jdbc:myDriver:myDatabase", "username", "password");

            // Perform some database operations here
            System.out.println("Performing database operations...");

            // Simulate an exception
            throw new SQLException("Failed to update data.");

        } catch (SQLException se) {
            // Handle any SQL related exceptions here
            System.out.println("SQLException occurred: " + se.getMessage());
        } finally {
            // This block will execute whether an exception is thrown or not
            try {
                if (connection != null) {
                    connection.close();
                    System.out.println("Database connection successfully closed.");
                }
            } catch (SQLException se) {
                System.out.println("Error closing the database connection: " + se.getMessage());
            }
        }
    }
}
