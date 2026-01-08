package basicJava.collections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectionDemo {


    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String username = "root";
        String password = "Akshay@123";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // IMPORTANT

            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
