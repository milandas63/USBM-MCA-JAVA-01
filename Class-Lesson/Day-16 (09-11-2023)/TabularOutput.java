package com.day16;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Vector;

public class TabularOutput {
	public Connection conn;
	public PreparedStatement pStmt;
	public ResultSet rs;
	public ResultSetMetaData rsmd;
	public Vector<Integer> vColumnLen;
	
	public TabularOutput() {
		try {
			conn = MyConnection.getConnection();
			pStmt = conn.prepareStatement("SELECT MAX(LENGTH(s.id)) AS ID, MAX(LENGTH(s.name)) AS NAME,MAX(LENGTH(s.father)) AS FATHER,MAX(LENGTH(s.gender)) AS GENDER,MAX(LENGTH(s.dob)) AS DOB,MAX(LENGTH(c.course_abbr)) AS COURSE,MAX(LENGTH(d.dept_name)) AS DEPARTMENT FROM student_info AS s LEFT JOIN course AS c ON s.course_id=c.course_id LEFT JOIN department AS d ON s.dept_id=d.dept_id");
			vColumnLen = new Vector<Integer>();
			rs = pStmt.executeQuery();
			rsmd = rs.getMetaData();
			rs.next();
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				vColumnLen.add(Integer.max(rs.getInt(i),rsmd.getColumnLabel(i).length()));
			}
			System.out.println("Total: "+vColumnLen.size()+"  "+vColumnLen);
			rs.close(); pStmt.close();

			pStmt = conn.prepareStatement("SELECT s.id AS ID,s.name AS NAME,s.father AS FATHER,s.gender AS GENDER,s.dob AS DOB,c.course_abbr AS COURSE,d.dept_name AS DEPARTMENT FROM student_info AS s LEFT JOIN course AS c ON s.course_id=c.course_id LEFT JOIN department AS d ON s.dept_id=d.dept_id");
			rs = pStmt.executeQuery();
			rsmd = rs.getMetaData();

			//	Step-5: Manipulate ResultSet
			this.divider();
			System.out.print("|");
			for(int i=1; i<=rsmd.getColumnCount(); i++) {
				System.out.print(padC(rsmd.getColumnLabel(i),vColumnLen.get(i-1))+"|");
			}
			System.out.println();
			this.divider();
			
			while(rs.next()) {
				System.out.print("|");
				for(int i=1; i<=rsmd.getColumnCount(); i++) {
					switch(rsmd.getColumnType(i)) {
					case Types.INTEGER:
					  System.out.print(padR(rs.getString(i), vColumnLen.get(i-1))+"|");
					  break;
					case Types.VARCHAR:
					  System.out.print(padL(rs.getString(i), vColumnLen.get(i-1))+"|");
					  break;
					default:
				      System.out.print(padC(rs.getString(i), vColumnLen.get(i-1))+"|");
					  break;
					}
				}
				System.out.println();
			}
			this.divider();

			rs.close(); pStmt.close(); conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void divider() throws SQLException {
		System.out.print("+");
		for(int i=0; i<vColumnLen.size(); i++) {
			System.out.print(replicate("-",(Integer)vColumnLen.get(i))+"+");
		}
		System.out.println();
	}

	public String replicate(String data, int len) {
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<len; i++) {
			buf.append(data);
		}
		return buf.toString();
	}
	
	public String padC(String data, int len) {
		data = data==null?"":data;
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<len; i++) {
			if(i%2==0) {
				buf.insert(0, " ");
			} else {
				buf.append(" ");
			}
		}
		return buf.toString();
	}

	public String padR(String data, int len) {
		data = data==null?"":data;
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<len; i++) {
			buf.insert(0, " ");
		}
		return buf.toString();
	}

	public String padL(String data, int len) {
		data = data==null?"":data;
		StringBuffer buf = new StringBuffer(data);
		for(int i=buf.length(); i<len; i++) {
			buf.append(" ");
		}
		return buf.toString();
	}

	public static void main(String[] args) {
		new TabularOutput();
	}
}
