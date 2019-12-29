package org.btm.jdbcApp;
import java.sql.*;
import java.sql.SQLException;
import java.util.Scanner;
public class LoginValidation
{
	public static void main(String[] args)
	{
	Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select username from btm.user where name=? and password=?";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name??");
		String name=sc.next();
		System.out.println("Enter password??");
		String pwd=sc.next();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=tiger");
			pstmt=con.prepareStatement(qry);
			//SET THE VALUE FOR THE PLACEHOLDER BEFORE THE EXECUTION//
			pstmt.setString(1, name);
			pstmt.setString(2, pwd);
			//EXECUTE THE SQL QUERY//
			rs=pstmt.executeQuery();
			if(rs.next())
			{
				   String uname=rs.getString(1);
				   System.out.println("Welcome "+uname);
			}
			else
			{
				System.err.println("Invalid usename/password");
			}
		 } catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();  
		}
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
