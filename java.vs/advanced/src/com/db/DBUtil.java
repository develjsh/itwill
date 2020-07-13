package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	//static �ʱ�ȭ ��
	static {
		//1. ����̹� �ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����!");
			e.printStackTrace();
		}		
	}
	
	public static Connection getConnection(String url, String user, String upwd) 
			throws SQLException {
		Connection con=DriverManager.getConnection(url, user, upwd);
		System.out.println("db���� ���� con="+con);
		
		return con;
	}
	
	public static Connection getConnection(String user, String upwd) 
			throws SQLException {
		String url="jdbc:oracle:thin:@DESKTOP-T2R3QU8:1521:xe";
		
		Connection con=getConnection(url, user, upwd);
		return con;
	}
	
	public static Connection getConnection() throws SQLException {
		String url="jdbc:oracle:thin:@DESKTOP-T2R3QU8:1521:xe";
		String user="javauser", upwd="javauser123";

		
		return getConnection(url, user, upwd);
	}
	
	public static void dbClose(PreparedStatement ps, Connection con) 
			throws SQLException {
		if(ps!=null) ps.close();
		if(con!=null) con.close();
	}
	
	public static void dbClose(ResultSet rs, PreparedStatement ps, 
			Connection con) 
			throws SQLException {
		if(rs!=null) rs.close();
		if(ps!=null) ps.close();
		if(con!=null) con.close();
	}
	
	
}






