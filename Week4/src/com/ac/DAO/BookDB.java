package com.ac.DAO;
// Import Packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException
//class bookDb
public class BookDB 
{

	public static Connection getConnection() throws SQLException, ClassNotFoundException
		{
		         //Loading Driver Class
			String DriverName = "org.postgresql.Driver";
			Class.forName(DriverName);
			
		       //Execute Connection
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/BookInfo","postgres","shubham1"+"");
			
			return conn;
		
		}

	
	}
