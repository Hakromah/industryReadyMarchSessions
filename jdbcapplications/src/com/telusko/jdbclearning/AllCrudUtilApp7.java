package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllCrudUtilApp7 {

	public static void main(String[] args) {
		// ==> execute() method returns boolean value and
		// we can do all the Crude Operations using execute() method

		Connection connect = null;
		Statement statement = null;

		try {

			// import the JdbcUtil class to get the connection
			connect = JdbcUtil.getConnection();
			statement = connect.createStatement();

			// execute query (returns boolean value) for All the CRUD Operations
			 String sql = "SELECT * FROM studentinfo";
			//String sql = "INSERT INTO studentinfo(sname, sage, scity) VALUES('Mohamed',51,'Muğla')";
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

		} catch (SQLException e) {

			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Something Went Wrong!");

		} finally {
			// Close the resources
			try {
				JdbcUtil.closeConnect(connect, statement);
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}

}
