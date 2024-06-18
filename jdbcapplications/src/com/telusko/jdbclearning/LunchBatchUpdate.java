package com.telusko.jdbclearning;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LunchBatchUpdate {

	// Multiple Update ==> batchUpdate()

	public static void main(String[] args) {

		Connection connect = null;
		PreparedStatement pStatement = null;

		try {


			connect = JdbcUtil.getConnection();

			String sql = "UPDATE studentinfo SET sage =? WHERE id = ?";
			pStatement = connect.prepareStatement(sql);

			pStatement.setInt(1, 44);
			pStatement.setInt(2,  1);
			pStatement.addBatch();// addBatch()

			pStatement.setInt(1, 55);
			pStatement.setInt(2, 2);
			pStatement.addBatch();// addBatch()

			pStatement.setInt(1, 33);
			pStatement.setInt(2, 4);
			pStatement.addBatch();// addBatch()

			pStatement.setInt(1, 77);
			pStatement.setInt(2, 5);
			pStatement.addBatch();// addBatch()

			pStatement.setInt(1, 99);
			pStatement.setInt(2, 6);
			pStatement.addBatch();// addBatch()

			pStatement.executeBatch();
			
			System.out.println("Check the DB to see the updated results");

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
