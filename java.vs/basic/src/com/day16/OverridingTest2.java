package com.day16;

class Shape{
	public void draw() {
		System.out.println("������ �׸��� �޼���!");
	}
}//class

class Triangle extends Shape{
	/*
	 �������̵� �޼����� ����
	 - �θ��� ����ο� ������ ��ġ�ؾ� ��
	 (�޼����̸�, �Ű�����, ��ȯŸ��)
	 
	 - ���� �����ڴ� ���ų� �� �о����� ��
	 ��) �θ� Ŭ������ �޼��尡 default���
	 	�ڽ��� �������̵� �޼���� default, protected, public �̾�� ��
	 
	 - ���ܴ� ���ų� �� ���� �����ؾ� �� 
	 */
	public void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
	}
}//class

public class OverridingTest2 {
	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.draw();
		
		Triangle tr = new Triangle();
		tr.draw();
		
		Shape sh2 = new Triangle();
		sh2.draw(); 
	}
}
