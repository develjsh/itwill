package com.day6;

import java.util.Scanner;

public class SwitchExam1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int mymonth = sc.nextInt();

		String str="";
		switch (mymonth){
			case 1 : 
			case 2 : 
			case 3 :
				str = mymonth + "���� 1��б��Դϴ�.";
				break;
			case 4 : case 5 : case 6 : 
				str = mymonth + "���� 2��б��Դϴ�.";
				break;
			case 7 : case 8 : case 9 : 
				str = mymonth + "���� 3��б��Դϴ�.";
				break;
			case 10 : case 11 : case 12 : 
				str = mymonth + "���� 4��б��Դϴ�.";
				break;
			default :
				str = "�߸� �����߾��";
				break;
		}

		System.out.println(str);
		
		sc.close();
	}
}
