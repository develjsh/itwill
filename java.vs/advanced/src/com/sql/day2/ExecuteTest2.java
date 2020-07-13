package com.sql.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExecuteTest2 {

	public static void main(String[] args) {
		//���� - execute�޼��� �̿�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��ȣ�� �Է��ϼ���");
		int no = sc.nextInt();
		
		System.out.println("�̸�, ��ȭ��ȣ�� �Է��ϼ���");
		sc.nextLine();
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		PreparedStatement ps=null;
		
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			//2. db������ �����ϱ� ���� Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
						
			//3. sql������ ó���ϱ� ���� PreparedStatement��ü ����
			String sql="update person"
					+ " set name=?,tel=?"  
					+ " where no=?";
			ps=con.prepareStatement(sql);
			
			//in parameter setting
			ps.setString(1, name);
			ps.setString(2, tel);
			ps.setInt(3, no);
			
			//4.
			boolean bool=ps.execute();
			System.out.println("update ��� bool="+bool);
			if(!bool) {
				int cnt=ps.getUpdateCount(); //ó���� ���� ���� ����
				System.out.println(cnt+"�� ���� �����Ǿ����ϴ�.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.
			try {
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
