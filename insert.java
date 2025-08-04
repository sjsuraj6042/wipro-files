package com.excelr.statement;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;       
import java.sql.Statement;

public class insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Load the MySQL JDBC Driver
    	Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish a connection to the database
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/statement", "root", "Suraj@1234");

        // Create a Statement object to execute queries
        Statement st = conn.createStatement();
        
        // Execute the INSERT query to insert data into the "login" table
       st.execute("INSERT INTO signin(email_id,password,dob)VALUES('suraj19.rkl@gmail.com','Suraj@1234','2001-12-30')");
       st.execute("INSERT INTO signin(email_id,password,dob)VALUES('sushant74.rkl@gmail.com','Sushant@1234','2001-11-30')");
       st.execute("INSERT INTO signin(email_id,password,dob)VALUES('santoshi19.rkl@gmail.com','Santoshi@1234','2001-10-30')");
       st.execute("INSERT INTO signin(email_id,password,dob)VALUES('jyotshna19.rkl@gmail.com','Jyotshna@1234','2001-09-30')");
       st.execute("INSERT INTO signin(email_id,password,dob)VALUES('sejal.rkl@gmail.com','Sejal@1234','2001-08-30')");
       st.execute("INSERT INTO signin(email_id,password,dob)VALUES('laxmipriya.dkl@gmail.com','laxmipriya@1234','2001-07-30')");
        // Close the connection
        conn.close();

        // Print success message
        System.out.println("Data inserted successfully!");
    }
}
