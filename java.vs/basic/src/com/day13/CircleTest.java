package com.day13;

import java.util.Scanner;

class Circle{
	//1.������� (�Ӽ�, ��������, ������)
	int radius;  //������  10  20  30
			
	//3. �޼��� (���, �ൿ)
	//���� ���� ���ϴ� ���
	public double findArea() {
		double area = radius*radius*3.14;
		return area;
	}
	
	//���� �ѷ� ���ϴ� ���
	public double findGirth() {
		double girth = 2*3.14*radius;
		return girth;
	}
	
}//class

public class CircleTest {

	public static void main(String[] args) {
		//���� ������ ���Ͻÿ�. 
		//=> findArea()�޼��� ���
		//=> static �޼��尡 �ƴϹǷ� ��ü ���� �� ��������.�޼���() �� ȣ��
		
		//1. ��ü ����
		Circle c = new Circle();
		
		//2. �޼��� ȣ��(���)
		//���� ��������� �� �Ҵ�
		c.radius=10;
		double area = c.findArea();
		
		System.out.println("���� ���� : " + area);
		
		//��������� �� ����
		int r = 20;
		c.radius=r;
		area=c.findArea();
		System.out.println("����� ������ �̿��� ���� ���� : " +  area);
		
		//����ڷκ��� ������ �Է¹޾Ƽ� ó��
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		r = sc.nextInt();
		c.radius=r;  //30
		
		area=c.findArea();
		System.out.println("�������� " + r +"�� ���� ���� : " + area);
		
		//���� �ѷ� ���ϱ�
		double girth = c.findGirth();
		System.out.println("���� �ѷ� : " + girth);
		
	}

}
