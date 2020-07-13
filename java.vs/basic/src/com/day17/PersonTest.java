package com.day17;

import java.util.Scanner;

class Person{
	protected String name;
	protected int age;
	
	Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}//class

class Student extends Person{
	private String sNo;  //�й�
	
	Student(String name, int age, String sNo){
		super(name, age);
		this.sNo=sNo;
	}
	
	public String getSNo() {
		return sNo;
	}
	
	public void setSNo(String sNo) {
		this.sNo=sNo;
	}
	
	//�������̵� �޼���
	public void showInfo() {
		super.showInfo();  //�θ� �޼��� ȣ��
		System.out.println("�й� : " + sNo+"\n");
	}
}//class

public class PersonTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �̸�, ����, �й� �Է�!");
		String name=sc.nextLine();
		String age=sc.nextLine();
		String sNo=sc.nextLine();
		
		Student st = new Student(name, Integer.parseInt(age), sNo);
		st.showInfo();
		
		//������� �� ����
		st.setAge(20);
		st.setName("��浿");
		st.setSNo("20110231");
		
		//getter �̿��� ���
		System.out.println("�̸��� " + st.getName());
		System.out.println("���̴� " + st.getAge());
		System.out.println("�й��� " + st.getSNo());
		
	}

}
