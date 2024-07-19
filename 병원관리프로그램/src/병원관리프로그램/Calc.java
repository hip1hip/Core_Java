package 병원관리프로그램;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Calc {
	
	private List<Patient> patients;
	private Patient patient;
	
	public Calc(List<Patient> patients) {
		this.patients = patients;
	}
	
    private String getDepartmentName(String code) {
        switch (code) {
            case "MI":
                return "외과";
            case "NI":
                return "내과";
            case "SI":
                return "피부과";
            case "TI":
                return "소아과";
            case "VI":
                return "산부인과";
            case "WI":
                return "비뇨기과";
            default:
                return "Unknown Department";
        }
    }
	
    public void calc() {
    	for (Patient partient : patients) {
    		int age = partient.getAge();
    		int examPrice = age < 10 ? 7000 : 
    							age < 20 ? 5000 :
    								age < 30 ? 8000: 
    									age < 40 ? 7000:
    										age < 50 ? 4500 : 2300;
    		}
    	
    	
		int hosDate = patient.getHosDate();
    	double rate = hosDate < 10 ? 1.00 :
    					hosDate < 15 ? 0.85 : 
    						hosDate < 30 ? 0.80 : 
    							hosDate < 100 ? 0.72 : 0.68;
    	
    	int dayPrice = hosDate <= 3 ? 30000 : 25000;
    	int totalHosPrice  = dayPrice * hosDate;
    	double hosPrice = totalHosPrice  * rate;
    	double totalPrice = examPrice + hosPrice;
    	patient.setDepartment(getDepartmentName(patient.getCode()));
    	patient.setExamPrice(examPrice);
    	patient.setHosPrice(hosPrice);
    	patient.setTotalPrice(totalPrice);
    }
    
	public void quickSort() {
		Collections.sort(this.patients, new Comparator<Patient>() {

			@Override
			public int compare(Patient front, Patient back) {  // 내림차순, 오름차순 계산
				return back.getPatientNum() - front.getPatientNum();
			}
			
		});
		
	}
			
		
	}
		

