package com.day9;

import java.util.Scanner;

public class CalculateTest {
	
	public static void main(String[] args) {
		//[1]
		int result = add(10, 50);
		System.out.println("�� ���� �� : " + result);
		
		//[2]
		int n1=7, n2=9;
		int res = add(n1, n2);
		System.out.println(n1+" �� "  + n2 + " �� �� : " + res);
		
		//[3]
		Scanner sc = new Scanner(System.in);
		System.out.println("\n�� ���� �Է�!");
		int num1=sc.nextInt(); //1
		int num2=sc.nextInt(); //3
		
		int res2=add(num1, num2);
		System.out.println("\n"+num1 + " + " + num2 + " = " + res2);
		
		//[1]
		float f=subtract(3.14f, 10.2f);
		System.out.println("\n\n�� �Ǽ��� �� : " + f);
		
		//[2]
		float f1=3.14f, f2=10.2f;		
		f = subtract(f1, f2);
		System.out.println(f1 + " - " + f2 + " = " + f);
		
		//[3]
		System.out.println("\n�� �Ǽ��� �Է��ϼ���");
		float m1 = sc.nextFloat(); //3.1
		float m2 = sc.nextFloat(); //4.1
		
		f=subtract(m1, m2);
		System.out.println("\n"+m1 + " - " + m2 + " = " + f);
		
		sc.close();
	}

	public static int add(int a, int b) {
		int c = a + b;
		
		return c;
	}
	
	public static float subtract(float a, float b) {
		float c = a-b;
		
		return c;
	}
	
}
