package com.day10;

public class OverloadingTest {
	
	/*
	�����ε� �޼���
	- �ϳ��� Ŭ�������� ������ �̸��� ���� ���� ���� �޼��带 �����ε� �޼����� ��
	��, �Ű������� ������ �ڷ����� �޶�� ��
	*/
	
	public static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static float add(float a, float b) {
		return a+b;
	}
	
	public static float add(float a, float b, float c) {
		return a+b+c;
	}
	
	public static String add(String a, String b) {
		return a+b;
	}
	
	/*
	public static double add(int a, int b) {
		return a+b;
	}
	=> ��ȯŸ���� �ٸ����� �����ε� �޼��尡 �ƴ�
	   �Ű������� �����Ƿ� ����!	
	*/
	
	public static void main(String[] args) {
		int result=add(10, 20);
		System.out.println("�� ������ �� : " + result);
		
		float f=add(3.14f, 7.89f);
		System.out.println("�� �Ǽ��� �� : " + f);
		
		float f1=1.23f, f2=2.56f, f3=7.44f;		
		f=add(f1, f2, f3);
		System.out.println("�� �Ǽ��� �� : " + f);
		
		String s1="hello, ", s2="java!";
		String str =add(s1, s2);
		System.out.println("�� ���ڿ� ���� : " + str);
		
	}

}
