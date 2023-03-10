package mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectTest {

	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs = null;
	
	static { // 생성자메소드 보다 먼저 실행
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. Driver 연결
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public SelectTest() {
		
	}
	
	public void start() {
		try {
			// 2. DB연결
			conn = DriverManager.getConnection("jdbc:mysql://@localhost/multi","root","root1234");
			
			String sql = "select mem_id, username, depart, phone, email, date_format(writedate, '%Y-%m-%d') writedate "
					+ "from member order by username asc";
			
			// Statement 생성
			pstmt = conn.prepareStatement(sql);
			
			// 4. 실행
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int mem_id = rs.getInt(1); // rs.getInt('mem_id') 쳐도 무방
				String username = rs.getString(2);
				String depart = rs.getString(3);
				String phone = rs.getString(4);
				String email = rs.getString(5);
				String writedate = rs.getString(6);
				System.out.printf("%-8d %-10s %-10s %-15s %-20s %-20s\n", mem_id, username, depart, phone, email, writedate);
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
//	public static void main(String[] args) {
//		new SelectTest().start();
//	}
}
