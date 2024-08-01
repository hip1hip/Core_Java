package com.example;

/*
    작성자: 성기범, 신동진, 홍인표
    작성일: 2024-08-01
    작성목적: JDBC 실기 시험문제
    작성환경: Windows 10 Pro 22H2 (OS build 19045.4651)
            JDK 17.0.11
            IntelliJ IDEA 2024.1.4 (Community Edition)
            MySQL 8.0
 */

public class Calculation {

    private EmployeeVO employee;
    public Calculation(EmployeeVO employee) {
        this.employee = employee;
    }

    public void calculate() {
        String empno = employee.getEmpno();
        int set = empno.charAt(1) - '0';

        int overTime = getOverTime(employee.getNightWork());
        int familyBonus = employee.getFamilyCount() * 7000;
        int total = getSetBonusMoney(set)
                + getGradeMoney(employee.getGrade())
                + overTime + familyBonus;


        int salary = total - (int) (getSetBonusMoney(set) * 0.1);

        char dnameCode = empno.charAt(0);

        String dname = getDname(dnameCode);

        employee.setOvertime(overTime);
        employee.setFamilyBonus(familyBonus);
        employee.setTotal(total);
        employee.setSalary(salary);
        employee.setDname(dname);
        employee.setSetBonus(getSetBonusMoney(set));
    }

    private int getOverTime(int nightWork) {
        switch (nightWork) {
            case 1:
                return 1500;
            case 2:
                return 2500;
            case 3:
                return 3500;
            case 4:
                return 4500;
            default:
                return 0;
        }
    }

    private int getGradeMoney(int grade) {
        switch (grade) {
            case 1:
                return 15000;
            case 2:
                return 25000;
            case 3:
                return 35000;
            case 4:
                return 45000;
        }
        return -1;
    }

    private int getSetBonusMoney(int set) {
        switch (set) {
            case 1:
                return 900000;
            case 2:
                return 400000;
            case 3:
                return 600000;
            case 4:
                return 800000;
            case 5:
                return 300000;
            case 6:
                return 800000;
            case 7:
                return 800000;
        }
        return -1;
    }

    private String getDname(char dnameCode) {
        switch(dnameCode) {
            case 'A':
                return "영업부";
            case 'B':
                return "업무부";
            case 'C':
                return "홍보부";
            case 'D':
                return "인사부";
            case 'E':
                return "경리부";
            case 'F':
                return "판촉부";
            case 'G':
                return "총무부";
        }

        return "";
    }
}
