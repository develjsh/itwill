package com.day21;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		//throw�� - ������ ���� �߻���ų �� ���
		/* �ڹ� ����ӽſ� ���� �νĵ� �� �ִ� ���� ��Ȳ�� �ƴ�����,
		���α׷��� ���ݿ� ���� �����ڰ� ������ ���ܻ�Ȳ�� ��� 
		(��: ���� �Է½� 0 ���� ���� ���� �ԷµǾ���)
		
		 throw new Exception ("���� �޽���!");
		*/

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("���� �Է�!");
			int age=sc.nextInt();
			
			if(age<0) {
				throw new Exception("���̴� ����� �����մϴ�!");
				//=> public Exception(String message)
			}
			
			System.out.println("���� : "+ age);
		}catch(Exception e) {
			System.out.println("���ܹ߻� : " + e.getMessage());
		}
		
		System.out.println("\n======next=======");
		
		
	}

}
