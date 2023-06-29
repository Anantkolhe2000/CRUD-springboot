package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Myconn {

	public static Connection getConnection() {
		Connection connection=null;
     try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","password");
    	 
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		System.out.print(e.getMessage());
	}
		return connection;
		
	}
	
}
