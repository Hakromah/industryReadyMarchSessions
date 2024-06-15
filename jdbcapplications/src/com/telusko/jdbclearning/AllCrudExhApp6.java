package com.telusko.jdbclearning;

import java.sql.*;

public class AllCrudExhApp6 {

	public static void main(String[] args) {
		// ==> execute() method returns boolean value and
		// we can do all the Crude Operations using execute() method

		Connection connect = null;
		Statement statement = null;

		try {
			// Load and Register the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection

			String url = "jdbc:mysql://localhost:3306/jdbclearning";
			String username = "root";
			String password = "M.root1847";
			connect = DriverManager.getConnection(url, username, password);

			// Creating statement
			statement = connect.createStatement();

			// execute query (returns boolean value) for All the CRUD Operations

			String sql = "SELECT * FROM studentinfo";
			// String sql = "INSERT INTO studentinfo(sname, sage, scity)
			// VALUES('Ansou',19,'Ankara')";
			// String sql = "UPDATE studentinfo set sage=15 where id=1";
			// String sql = "DELETE FROM studentinfo WHERE id=3";

			boolean status = statement.execute(sql);// ***!!!

			if (status) {

				// Select
				System.out.println("If Block");
				ResultSet rs = statement.getResultSet();
				while (rs.next()) {
					System.out
							.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getString(4));
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

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Something Went Wrong!");

		} finally {
			// Close the resources
			try {
				statement.close();
				connect.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}

}
