import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo5 {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection();  //123 
		
		String sql = "{call sp_selectDanme(?)}"; // 불완전한 SQL 문장 
		CallableStatement cstmt = null;

		try {  //파라미터가 없는 
			cstmt = conn.prepareCall(sql);  //4  
			System.out.print("부서이름 : "); String dname = scan.next();
			cstmt.setString(1, dname);
			//INOUT 은 동시에 resisterOutParameter() 도 사용해야한다.
			cstmt.registerOutParameter(1, java.sql.Types.VARCHAR);
			cstmt.execute();
			System.out.printf("%s의 위치는 %s입니다. %n" ,
					dname , cstmt.getString(1));

		} catch (SQLException ex) {
			System.out.println( "실패");
		
		}
		DBClose.dbClose(conn, cstmt); //7 
		
		
	}
}



/*
 부서 이름으로 부서 위치를 출력하는 Stored procedure
DELIMITER //
CREATE PROCEDURE sp_selectDanme
(
	INOUT v_name VARCHAR(14)
)
BEGIN
	DECLARE v_str VARCHAR(14);
	SELECT loc INTO v_str
    FROM dept
    WHERE dname = v_name;
    SET v_name := v_str;
END
//
DELIMITER ;
*/