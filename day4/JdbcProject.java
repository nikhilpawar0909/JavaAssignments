package day4;

import java.sql.*;

public class JdbcProject {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_project";
        String username = "root";
        String password = "@nikhil.09";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            // 1. INSERT
            String insertQuery =
                    "INSERT INTO student_db(name, course, fees) VALUES('Aditya', 'BCA', 45000)";
            Statement st = con.createStatement();
            st.executeUpdate(insertQuery);
            System.out.println("Student Inserted Successfully!");

            // 2. SELECT
            System.out.println("\nStudent Records:");
            ResultSet rs = st.executeQuery("SELECT * FROM student_db");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("course") + " | " +
                                rs.getDouble("fees")
                );
            }

            // 3. UPDATE
            String updateQuery =
                    "UPDATE student_db SET fees = 60000 WHERE name = 'Aditya'";

            int rows = st.executeUpdate(updateQuery);
            System.out.println("\n" + rows + " Record Updated Successfully!");

            // Updated Data
            System.out.println("\nAfter Update:");
            rs = st.executeQuery("SELECT * FROM student_db");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("course") + " | " +
                                rs.getDouble("fees")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
