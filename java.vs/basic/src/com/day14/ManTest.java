package com.day14;

public class ManTest {

	public static void main(String[] args) {
		Man m = new Man();
		//m.age = 20;  //error: private
		m.setAge(20); //setter�� �̿��� ��������� �� �Ҵ�
		m.height = 180;
		
		//System.out.println("���� : " + m.age);  //error
		int age=m.getAge();
		System.out.println("���� : " + age);  
		
		System.out.println("���� : " + m.getAge());  //getter�� �̿���
												//��������� ���� �о�´�
		System.out.println("Ű : " + m.height);		

		Man2 m2 = new Man2();
		m2.setAge(25);
		System.out.println("\n\n���̴� " +  m2.getAge());
		
		//m2.age=-5;
		m2.setAge(-5);
		System.out.println("���̴� " + m2.getAge());
		
	}

}
