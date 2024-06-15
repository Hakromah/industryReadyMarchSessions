package com.telusko.jdbclearning;

import java.sql.*;

public class LunchJdbcApp1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connection
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String username = "root";
		String password = "M.root1847";
		Connection connect = DriverManager.getConnection(url, username, password);

		// create statement
		Statement statement = connect.createStatement();

		// execute query (connect to the database)
		String sql = "INSERT INTO studentinfo(sname,sage,scity) VALUES('',25,'Istanbul')";
		int rowAffected = statement.executeUpdate(sql);
		// process the result
		if (rowAffected == 0) {
			System.out.println("Unable to insert data");
		} else {
			System.out.println("Data inserted successfully");
		}

		// Close the resources
		statement.cancel();
		connect.close();

	}

}
