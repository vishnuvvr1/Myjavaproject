package Abstract;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class StudentDatabase {
    private static final String URL = "jdbc:mysql://localhost/studentdb";
    private static final String USERNAME = "your_vishnu8919209082123456789@123";
    private static final String PASSWORD = "your_vishnu8919209082123456789@123";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            // Insert a new student record
            insertStudent(connection, "John", "Doe", new Date(), "123 Main St", 3.8);

            // Retrieve and display student records
            retrieveStudents(connection);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertStudent(Connection connection, String firstName, String lastName, Date dob, String address, double gp)
            throws SQLException {
        String insertQuery = "INSERT INTO students (first_name, last_name, dob, address, gp) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, firstName);
        preparedStatement.setString(2, lastName);
        preparedStatement.setDate(3, new java.sql.Date(dob.getTime()));
        preparedStatement.setString(4, address);
        preparedStatement.setDouble(5, gp);

        int rowsAffected = preparedStatement.executeUpdate();
        if (rowsAffected > 0) {
            System.out.println("Student record inserted successfully.");
        }
    }

    public static void retrieveStudents(Connection connection) throws SQLException {
        String retrieveQuery = "SELECT * FROM students";
        PreparedStatement preparedStatement = connection.prepareStatement(retrieveQuery);

        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("First Name: " + resultSet.getString("first_name"));
            System.out.println("Last Name: " + resultSet.getString("last_name"));
            System.out.println("DOB: " + resultSet.getDate("dob"));
            System.out.println("Address: " + resultSet.getString("address"));
            System.out.println("GP: " + resultSet.getDouble("gp"));
            System.out.println();
        }
    }
}

