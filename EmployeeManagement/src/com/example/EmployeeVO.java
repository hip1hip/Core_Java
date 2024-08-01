/*
    작성자: 성기범, 신동진, 홍인표
    작성일: 2024-08-01
    작성목적: JDBC 실기 시험문제
    작성환경: Windows 10 Pro 22H2 (OS build 19045.4651)
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
            MySQL 8.0
 */
package com.example;
public class EmployeeVO {

    private String empno, ename , dname;  // 사원번호 , 사원이름 , 부서명
    private int grade , setBonus , familyBonus ; // 기본급 , 호급수당 , 가족수당
    private int  overtime , total , salary ;  // 야간수당 , 총금액 , 실수령액
    private int nightWork, familyCount ;   // 야간시간, 가족수

    public EmployeeVO(String empno, String ename, int grade, int nightWork, int familyCount) {
        this.empno = empno;
        this.ename = ename;
        this.nightWork = nightWork;
        this.familyCount = familyCount;
        this.grade = grade;
    }

    public String getEmpno() {
        return empno;
    }
    public void setEmpno(String empno) {
        this.empno = empno;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getDname() {
        return dname;
    }
    public void setDname(String dname) {
        this.dname = dname;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getSetBonus() {
        return setBonus;
    }
    public void setSetBonus(int setBonus) {
        this.setBonus = setBonus;
    }
    public int getFamilyBonus() {
        return familyBonus;
    }
    public void setFamilyBonus(int familyBonus) {
        this.familyBonus = familyBonus;
    }
    public int getOvertime() {
        return overtime;
    }
    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getNightWork() {
        return nightWork;
    }
    public void setNightWork(int nightWork) {
        this.nightWork = nightWork;
    }
    public int getFamilyCount() {
        return familyCount;
    }
    public void setFamilyCount(int familyCount) {
        this.familyCount = familyCount;
    }

    @Override
    public String toString() {
        return String.format(
                "EmployeeVO [empno=%s, ename=%s, dname=%s, grade=%s, setBonus=%s, familyBonus=%s, overtime=%s, total=%s, salary=%s, nightWork=%s, familyCount=%s]",
                empno, ename, dname, grade, setBonus, familyBonus, overtime, total, salary, nightWork, familyCount);
    }
}