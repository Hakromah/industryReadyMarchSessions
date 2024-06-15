package com.telusko.jdbclearning;

import java.sql.*;
import java.util.Scanner;

public class DeletePreparedStmnt10 {

	public static void main(String[] args) {

		Connection connect = null;
		PreparedStatement pStatement = null;

		try {

			connect = JdbcUtil.getConnection();

			String sql = "DELETE FROM studentinfo WHERE id=?";
			pStatement = connect.prepareStatement(sql);

			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Please Enter The Information that needs to be Deleted");
				System.out.println("Please kindly enter your id: ");
				int id = scan.nextInt();
				
				pStatement.setInt(1, id);


				int rowAffected = pStatement.executeUpdate();

				if (rowAffected == 0) {

					System.out.println("Unable to Delete the Data");
				} else {

					System.out.println("Data  Deleted Successfully!");
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
