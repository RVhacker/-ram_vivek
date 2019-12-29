package org.btm.jdbcApp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Preparedstmt 
{
	public static void main(String[] args)
	
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
