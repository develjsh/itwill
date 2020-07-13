package com.sql.day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸�, ��ȭ��ȣ �Է�!");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		Connection con=null;
		Statement st = null;
		
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
			st=con.createStatement();
			
			//4.
			String sql="insert into person(no, name, tel)" + 
				"values(person_seq.nextval, '"+ name +"', '"+tel+"')";
			int cnt=st.executeUpdate(sql);
			System.out.println(cnt + "���� ���� �Էµ�!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.
			try {
				if(st!=null) st.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
