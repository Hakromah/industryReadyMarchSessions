package com.telusko.jdbclearning;

import java.sql.*;

public class LunchJdbcApp5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		// Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connection
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String username = "root";
		String password = "M.root1847";
		Connection connect = DriverManager.getConnection(url, username, password);

		// Creating statement
		Statement statement = connect.createStatement();

		String sql = "SELECT * FROM studentinfo";
		// Execute query 
		boolean status = statement.execute(sql);

		if (status) {
			
			// Select
			System.out.println("If Block");
			ResultSet rs = statement.getResultSet();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3)
				 + " " + rs.getString(4));
			}
		} else {
			
			// Insert, Update, Delete
			System.out.println("Else Block");
			int rows = statement.getUpdateCount();

			if (rows == 0) {
				System.out.println("Operation Failed!");
			} else {

				System.out.println("Operation Successfull");
			}
		}

		// Select

		// process the result

		// Close the resources
		statement.close();
		connect.close();

	}

}
