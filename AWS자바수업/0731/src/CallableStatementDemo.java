import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementDemo {
	public static void main(String[] args) throws SQLException {
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection();  //123 
		String sql = "{call sp_test(?,?)}"; //미완성 SQL문장 
		CallableStatement cstmt = conn.prepareCall(sql); //4 
		//IN parameter는 setXXX() 를 사용하
		// OUT paramerter 는 registerOutParameter() 를 사용한다.
		// INOUT parameter 는 setXxx() , registerOutParameter() 를 사용한다. 
		cstmt.registerOutParameter(1, java.sql.Types.DATE);
		cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);  // 완전한 sql 문장
		cstmt.executeQuery(); //5
		
		System.out.println(cstmt.getDate(1));  //now()
		System.out.println(cstmt.getString(2));
		DBClose.dbClose(conn, null); //7 
		
	}
}



/*
DELIMITER //

CREATE PROCEDURE sp_test()
BEGIN 
    SELECT NOW(), VERSION();
END
//

DELIMITER ;
*/