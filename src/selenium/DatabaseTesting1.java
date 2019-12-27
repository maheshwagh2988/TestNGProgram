package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseTesting1 {
	
	public static String DB_URL = "jdbc:mysql://localhost:3306/user";
	public static String DB_USR = "root";
	public static String DB_PASSWORD = "swapnil";
	
	public static void main (String args[]) throws Exception{
		
		//Register the driver
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		
		/*Another way of registering driver
		String dbClass = "com.mysql.jdbc.Driver";
		Class.forName(dbClass);*/
		
		//Establish Connection
		Connection con = DriverManager.getConnection(DB_URL, DB_USR, DB_PASSWORD);
		
		//Create SQL Statement
		Statement stmt = con.createStatement();
		
		//SQL Query
		String query = "select * from userinfo";
		
		//Execute the stmt
		ResultSet res = stmt.executeQuery(query);
		
		//Retrieve from ResultSet and display the column data
		while(res.next()){
			System.out.print(res.getString(1));
			System.out.print("\t" + res.getString(2));
			System.out.print("\t" + res.getString(3));
			System.out.println("\t" + res.getString(4));			
		}
		
	}

}
