package com.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import com.mysql.cj.*;

public class DBUtil {

	private static Connection conn=null;
	public static Connection getConnection()
	{
		if(conn !=null) //if there is a connection already return it, otherwise establish one 
			return conn;
		else
		{
			try
			{
				/*String url = "jdbc:sqlserver://localhost:65070"+";databaseName=JUser";
		       
				String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
				String username= "sa";
				String password= "King123";*/
				
				String url = "jdbc:mysql://localhost:3306/mydb";
			       
				String driver = "com.mysql.cj.jdbc.Driver";
				String username= "root";
				String password= "12345";
				
				
				Class.forName(driver);
				conn= DriverManager.getConnection(url,username,password);
			}
			catch (ClassNotFoundException e) 
			{
                e.printStackTrace();
            }
			catch (SQLException e) 
			{
                e.printStackTrace();
		
			}
			return conn;
		}
		
	}
}