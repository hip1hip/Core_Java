package com.example.model;

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO<PatientVO> {
	
	/**
	 * 새로운 환자를 등록한다. 이미 등록된 환자가 있다면 false를 라턴하고 , 등록애 성공하면 true 를 라턴한다 
	 * @param Patient 
	 * @return 등록하면 true , 그렇지 않으면 false
	 */
	boolean createPatient(PatientVO p) throws SQLException;
	
	/**
	 * 환자 등록번호를 입력받아서 해당 번호의 환자 한명을 리턴한다.
	 * @param 환자등록번호 
	 * @return 해당환자 1명 
	 */
	PatientVO readPatient(int number);
	
	/**
	 * 지금까지 등록된 모든환자 리스트를 반환한다.
	 * @return 환자형 리스트 
	 */
	List<PatientVO> readAllPatient();
	
	/**
	 * 수정할 환자정보를 입력받아서 수정 성공하면 true를 리턴하고 , 실퍄ㅐ하면 false를 리턴한다 
	 * @param 수정할 환자 
	 * @return 성공여부 
	 */
	boolean updatePatient(PatientVO p);
	
	/**
	 * 환자 등록번호를 입력받아서 해당 환자를 삭제한다.
	 * @param 삭제할 환자 등록번호
	 * @return 성공여부
	 */
	boolean daletPatient(int number);
}
