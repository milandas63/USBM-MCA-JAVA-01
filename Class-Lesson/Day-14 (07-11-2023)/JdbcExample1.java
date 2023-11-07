package com.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample1 {
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	public JdbcExample1() {
		try {
			//	Step-1: Load and Register the driver
			Class.forName("org.gjt.mm.mysql.Driver");
			
			//	Step-2: Create Connection object
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usbm_mca", "root", "");

			//	Step-3: Create Statement object
			stmt = conn.createStatement();
			
			//	Step-4: Create ResultSet object
			rs = stmt.executeQuery("select * from student_info");
			
			//	Step-5: Manipulate ResultSet
			while(rs.next()) {
				System.out.print(rs.getInt("id"));
				System.out.print(" ");
				System.out.print(rs.getString("name"));
				System.out.print(" ");
				System.out.print(rs.getString("father"));
				System.out.print(" ");
				System.out.print(rs.getString("gender"));
				System.out.print(" ");
				System.out.print(rs.getDate("dob"));
				System.out.print(" ");
				System.out.print(rs.getString("course"));
				System.out.println();
				
			}
			
			//	Step-6: Close ResultSet, Statement & Connection objects
			rs.close();
			stmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			
		} catch(SQLException e) {
			
		}
	}
	
	public static void main(String[] args) {
		new JdbcExample1();
	}

}
