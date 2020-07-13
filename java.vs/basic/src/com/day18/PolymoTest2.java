package com.day18;

import java.util.Scanner;

class Shape{
	public void draw() {
		System.out.println("�׸��� �޼���");
	}
	
	public void delete() {
		System.out.println("����� �޼���");
	}
	
	public void display() {
		System.out.println("Shape - display()�޼���!!");
	}
}//class

class Circle extends Shape{
	public void draw() {
		System.out.println("���� �׸��ϴ�.");
	}
	
	public void delete() {
		System.out.println("���� ����ϴ�.");
	}
	
	public void sayCircle() {
		System.out.println("Circle���� �޼���!");
	}
}//class

class Triangle extends Shape{
	public void draw() {
		System.out.println("�ﰢ���� �׸��ϴ�.");
	}
	
	public void delete() {
		System.out.println("�ﰢ���� ����ϴ�.");
	}
	
	public void sayTriangle() {
		System.out.println("Triangle���� �޼���!");
	}
}//class

public class PolymoTest2 {
	public static void main(String[] args) {
		//�⺻ ����
		Circle c = new Circle();
		c.draw();
		c.delete();
		c.sayCircle();
		c.display();  //�θ�κ��� ��ӹ��� �޼���
		
		//������ �̿�
		System.out.println("\n=====������ �̿�======");
		Shape sh = new Circle(); //�θ��� ���������� �ڽ� �ν��Ͻ� �Ҵ�
		sh.draw();	//�ڽ��� �������̵� �޼��� ȣ��
		sh.delete();
		sh.display(); //�θ� �޼���
		//sh.sayCircle(); //error : �ڽĸ��� �޼��� ��� �Ұ�
		
		sh = new Triangle();
		sh.draw();
		sh.delete();
		
		//����ڷκ��� ���̳� �ﰢ�� �� �����ϵ��� ó��
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n1.��, 2.�ﰢ�� �����ϼ���!");
		int type=sc.nextInt();
		
		//���� ��� �̿�
		if(type==1) {
			Circle c2 = new Circle();			
			c2.draw();
			c2.delete();
		}else if(type==2) {
			Triangle tr = new Triangle();
			tr.draw();
			tr.delete();
		}else {
			System.out.println("�߸� �Է�!");
		}
		
		//������ �̿�
		System.out.println("\n----[ ������ �̿� ]-----");
		Shape sh3 = null;
		if(type==1) {
			sh3=new Circle();
		}else if(type==2) {
			sh3=new Triangle();
		}else {
			System.out.println("�߸� �Է�!!");
			return;
		}//if
		
		sh3.draw();
		sh3.delete();
		
		//�޼���� ���� ó��
		System.out.println("\n===�޼��� ���� ȣ��===");
		Shape sh4 =createShape(type);
		if(sh4!=null) {
			sh4.draw();
			sh4.delete();
		}
		
	}//main

	//type�� ���� ���̳� �ﰢ���� �������ִ� �޼���
	public static Shape createShape(int type) {
		Shape sh3 = null;
		
		if(type==1) {
			sh3=new Circle();
		}else if(type==2) {
			sh3=new Triangle();
		}
		
		return sh3;
	}
	
}//class
