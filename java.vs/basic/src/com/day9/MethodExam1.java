package com.day9;

import java.util.Scanner;

public class MethodExam1 {
	
	public static int larger(int a, int b){
		int result=0;
		
		if (a>b){
			result=a;
		}else{
			result=b;
		}
		
		return result;
	}

	public static int remainder(int a, int b){
		int c = a % b;
		
		return c;
	}

	public static void main(String[] args) {
		//1)
		int num=larger(10, 20);
		
		//2)
		int n1=10, n2=5;
		num=larger(n1, n2);
		
		//3)
		System.out.println("�� ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();		
		n2 = sc.nextInt();

		num=larger(n1, n2);

		System.out.println(n1+", "+n2+"�� �� ū���� "+ num+"\n");

		while(true)	{
			System.out.println("�� ���� �Է��ϼ���");
			int x = sc.nextInt();		
			int y = sc.nextInt();
			
			if (x==0 || y==0)	break;

			int value = remainder(x, y); 
			
			System.out.println("������ ���� ��� : " + x 
					+ " % " + y +" = " + value);
		}//while

		sc.close();
	}
}
