package mysql_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBConn {
	// DB Connect �Ҷ����� �ߺ��Ǵ°� �����Ƿ� ����
	
	// ����̺� �ε�
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// ��ӹ޾Ƽ� ���Բ� �Ϸ��� protected ����, �׳� ���Բ� �Ϸ��� public
	// ����
	protected Connection conn;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	protected String sql = null;
	protected final String URL = "jdbc:mysql://@127.0.0.1/multi";
	protected final String DB_ID = "root";
	protected final String DB_PW = "root1234";
	
	// DB ����
	protected void getConn() {
		try {
			conn = DriverManager.getConnection(URL, DB_ID, DB_PW);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// DB �ݱ�
	protected void getClose() {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}