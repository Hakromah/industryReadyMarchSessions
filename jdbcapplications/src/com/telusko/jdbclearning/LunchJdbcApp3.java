package com.telusko.jdbclearning;
import java.sql.*;
public class LunchJdbcApp3 {

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

				//Let's Fetch the data from the Database
				//ResultSet is the representation of the table it will contain all the data in our DB
				String sql = "SELECT * FROM studentinfo";
				ResultSet rSet = statement.executeQuery(sql);
				
				while(rSet.next()) {
					// System.out.println(rSet.getInt("id")+" "+rSet.getString("st_name")+" "+rSet.getInt("st_age")+" "+rSet.getString("st_city"));
					// OR System.out.println(rSet.getInt(1)+" "+rSet.getString(2)+" "+rSet.getInt(3)+" "+rSet.getString(4));
					
					int id = rSet.getInt("id");
					String name = rSet.getString("sname");
					int age = rSet.getInt("sage");
					String city = rSet.getString("scity");
					
					System.out.println(id+" "+name+" "+age+" "+city);
				}
				

				// Close the resources
				rSet.close();
				statement.close();
				connect.close();

	}

}
