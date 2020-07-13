package com.day18;

class Parent{
	public void showInfo() {
		System.out.println("�θ��� showInfo()�޼���!");
	}
	
	public void parentFunc() {
		System.out.println("�θ��� parentFunc �޼���");
	}
}//class

class Child extends Parent{
	public void showInfo() {
		System.out.println("�ڽ��� �������̵� �޼���!!");
	}
	
	public void childFunc() {
		System.out.println("�ڽ� ���� �޼���!!!!!");
	}
}//class

public class PolymoTest1 {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.showInfo();
		p.parentFunc();
		
		Child ch = new Child();
		ch.showInfo();
		ch.childFunc();
		ch.parentFunc();
		
		Parent p2 = new Child(); //������ �̿�
		p2.showInfo(); //�ڽ��� �������̵� �޼��� ȣ��
		p2.parentFunc(); //�θ��� ���������� �θ��� �޼��常 ȣ�� ����
		//p2.childFunc(); //error: �ڽ� ���� �޼���� ȣ�� �Ұ�
		/*
		 ������(Polymorphism) - ���� ���� ���¸� ���� �� �ִ� �ɷ�
		 - �θ��� ���������� �ڽ��� �ν��Ͻ��� ������ �� �ֵ��� �����ν�
		 	�������� ������
		 - �̶� �θ��� ���������δ� �θ��� ����� ���� ����
		   ������ �ڽĿ��� �������̵� �ߴٸ� �ڽ��� �������̵� �޼��尡 ȣ���!!!
		   
		   �θ�  �������� = new �ڽ�();
		  => �θ��� ���������� �ڽ��� �������̵� �޼��尡 ȣ��� 		   	
		 */
	}

}
