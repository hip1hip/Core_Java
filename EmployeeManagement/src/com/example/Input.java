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
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Input {

    private Connection conn;

    public Input() {

        DBConnection dbConn = new DBConnection();
        this.conn = dbConn.getConnection();
    }

    public void employeeInfo() throws SQLException {

        Scanner scanner = new Scanner(System.in);
        String ioSelect = "";

        do {

            System.out.print("사원 번호: ");
            String empno = scanner.next();
            System.out.print("사원 이름: ");
            String ename = scanner.next();
            System.out.print("기본급: ");
            int grade = scanner.nextInt();
            System.out.print("야간 시간: ");
            int nightWork = scanner.nextInt();
            System.out.print("가족 수: ");
            int familyCount = scanner.nextInt();

            EmployeeVO employee = new EmployeeVO(empno, ename, grade, nightWork, familyCount);

            Calculation calculation = new Calculation(employee);
            calculation.calculate();

            createEmployee(employee);

            System.out.print("입력/출력(I/O): ");
            ioSelect = scanner.next();

        } while (ioSelect.equalsIgnoreCase("i"));

    }

    public void createEmployee(EmployeeVO employee) throws SQLException {

        String sql = "{ call sp_insert_employee(?, ?, ?, ?, ?, ?, ?, ?, ?) }";
        CallableStatement cstmt = this.conn.prepareCall(sql);
        cstmt.setString(1, employee.getEmpno());
        cstmt.setString(2, employee.getEname());
        cstmt.setString(3, employee.getDname());
        cstmt.setInt(4, employee.getGrade());
        cstmt.setInt(5, employee.getSetBonus());
        cstmt.setInt(6, employee.getFamilyBonus());
        cstmt.setInt(7, employee.getOvertime());
        cstmt.setInt(8, employee.getTotal());
        cstmt.setInt(9, employee.getSalary());

        cstmt.execute();
    }
}
