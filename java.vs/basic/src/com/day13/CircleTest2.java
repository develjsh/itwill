package com.day13;

import java.util.Scanner;

class Circle2{
	//1.������� (�Ӽ�, ��������, ������)
	int radius;  //������  10  20  30
			
	//2. ������
	Circle2(int p_radius){
		radius=p_radius;				
	}
		
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

public class CircleTest2 {

	public static void main(String[] args) {
		//��ü ���� �� ��������.�޼���()�� �޼��� ȣ��
		Circle2 c = new Circle2(10); //��ü ������ ������ ȣ��κп��� �Ű�������
		//�ݵ�� �Ѱܾ� ��
		//new ������ �κ��� �����ڸ� ȣ���ϴ� �κ�
		
		double area=c.findArea();
		System.out.println("���� ���� : " + area);
		
		double girth=c.findGirth();
		System.out.println("���� �ѷ� : " + girth);
		
	}

}
