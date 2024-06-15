package com.telusko.jdbclearning;

import java.sql.*;


public class LunchJdbcApp4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Establish the connection
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String username = "root";
		String password = "M.root1847";
		Connection connect = DriverManager.getConnection(url, username, password);

		// Create statement
		Statement statement = connect.createStatement();

		//Let's Delete the records from the database
		
		String sql = "DELETE FROM studentinfo WHERE id=1";
		int rowAffected = statement.executeUpdate(sql);
		
		// process the result
		if (rowAffected == 0) {
			System.out.println("Unable to delete data");
		} else {
			System.out.println("Data deleted successfully");
		}
		
		
		// Close the resources
		statement.close();
		connect.close();


	}

}
