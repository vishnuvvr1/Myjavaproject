package AllExamplesCollection;

import java.sql.*;

class Employee {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vvr", "vvr");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Employee");
            if (rs.next()) {
                for (int i = 1; i <= 4; i++) {
                    System.out.println(rs.getString(i));
                }
                con.close();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
