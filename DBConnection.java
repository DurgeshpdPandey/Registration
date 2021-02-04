package com.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static Properties props=new Properties();

	static{
		new DBConnection().propsReader();
	}
//creating propsReader method  
	void propsReader(){
		String fileName="com/util/db.properties";
		InputStream inputStream=this.getClass().getClassLoader().getResourceAsStream(fileName);	
		try {
			props.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection(){
		Connection con=null;
		String dName=props.getProperty("driverClassName");
		String url=props.getProperty("url");
		String uname=props.getProperty("userName");
		String pass=props.getProperty("pass");
		
		System.out.println(dName);
		System.out.println(url);
		System.out.println(uname+" "+pass);
		
		try {
			Class.forName(dName);
			con=DriverManager.getConnection(url,uname,pass);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return con;	
	}
}
