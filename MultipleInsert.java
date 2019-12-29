//Multiple insert into the Database.
package org.btm.jdbcApp;

import java.sql.*;
public class MultipleInsert 
{
	public static void main(String[] args) 
	{					
		Connection con=null;
		Statement stmt=null;
		String qry1="insert into btm.student values(1,'Vivek',68.33)";
		String qry2="insert into btm.student values(2,'Anand',66.33)";
		String qry3="insert into btm.student values(3,'Shubham',44.33)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is loaded and Registered");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
			System.out.println("Connection Established with DBServer");
			stmt=con.createStatement();
			System.out.println("platform Created");
			stmt.executeUpdate(qry1);
			stmt.executeUpdate(qry2);
			stmt.executeUpdate(qry3);
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


