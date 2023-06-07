package com.estacio.javasacolao.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaConnect {
	
	public static JavaConnect javaConnect;
	public static JavaConnect getInstance() {
		if(javaConnect == null) {
			javaConnect = new JavaConnect();
		}
		return javaConnect;
	}
	
	public Connection getConnection() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/bancojava?user=root&password=92586043");
	}
	public static void main(String[] args) {
		try {
			System.out.println(getInstance().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

