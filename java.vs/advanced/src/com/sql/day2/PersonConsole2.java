package com.sql.day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Scanner;

import com.db.DBUtil;
import com.person.model.PersonDAO;
import com.person.model.PersonDTO;

public class PersonConsole2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		while(true) {
			showMenu();
			
			try {
				String type=sc.nextLine();
				switch(type) {
					case "1":
						writePerson();
						break;
					case "2":
						searchByNo();
						break;
					case "3":
						searchByName();
						break;
					case "4":
						searchAll();
						break;
					case "5":
						update();
						break;
					case "6":
						delete();
						break;
					case "7":
						System.out.println("�����մϴ�.");
						System.exit(0);
					default:
						System.out.println("�߸� �Է�!");
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//while
		
	}

	private static void delete() throws NumberFormatException, SQLException {
		//1. 
		System.out.println("��ȣ �Է�!");
		String sNo = sc.nextLine();
		if(sNo==null || sNo.isEmpty()) {
			System.out.println("��ȣ�� �Է��ؾ� �մϴ�!");
			return;
		}
		
		//2. 
		PersonDAO dao = new PersonDAO();
		int cnt=dao.deletePerson(Integer.parseInt(sNo));
		
		//3. 
		String result = cnt>0? "���� ����!" : "���� ����!";
		System.out.println(result);
	}

	private static void update() throws SQLException {
		//1.
		System.out.println("��ȣ, �̸�, ��ȭ��ȣ �Է�!");
		String sNo=sc.nextLine();
		String name=sc.nextLine();
		String tel=sc.nextLine();
		if(sNo==null || sNo.isEmpty()) {
			System.out.println("������ ��ȣ�� �Է��ؾ� �մϴ�!!");
			return;
		}
		
		//2.
		PersonDAO dao = new PersonDAO();
		PersonDTO dto = new PersonDTO();
		dto.setName(name);
		dto.setNo(Integer.parseInt(sNo));
		dto.setTel(tel);
		int cnt=dao.updatePerson(dto);
		
		//3.
		String result="";
		if(cnt>0) {
			result="���� ����!";
		}else {
			result="���� ����!";
		}
		
		System.out.println(result);
	}

	private static void searchByName() throws SQLException {
		//1.
		System.out.println("�̸� �Է�!");
		String name = sc.nextLine();
		
		//2.
		PersonDAO dao = new PersonDAO();
		ArrayList<PersonDTO> list = dao.selectByName(name);
		
		//3.
		if(list==null || list.isEmpty()) {
			System.out.println("�ش� �����Ͱ� �������� �ʽ��ϴ�!");
			return;
		}
		
		for(int i=0;i<list.size();i++) {
			PersonDTO dto=list.get(i);
			
			System.out.println(dto.getNo()+"\t" + dto.getName()
				+"\t" + dto.getTel()+"\t" + dto.getRegdate());
		}//for
		
	}

	private static void searchByNo() throws NumberFormatException, SQLException {
		//1. ����� �Է¹ޱ�
		System.out.println("��ȣ �Է�!");
		String sNo = sc.nextLine();
		
		//2. db�۾�
		PersonDAO dao = new PersonDAO();
		PersonDTO dto = dao.selectByNo(Integer.parseInt(sNo));
		
		//3. ���ó��(ȭ��ó��)
		System.out.println("�̸�:"+ dto.getName());
		System.out.println("��ȭ��ȣ:"+ dto.getTel());
		System.out.println("�����:"+ dto.getRegdate()+"\n");
	}

	private static void searchAll() throws SQLException {
		//1.		
		//2.
		PersonDAO dao = new PersonDAO();
		ArrayList<PersonDTO> list =dao.selectAll();
		
		//3.
		for(int i=0;i<list.size();i++) {
			PersonDTO dto=list.get(i);
			
			System.out.println(dto.getNo()+"\t"+dto.getName()
				+"\t"+dto.getTel()+"\t"+ dto.getRegdate());		
		}//for
		
	}

	private static void writePerson() throws SQLException {
		//1. ����� �Է¹ޱ�
		System.out.println("�̸�, ��ȭ��ȣ �Է��ϼ���");
		String name=sc.nextLine();
		String tel=sc.nextLine();
		
		//2. db�۾�
		PersonDAO dao = new PersonDAO();
		PersonDTO dto= new PersonDTO();
		dto.setName(name);
		dto.setTel(tel);
		int cnt=dao.insertPerson(dto);
		
		//3. ȭ�� ó��(��� ó��)
		String result=cnt>0? "�Է� ����!":"�Է� ����!";
		System.out.println(result);
	}

	
	private static void showMenu() {
		System.out.println("--------------------------Main Menu----------------------");
		System.out.println("1.��� 2.�˻�(��ȣ��) 3.�˻�(�̸�����) 4.��ü��ȸ 5.���� 6.���� 7.����");
		System.out.println("-------------------------------------------------------------");
	}

}
