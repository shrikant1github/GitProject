package com.velocity.jdbc.demo1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class InsertData {

	public static void main(String[] args)throws
	ClassNotFoundException, SQLException {
 
		try {
			String sql = "insert into user(lastName,firstName,Address,City,Salary)"
					+ "values('pawar','ram','sangavi','pune',5000)";
					// load the driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					// establish the connection
					Connection con =
					DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",
					"root", "Tiv235796@");
					// create the sql statement
					java.sql.Statement statement = con.createStatement();
					// submit the sql statement to database..
					//statement.executeUpdate(sql);
					statement.execute(sql);
					System.out.println("Insertion successfully...");
					// close the resources.
					con.close();
					statement.close();
			
			
			 
		} catch (Exception e) {
			System.out.println(e);
			
		}

	}

}
