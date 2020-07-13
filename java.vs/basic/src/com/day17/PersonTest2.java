package com.day17;

import java.util.Scanner;

class Person2{
	protected String name;
	protected int age;
	
	Person2(String name, int age) {
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

class Student2 extends Person2{
	protected String sNo;  //�й�
	
	Student2(String name, int age, String sNo){
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
		System.out.println("�й� : " + sNo);
	}
	
	public void study() {
		System.out.println("���θ� �մϴ�.");
	}
}//class

class Graduate extends Student2{
	private String major;
	
	Graduate(String name, int age, String sNo, String major){
		super(name, age, sNo);
		this.major=major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major=major;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + major+"\n");
	}
	
	public void writeThesis() {
		System.out.println("���� ���ϴ�.");
	}
}//class

public class PersonTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�л� �̸�, ����, �й� �Է�!");
		String name=sc.nextLine();
		String age=sc.nextLine();
		String sNo=sc.nextLine();
		
		Student2 st = new Student2(name, Integer.parseInt(age), sNo);
		st.showInfo();
		st.study();
		
		System.out.println("\n���п��� �̸�, ����, �й�, ���� �Է�!");
		name=sc.nextLine();
		age=sc.nextLine();
		sNo=sc.nextLine();
		String major=sc.nextLine();
		
		Graduate gr = new Graduate(name, Integer.parseInt(age), 
				sNo, major);
		gr.showInfo();
		gr.study();
		gr.writeThesis();
	}

}
