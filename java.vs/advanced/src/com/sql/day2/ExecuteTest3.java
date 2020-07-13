package com.sql.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class ExecuteTest3 {

	public static void main(String[] args) {
		//select - execute() �̿�
		
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			//2. con
			String url="jdbc:oracle:thin:@DESKTOP-25B9RCN:1521:xe";
			String user="javauser", pwd="javauser123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����");
			
			//3. ps
			String sql="select * from person order by no desc";			
			ps=con.prepareStatement(sql);
			
			//4. exec
			boolean bool=ps.execute();
			System.out.println("select ��� bool="+bool);
			
			if(bool) {
				rs=ps.getResultSet();
				while(rs.next()) {
					int no=rs.getInt(1);
					String name=rs.getString(2);
					String tel=rs.getString(3);
					Timestamp regdate=rs.getTimestamp(4);
					
					System.out.println(no+"\t"+name+"\t"+tel+"\t"+regdate);
				}
			}//if
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(ps!=null)ps.close();
				if(con!=null)con.close();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

}
