
package com.example.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
	private Connection conn;
	
	public PatientDAOImpl() {
		DBConnection dbConn = new DBConnection();
		this.conn = dbConn.getConnection();  //1.2.3
	}
	
	@Override
	public boolean createPatient(PatientVO p) throws SQLException{
		Statement stmt = this.conn.createStatement();  //4.
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO Patient ");
		sb.append("VALUES (" + p.getNumber() + ", '" + p.getCode() + "', ");
		sb.append(p.getDays() + ", " + p.getAge() + ", '" + p.getDept() + "', ");
		sb.append(p.getOperFee() + ", " + p.getHospitalFee() + ", " + p.getMoney() + ")");
		System.out.println(sb.toString());
		int su = stmt.executeUpdate(sb.toString());    //5
		DBClose.dbClose(this.conn, stmt);
		return (su == 1) ? true : false;
	}

	@Override
	public PatientVO readPatient(int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PatientVO> readAllPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updatePatient(PatientVO p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePatient(int number) {
		// TODO Auto-generated method stub
		return false;
	}

}
