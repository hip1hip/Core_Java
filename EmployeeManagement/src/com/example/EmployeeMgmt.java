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
import java.sql.SQLException;

public class EmployeeMgmt {
    public static void main(String[] args) throws SQLException {

        Input input = new Input();
        input.employeeInfo();

        Output output = new Output();
        output.selectAll();
    }
}
