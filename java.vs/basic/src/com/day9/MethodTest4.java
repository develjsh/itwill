package com.day9;

public class MethodTest4 {
	//[1] �Ű�����(�Է°�)�� ����, ��ȯ���� ���� �޼��� ����
	public static void func1() {
		System.out.println("*******");
	}
	
	//[2] �Ű������� �ְ�, ��ȯ���� ���� �޼��� ����
	public static void func2(int count) {
		for(int i=0;i<count;i++) {
			System.out.print("*");
		}//for
		
		System.out.println();		
	}
	
	//[3] �Ű������� ����, ��ȯ���� �ִ� �޼��� ����
	public static float func3() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		
		float avg=sum/10f;
		
		return avg;
	}
	
	//[4] �Ű������� �ְ�, ��ȯ���� �ִ� �޼��� ����
	public static int add(int a, int b) {
		int c = a+b;
		
		return c;
	}
	
	public static void main(String[] args) {
		//1. �Ű������� ����, ��ȯ���� ���� �޼��� ȣ��
		func1();
		
		//2. �Ű������� �ְ�, ��ȯ���� ���� �޼��� ȣ��
		func2(5);
		
		int cnt=10;
		func2(cnt);
	
		//3. �Ű������� ����, ��ȯ���� �ִ� �޼��� ȣ��
		float average = func3();
		System.out.println("\n1~10���� �հ��� ��� : " + average);
		
		//4. �Ű������� �ְ�, ��ȯ���� �ִ� �޼��� ȣ��
		int sum = add(10, 20);
		System.out.println("\n�� ���� ��:" + sum);
		
		int n1=5, n2=7;
		int sum2 = add(n1, n2);
		System.out.println(n1 + " + " + n2 + " = " + sum2);
		
		
	}

}




