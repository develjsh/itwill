package com.day8;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		//����ڷκ��� �Է¹��� ���ڵ��� ���� ���� ���
		//����ڰ� 0�� �Է��� ������ �ݺ�
		
		Scanner sc = new Scanner(System.in);
		int num=0;
		int sum=0;
		do {	
			//1. �ݺ����ȿ��� ����ڷ� ���� ���� �Է¹ޱ�
			System.out.println("���� �Է�!");
			num=sc.nextInt();
			
			//2. Ż������ : ����ڰ� �Է��� ���� 0�̸� Ż��
			
			//3. �ݺ��� �ȿ��� �Է¹��� ���ڸ� �����Ѵ�
			sum+=num;
		}while(num!=0);
		
		//4. �ݺ��� Ż�� �� ������ ������ ���� ����Ѵ�
		System.out.println("\n�Է��� ���ڵ��� ��:" + sum);

	}

}


