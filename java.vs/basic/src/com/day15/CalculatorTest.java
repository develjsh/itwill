package com.day15;

import java.util.Scanner;

class Calculator{
	//static �޼���
	public static int add(int a, int b) {
		return a+b;
	}
	
	//�ν��Ͻ� �޼���
	public int subtract(int a, int b) {
		return a-b;
	}
}//class

public class CalculatorTest {

	public static void main(String[] args) {
		//static �޼��� ȣ�� - Ŭ������.�޼���()
		//�ν��Ͻ� ������ ������� Ŭ������������ ȣ�� ����
		int result = Calculator.add(10, 20);
		System.out.println("�� ���� �� : " + result);
		
		//int n = Integer.parseInt("123");
		
		//�ν��Ͻ� �޼��� ȣ�� - ��ü ���� �� ��������.�޼���()
		Calculator cal = new Calculator();
		result = cal.subtract(30, 5);
		System.out.println("�� ���� �� : " + result);
		
		//Scanner sc = new Scanner(System.in);
		//int k = sc.nextInt();
		
	}

}
