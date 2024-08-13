package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection(); // 1,2,3
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement(); //4
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT empno, ename , sal , d.deptno , dname , loc   ");
			sb.append("FROM emp e JOIN dept d ON(e.deptno = d.deptno)    ");
			sb.append("WHERE ename = 'SMITH'");
			stmt.executeQuery(sb.toString()); // 5
			while (rs.next()) {  //6 
				System.out.printf("%d\t %s\t %.1f\t %d\t %s\t %s%n",
						rs.getInt("empno"), rs.getString("ename"), rs.getDate("sal"), rs.getInt("d.deptno"), 
						rs.getString("dname"), rs.getString("loc"));
				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}finally {
			DBClose.dbClose(conn,stmt, rs);
		}
		
		
		DBClose.dbClose(conn); // 7
	}

}
