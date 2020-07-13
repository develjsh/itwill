package com.day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		/*
		 ���� catch��
		 - ���� ������ ���� ���� �ٸ� ó���� �� �� �ִ�
		 - �ڽĺ��� �θ������ �;� ��
		*/

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("�� ���� �Է�!");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			
			int res = n1/n2;
			System.out.println("������ ���:" + res);
		}catch(ArithmeticException e) {
			System.out.println("����: 0���� ������ �ȵ�!! "+ e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("����: �Է°��� �߸���! " + e.getMessage());
		}catch(Exception e) {
			System.out.println("���� �߻� : " + e.getMessage());
		}
		
		System.out.println("\n======next!!!======");
	}

}
