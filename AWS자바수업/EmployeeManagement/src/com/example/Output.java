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
import java.sql.*;

public class Output {

    public void selectAll() {
        Connection connection = null;
        CallableStatement callableStatement = null;

        try {
            connection = new DBConnection().getConnection();

            String sql = "{call sp_select_all_employees()}";
            callableStatement = connection.prepareCall(sql);
            ResultSet resultSet = callableStatement.executeQuery(sql);

            if (!resultSet.next()) {
                System.out.println("사원 데이터가 비어있습니다.");
                return;
            }
            System.out.println("         [출력] 사원 관리 프로그램");
            System.out.println("사원번호\t사원이름\t부서명\t기본급\t호급수당\t가족수당\t야간수당\t총금액\t실수령액");

            do {
                String empno = resultSet.getString("empno");
                String ename = resultSet.getString("ename");
                String dname = resultSet.getString("dname");
                int grade = resultSet.getInt("grade");
                int setBonus = resultSet.getInt("setbonus");
                int familyBonus = resultSet.getInt("familybonus");
                int overtime = resultSet.getInt("overtime");
                int total = resultSet.getInt("total");
                int salary = resultSet.getInt("salary");

                System.out.printf("%s\t%s\t%s\t%d\t%d\t%d\t%d\t%d\t%d",
                        empno, ename, dname, grade, setBonus, familyBonus, overtime, total, salary);
                System.out.println();
            } while (resultSet.next());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            DBClose.dbClose(connection, callableStatement);
        }
    }
}
