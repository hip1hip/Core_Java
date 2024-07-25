package com.example.controller;

import java.sql.SQLException;

public class InsertController {
	private PatientDAO pDao;
	
	public InsertCintroller() {
		pDao = new PatientDAOImpl();
	}
	
	public boolean insert(PatientVO p) {
		boolean result = false;
		try {
			CalcController cc = new CalcController(p);
			result = pDao,createPatient(p);
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
