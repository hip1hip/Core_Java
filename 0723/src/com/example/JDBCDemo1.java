package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo1 {
	private DBConnection dbconn ;
	private Connection conn;
	public JDBCDemo1() {
		this.dbconn = new DBConnection();
		this.conn = dbconn.getConnection();
	}
	public static void main(String[] args) {
		JDBCDemo1 demo  = new JDBCDemo1();
		Scanner sc = new Scanner(System.in);
		System.out.print("What's name? : ");
		String name = sc.next().toUpperCase();
		
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = demo.conn.createStatement();// 4 
			StringBuffer sb= new StringBuffer();
			sb.append("SELECT ename , sal , grade    ");
			sb.append("FROM emp , salgrade   ");
			sb.append("WHERE (sal BETWEEN losal AND hisal) AND ename = '" + name + "' " );
			rs = stmt.executeQuery(sb.toString()); //5 
			while(rs.next()) {
				System.out.printf("%s\t %.1f\t %d%n " , rs.getString("ename"), rs.getDouble("sal"), rs.getInt("grade"));
			}
			
		} catch (SQLException ex) {
			// TODO: handle exception
			System.out.println(ex.getMessage());
		}finally {
			DBClose.dbClose(demo.conn,null,null);
		}
	}
}
