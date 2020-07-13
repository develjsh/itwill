package com.sql.day1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class SelectTest {

	public static void main(String[] args) {
		//person ���̺� ��ü ��ȸ
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			//1. ����̹� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����!");
			
			//2. db������ �����ϱ� ���� Connection��ü ����
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", password="javauser123";
			con=DriverManager.getConnection(url, user, password);
			System.out.println("db���� ����!");
			
			//3. sql������ ó���ϱ� ���� PreparedStatement��ü ����
			String sql="select * from person order by no desc";
			ps=con.prepareStatement(sql);
			
			//4. ����
			rs=ps.executeQuery();
			System.out.println("��ȣ\t�̸�\t��ȭ��ȣ\t\t�����\t\t��¥2");
			System.out.println("----------------------------------------------------------");
			while(rs.next()) {
				int no=rs.getInt("no");
				String name=rs.getString("name");
				//String tel=rs.getString("tel");
				String tel=rs.getString(3); //�÷� �ε��� ��뵵 ����
				Date regdate=rs.getDate("regdate");
				Timestamp regdate2=rs.getTimestamp("regdate");
				
				System.out.println(no+"\t" + name+"\t"
						+ tel+"\t" + regdate +"\t" + regdate2);				
			}			
		} catch (ClassNotFoundException e) {
			System.out.println("class not found!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("sql ����!");
			e.printStackTrace();
		}finally {
			//5. �ڿ��ݳ�, ����
			try {
				if(rs!=null) rs.close();
				if(ps!=null) ps.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}

}
