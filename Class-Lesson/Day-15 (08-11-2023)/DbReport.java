package com.day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DbReport {
	private Connection conn;
	private PreparedStatement pStmt;
	private ResultSet rs;
	private ResultSetMetaData rsmd;

	public DbReport() {
		try {
			//	Step-1: Load and Register the driver
			Class.forName("org.gjt.mm.mysql.Driver");
			
			//	Step-2: Create Connection object
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/usbm_mca", "root", "");

			//	Step-3: Create Statement object
			pStmt = conn.prepareStatement("SELECT s.id, s.name, s.father, s.gender, s.dob, c.course_name, d.dept_name FROM student_info AS s LEFT JOIN course AS c ON s.course_id=c.course_id LEFT JOIN department AS d ON s.dept_id=d.dept_id WHERE s.dept_id>=?");
			pStmt.setInt(1, 3);
			
			//	Step-4: Create ResultSet object
			rs = pStmt.executeQuery();
			rsmd = rs.getMetaData();
			
			//	Step-5: Manipulate ResultSet
			while(rs.next()) {
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					System.out.print(rs.getString(i)+" ");
				}
				System.out.println();
			}
			
			//	Step-6: Close ResultSet, Statement & Connection objects
			rs.close();
			pStmt.close();
			conn.close();
		} catch(ClassNotFoundException e) {
			System.out.println(e);
		} catch(SQLException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new DbReport();
	}

}
