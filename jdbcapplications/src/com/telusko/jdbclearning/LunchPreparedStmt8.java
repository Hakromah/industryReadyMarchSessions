package com.telusko.jdbclearning;

import java.sql.*;
import java.util.Scanner;

public class LunchPreparedStmt8 {

	public static void main(String[] args) {
		
		Connection connect = null;
		//Statement statement = null;
		PreparedStatement pstmt = null;

		try {

			// import the JdbcUtil class to get the connection
			connect = JdbcUtil.getConnection();

			String query = "INSERT INTO studentinfo(sname,sage,scity) VALUES(?,?,?)";
			pstmt = connect.prepareStatement(query);
			
			System.out.println("Please Enter the following details to be stored in DB");
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Enter Your Name:");
				String name = scan.next();
				
				System.out.println("Enter Your Age:");
				int age= scan.nextInt();
				
				System.out.println("Enter Your City:");
				String city= scan.next();
				
				pstmt.setString(1, name);
				pstmt.setInt(2, age);
				pstmt.setString(3, city); 
			}
			
			// execute query (returns boolean value) for All the CRUD Operations
			//String sql = "SELECT * FROM studentinfo";
			// String sql = "UPDATE studentinfo set sage=15 where id=1";
			// String sql = "DELETE FROM studentinfo WHERE id=3";
			
			int rowAffected= pstmt.executeUpdate();
			
			//process the result
			if (rowAffected==0) {
				System.out.println("Unable to Insert ");
			}else {
				System.out.println("Data Inserted Successfully");
			}
			

		} catch (SQLException e) {

			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("Something Went Wrong!");

		} finally {
			// Close the resources
			try {
				JdbcUtil.closeConnect(connect, pstmt);
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}

}
