import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo6 {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection();  //123 
		
		String sql = "{call sp_select_emp_dept(?)}"; // 불완전한 SQL 문장 
		CallableStatement cstmt = null;
		ResultSet rs = null; 

		try {  //파라미터가 없는 
			cstmt = conn.prepareCall(sql);  //4  
			System.out.print("부서번호  : "); int deptno= scan.nextInt();
			cstmt.setInt(1, deptno);
			rs = cstmt.executeQuery();
			boolean flag = rs.next();
			if(!flag) {  //레코드가 한개도 없다면 , 부서원이 한명도 없다면 
				System.out.println("조건에 맞는 결과값이 없습니다.");
			} else { //한개라도 있다면 
				do {
					System.out.printf("%d\t  %s\t  %s\t  %s\t %n",
							rs.getInt("empno"), rs.getString("ename"), rs.getString("dname"), rs.getString("loc"));
				}while(rs.next());
			}

		} catch (SQLException ex) {
			System.out.println( "실패");
		
		}
		DBClose.dbClose(conn, cstmt, rs ); //7 
		
		
	}
}



/*
-- 부서 번호로 소속사원의 사원번호, 사원명, 부서명, 부서위치 
Delimiter //
CREATE PROCEDURE sp_select_emp_dept
(
	IN		v_deptno TINYINT
)
BEGIN
	SELECT empno, ename , dname , loc, dept.deptno
    FROM emp NATURAL JOIN dept
    WHERE deptno = v_deptno;

END
//
delimiter ; 
*/