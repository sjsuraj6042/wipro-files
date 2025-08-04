package com.excelr.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/statement", "root", "Suraj@1234");

		Statement st = conn.createStatement();

		String updatequery="update signin set password='anything@gmail.com' where password='Suraj@1234'";
		int rowsaffected=st.executeUpdate(updatequery);
		System.out.println("rows affected in db" +rowsaffected);

		conn.close();
		
		
		
		
	}

}