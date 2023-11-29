package StudentJdbc;

import java.sql.*;
import java.util.*;

public class Student {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vishnu", "vishnu");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter empid,empname,salary and email");
            int empid = sc.nextInt();
            String empname = sc.next();
            double salary = sc.nextDouble();
            String email = sc.next();
            PreparedStatement ps = con.prepareStatement
                    ("insert into employee values(?,?,?,?)");
            ps.setInt(1, empid);
            ps.setString(2, empname);
            ps.setDouble(3, salary);
            ps.setString(4, email);
            int i = ps.executeUpdate();
            System.out.println(i + "new table is created-----");
            con.close();


        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
