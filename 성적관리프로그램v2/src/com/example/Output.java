package com.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Output {
	private Connection conn;
	private List<StudentVO> list;
	
	public Output(List<StudentVO> list) {
		this.list = list;
		DBConnection dbconn = new DBConnection();
		this.conn = dbconn.getConnection(); //1,2,3 
		
	}
	
	void output() {
//		this.list.forEach(std -> System.out.println(std));
		Statement stmt = null;
		try {
		this.list.forEach(std -> {
			
		
		
		String sql = "INSERT INTO Student  ";
		sql += "VALUES('" + std.getHakbyn() +"','"
		
				
		stmt.excuteUpdate(sql);
		});
		
		}catch(SQLException) {
			System.out.println(ex.getMaessage());
		}
		DBClose.dbClose(this.conn.stmt); //7 6생략 
	}


