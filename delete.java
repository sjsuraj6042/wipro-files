package com.excelr.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/statement", "root", "Suraj@1234");

		Statement st = conn.createStatement();
		String DeleteQuery =" Delete  from login where uname ='Sowmya'";
		int rowsaffected = st.executeUpdate(DeleteQuery);
		System.out.println("rows affected "+rowsaffected);
		conn.close();
		
		
	}

}
