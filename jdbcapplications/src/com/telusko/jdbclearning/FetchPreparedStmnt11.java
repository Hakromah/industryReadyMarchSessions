package com.telusko.jdbclearning;

import java.sql.*;
import java.util.Scanner;

public class FetchPreparedStmnt11 {

	public static void main(String[] args) {

		Connection connect = null;
		PreparedStatement pStatement = null;
		ResultSet rest = null;

		try {

			connect = JdbcUtil.getConnection();

			String sql = "SELECT id, sname, sage, scity FROM studentinfo WHERE id = ?";
			pStatement = connect.prepareStatement(sql);

			try (Scanner scan = new Scanner(System.in)) {

				System.out.println("Please kindly enter your id to be Retrieved");
				int id = scan.nextInt();

				pStatement.setInt(1, id);

				rest = pStatement.executeQuery();
				if (rest.next()) {

					Integer sid = rest.getInt(1);
					String sname = rest.getString(2);
					Integer sage = rest.getInt(3);
					String scity = rest.getString(4);

					System.out.println("Student id: " + sid + ", name: " + sname + ", age: " + sage + ", city: " + scity);

				} else {
					System.out.println("There is no Records with id: " + id);
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
