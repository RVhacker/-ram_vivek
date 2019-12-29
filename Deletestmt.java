package org.btm.jdbcApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletestmt
{
	public static void main(String[] args) 
	{					
		Connection con=null;
		Statement stmt=null;
		String qry="delete from btm.student where id=3";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded and Registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
			System.out.println("Connection Established with DBServer");
			stmt=con.createStatement();
			System.out.println("platform Created");
			stmt.executeUpdate(qry);
			System.out.println("Data Inserted");
		} catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	
		finally
		{
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		System.out.println("Closed all the costly resoures");
	}
	

}




