import java.sql.*;

public class LunchClassForNameEx {

	public static void main(String[] args) throws ClassNotFoundException,  IllegalAccessException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());// this also work for static block
		
		

	}

}

class Demo {
		
	//static block will always execute  class is loaded
	static {
		
		System.out.println("Static Block");
	}

	{
		System.out.println("Instance Block ==> Non Static Block");
	}
}
