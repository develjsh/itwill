package com.day22;

import java.util.Scanner;
class Exam1{   
	public static void main(String[] args)	{
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("�ֹι�ȣ�� �Է��ϼ���");
			String ssn = sc.nextLine();

			if (ssn.length() !=13){
				throw  new Exception("�ֹι�ȣ�� �߸� �Է��߽��ϴ�, 13�ڸ��� �Է��ϼ���");
			}

			System.out.println("\n�ֹι�ȣ : "  +ssn);
		}catch(Exception e) {
			System.out.println(e.getMessage()); 
			e.printStackTrace();
		}

		System.out.println("\n���α׷��� ���������� ����Ǿ����ϴ�!!"); 
	}
}
