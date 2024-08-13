import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableStatementDemo2 {
	public static void main(String[] args) throws SQLException {
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection();  //123 
		String sql = "{call sp_deleteDept()}"; //4
		CallableStatement cstmt = null;

		try {  //파라미터가 없는 
			cstmt = conn.prepareCall(sql);
			cstmt.execute(); //5 
			System.out.println("삭제 성공 ");
			
		} catch (SQLException ex) {
			System.out.println( "삭제 실패 ");
		
		}
		DBClose.dbClose(conn, null); //7 
		
		
	}
}



/*
DELIMITER // 
CREATE PROCEDURE sp_deleteDept()
BEGIN
	DELETE FROM dept_clone;
   
END
//
DELIMITER ;
*/