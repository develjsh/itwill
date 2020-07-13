package com.sql.day2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureTest2 {

	public static void main(String[] args) {
		//���ν��� - out �Ű����� �̿�
		/*
		 create or replace procedure infoProf_proc
			(v_profno   in professor.profno%type,
			v_name  out professor.name%type,
			v_pay out professor.pay%type)
			is
			begin
			    select name, pay into v_name, v_pay
			    from professor
			    where profno=v_profno;
			end; 
		  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ȣ �Է�!");
		int profno = sc.nextInt();
		
		Connection con=null;
		CallableStatement cs=null;
		try {
			//1.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("����̹� �ε� ����");
			
			//2. con
			String url="jdbc:oracle:thin:@DESKTOP-T2R3QU8:1521:xe";
			String user="hr", pwd="hr123";
			con=DriverManager.getConnection(url, user, pwd);
			System.out.println("db���� ����");
			
			//3. cs
			String sql="call infoProf_proc(?,?,?)";
			cs=con.prepareCall(sql);
			
			//in parameter setting
			cs.setInt(1, profno);
			
			//out parameter ���
			cs.registerOutParameter(2, oracle.jdbc.OracleTypes.VARCHAR);
			cs.registerOutParameter(3, oracle.jdbc.OracleTypes.NUMBER);
			
			//4. 
			boolean bool=cs.execute();
			System.out.println("���ν��� ���� ��� bool="+bool);
			
			//out parameter �� �о����
			String name=cs.getString(2);
			int pay=cs.getInt(3);
			
			System.out.println("�����̸� : " + name);
			System.out.println("�޿� : " + pay);			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//5.
			try {
				if(cs!=null) cs.close();
				if(con!=null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}









