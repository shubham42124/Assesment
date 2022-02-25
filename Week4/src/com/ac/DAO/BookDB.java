package com.ac.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class BookDB 
{

	public static Connection getConnection() throws Exception
		{
		
			String DriverName = "org.postgresql.Driver";
			Class.forName(DriverName);
			
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/BookInfo","root","root"+"root");
			
			return conn;
		
		}

	
	}
