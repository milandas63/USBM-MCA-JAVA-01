package com.day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	public static Connection conn;
	
	static {
		try {
			Class.forName("org.gjt.mm.mysql.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usbm_mca", "root", "");
		} catch(ClassNotFoundException e) {
		} catch(SQLException e) {
		}
	}

	public static Connection getConnection() throws SQLException {
		if(conn==null) throw new SQLException();
		return conn;
	}
}
