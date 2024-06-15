package com.telusko.jdbclearning;

import java.sql.*;

public class JdbcUtil {

	// All the common operations will be done in this JdbcUtil class

	static {

		try {

			// Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {

		// Establish the connection
		String url = "jdbc:mysql://localhost:3306/jdbclearning";
		String username = "root";
		String password = "M.root1847";
		return DriverManager.getConnection(url, username, password);
	}

	public static void closeConnect(Connection connect, Statement statement) throws SQLException {
		statement.close();
		connect.close();
	}

}
