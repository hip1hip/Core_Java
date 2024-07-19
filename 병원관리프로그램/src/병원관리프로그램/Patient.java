package 병원관리프로그램;

import java.text.DecimalFormat;

public class Patient {

    private int patientNum;
    private String code;
    private int hosDate;
    private int age;
    private String department;
    private int examPrice;
    private double hosPrice;
    private double totalPrice;

    public Patient(int patientNum, String code, int hosDate, int age) {
        this.patientNum = patientNum;
        this.code = code;
        this.hosDate = hosDate;
        this.age = age;
    }

    public int getPatientNum() {
        return patientNum;
    }

    public void setPatientNum(int patientNum) {
        this.patientNum = patientNum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getHosDate() {
        return hosDate;
    }

    public void setHosDate(int hosDate) {
        this.hosDate = hosDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getExamPrice() {
        return examPrice;
    }

    public void setExamPrice(int examPrice) {
        this.examPrice = examPrice;
    }

    public double getHosPrice() {
        return hosPrice;
    }

    public void setHosPrice(double hosPrice) {
        this.hosPrice = hosPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");

        return String.format("%3d\t%8s\t%7d\t%7s\t%7s", patientNum, department, examPrice, df.format(hosPrice), df.format(totalPrice));
    }
}