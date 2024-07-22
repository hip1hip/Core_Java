//7단계 
// 1. import 하자 , java.sql.*

import java.sql.*;
public class JDBCDemo {
	public static void main(String[] args) {
		//2. MySQL Driver Loading 하자. 
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Founded");
		} catch (ClassNotFoundException e) {
			System.out.println("class Not Fround");
		}
		
		//3. Memory에 loaidng 된 MySQL Driver를 이용하여 connectuion 하자 / jdbc로 시작해야하고 어느 툴로 시작되는지
		String url = "jdbc:mysql://127.0.0.1:3306/mycompany";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,"root", "mymysql");
			System.out.println("Connection Success");
		} catch (SQLException e) {
			System.out.println("Connection Failure");
		}
		
		//4. Statement 객체 생성
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//5 Statement 객체를 이용하여 Sql 실행하자.
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("SELECT now(), version()");
		} catch (SQLException e) {
			System.out.println("Query Syntax Error ");
		} // SELECT 용 
		
		//6. ResultSet의 결과를 parsing 하자 
		try {
			rs.next();
			String now = rs.getString(1);
			String version = rs.getString(2);
			System.out.println(now+ " , " + version);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} //now()    //반드시 jdbc 인덱스는 1번부터 시작됨 
		
		//7. 반드시 Close 해야 한다. 
		try {
		if (rs != null) rs.close();
		if (stmt != null) stmt.close();
		if (conn != null) conn.close();
		} catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
