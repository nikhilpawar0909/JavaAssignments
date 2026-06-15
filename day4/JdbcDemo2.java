package day4;

import java.sql.*;

public class JdbcDemo2 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_demo";
        String username = "root";
        String password = "@nikhil.09";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            Statement st = con.createStatement();

            String insertQuery = "INSERT INTO students(name, marks) VALUES('Aditya', 90)";
            int rows = st.executeUpdate(insertQuery);

            System.out.println(rows + " row inserted.");

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while(rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("marks")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}