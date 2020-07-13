package com.day22;

import java.util.Scanner;

class AgeException2 extends Exception{
	
	AgeException2(){
		super("���̴� ����� �����մϴ�.");
	}
}

public class AgeExceptionTest {
	public static int readAge() throws AgeException2{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�!");
		int age=sc.nextInt();
		
		if(age<0) {
			throw new AgeException2();
		}
		
		return age;
	}
	
	public static void main(String[] args) {
		try {
			int age=readAge();
			System.out.println("���� : " + age);
		}catch(AgeException2 e) {
			System.out.println("���� �޽��� : " + e.getMessage());
		}
		
		System.out.println("\n=======next!=======");
	}

	 
}
