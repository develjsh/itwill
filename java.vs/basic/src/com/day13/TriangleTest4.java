package com.day13;

import java.util.Scanner;

public class TriangleTest4 {

	public static void main(String[] args) {
		//4. ������ Ŭ�������� �ﰢ�� ���� ���ϴ� �޼��� ���� ó��
		//(������� �̿�)
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ�, ���� �Է�!");
		int w=sc.nextInt(); //10
		int h=sc.nextInt(); //20
				
		//��ü ���� �� ��������.�޼���() �� ȣ��
		Triangle2 tr = new Triangle2(w, h); //�����ڿ� �Ű������� �Ѱ��ش�
		int area=tr.findArea();
		
		System.out.println("\n�ﰢ�� ���� : " + area);
		
		//��������� �� ����
		tr.w=100;
		tr.h=200;
		
		area=tr.findArea();
		System.out.println("����� ���� : " + area);
	}

}
