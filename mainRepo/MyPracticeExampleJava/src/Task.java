import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        try {
            // Connect to the SQLite database
            //Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","vvr","vvr");

            // Create a table to store tasks if it doesn't exist
            conn.createStatement().execute(

                    "CREATE TABLE IF NOT EXISTS Task (id INTEGER PRIMARY KEY, description TEXT)"
            );

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Task Manager");
                System.out.println("1. Add Task");
                System.out.println("2. List Tasks");
                System.out.println("3. Exit");
                System.out.print("Select an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.print("Enter task description: ");
                        String taskDescription = scanner.nextLine();
                        addTask(conn, taskDescription);
                        System.out.println("Task added.");
                        break;
                    case 2:
                        List<String> tasks = getTasks(conn);
                        System.out.println("Task List:");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                        break;
                    case 3:
                        System.out.println("Goodbye!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void addTask(Connection conn, String description) throws SQLException {
        String query = "INSERT INTO tasks (description) VALUES (?)";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, description);
            statement.executeUpdate();
        }
    }

    private static List<String> getTasks(Connection conn) throws SQLException {
        List<String> tasks = new ArrayList<>();
        String query = "SELECT description FROM tasks";
        try (PreparedStatement statement = conn.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {
            while (resultSet.next()) {
                tasks.add(resultSet.getString("description"));
            }
        }
        return tasks;
    }
}