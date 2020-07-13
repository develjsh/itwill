package com.sql.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExecuteTest {

	public static void main(String[] args) {
		//table, sequence �����

		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			//2.
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", pwd="javauser123";			
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����!");
			
			//3.
			String sql="create table pd2("
				+ "no	number	primary key,"	
				+ "pdname	varchar2(50),"	
				+ "price	number,"	
				+ "regdate	date default sysdate"
				+ ")";	
			ps=con.prepareStatement(sql);
			
			//4. 
			boolean bool=ps.execute();
			//=> select�� ���� true�� ����, �������� false�� ����
			
			System.out.println("table ���� ���� ��� bool="+bool);
			
			sql="create sequence pd2_seq"
				+" start with 1"	
				+" increment by 1"	
				+" nocache";
			
			ps=con.prepareStatement(sql);
			
			bool=ps.execute();			
			
			System.out.println("sequence���� ��� bool="+bool);
			System.out.println("table, sequence�� ������!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
