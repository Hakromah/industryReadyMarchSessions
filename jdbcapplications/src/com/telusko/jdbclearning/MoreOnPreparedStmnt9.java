package com.telusko.jdbclearning;

import java.sql.*;
import java.util.Scanner;

public class MoreOnPreparedStmnt9 {

	public static void main(String[] args) {

		Connection connect = null;
		PreparedStatement pStatement = null;

		try {

			connect = JdbcUtil.getConnection();

			String sql = "UPDATE studentinfo SET sname =? WHERE id = ?";
			pStatement = connect.prepareStatement(sql);

			try (Scanner scan = new Scanner(System.in)) {

				System.out.println("Please Enter The Information that needs to be Updated");
				System.out.println("Please kindly enter your id: ");
				int id = scan.nextInt();

				System.out.println("Enter your name to be updated");
				String name = scan.next();

				pStatement.setString(1, name);
				pStatement.setInt(2, id);

				int rowAffected = pStatement.executeUpdate();

				if (rowAffected == 0) {

					System.out.println("Unable to Update the Data");
				} else {

					System.out.println("Data  Updated Successfully!");
				}

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} catch (Exception e) {

			e.printStackTrace();
		} finally {

			try {
				JdbcUtil.closeConnect(connect, pStatement);
			} catch (SQLException e) {

				e.printStackTrace();
			}

		}

	}

}
