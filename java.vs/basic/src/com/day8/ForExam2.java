package com.day8;

import java.util.Scanner;

public class ForExam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1=0, num2=0;
		while(true){
			System.out.println("\n�� ���� ������ �Է��ϼ���(������ ���� ������ �Է�)");
			num1 =  sc.nextInt();
			num2 =  sc.nextInt();

			if (num1==0 && num2==0) break;
			
			if(num2==0) {
				System.out.println("������ 0�̹Ƿ� ������ �����մϴ�.");
				continue;
			}//if

			System.out.println("�� : " + num1/num2 +", ������:"+num1%num2);
		}//while

	}

}
