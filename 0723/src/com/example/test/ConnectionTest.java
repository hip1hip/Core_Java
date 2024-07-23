package com.example.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.DBClose;
import com.example.DBConnection;

class ConnectionTest {
	private Connection conn;
	
	@BeforeEach
	void init() {
		DBConnection dbconn = new DBConnection();
		this.conn = dbconn.getConnection();
	}
	@Test
	void test() {
		assertNotNull(this.conn);
	}
	@AfterEach
	void close() {
		DBClose.dbClose(this.conn);
	}

}
