package com.day12;

import java.util.Scanner;

public class ArrayExam3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[8];
		String str ="";

		while(true)	{
			System.out.println("�����Ǹ��� ��ȣ(1~8)�� ���� �Ǹŷ��� �Է��ϼ���.(�������� Q)");
			str = sc.nextLine();
			
			if (str.equalsIgnoreCase("Q")) break;	
			
			int gNo = Integer.parseInt(str);
			int quantity = sc.nextInt();
			sc.nextLine();
			
			num[gNo-1] += quantity;

			System.out.println("�׷��ȣ : " + gNo 
					+ ", �Ǹŷ�:" + num[gNo-1]);
		}//while

	}

}
