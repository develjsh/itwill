package com.day22;

import java.util.Scanner;

//����� ���� ���� Ŭ���� �����
//Exception�� ��ӹް�, Exception(String message) �����ڿ� �Ű������� �־��ָ� ��

//public Exception(String message)

class AgeException extends Exception{
	AgeException(String msg){
		super(msg); //public Exception(String message)�� msg�� �ѱ�� �� 
	}
}//

public class UserExceptionTest {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("���̸� �Է��ϼ���");
			int age = sc.nextInt();
			if(age < 0) {
				throw new AgeException("���̴� ���� �Է��ϸ� �ȵ�!");
			}
			
			System.out.println("���� : " + age);
		}catch(AgeException e) {
			System.out.println("���� �޽��� : " + e.getMessage());
		}
		
		System.out.println("\n======next!======");
	}

}
