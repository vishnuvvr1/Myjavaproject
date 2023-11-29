package StudentJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Employee {
    public static void main(String[] args) {
        String connectionString = "jdbc:sqlserver://DESKTOP-G7S25US;Database=Learners;IntegratedSecurity=true";
        try {
            try (Connection connection = DriverManager.getConnection(connectionString)) {
                System.out.println("connection established. ");
            }
        } catch (SQLException e) {
            System.out.println("error connecion to the table");
            e.printStackTrace();
        }
    }
}
