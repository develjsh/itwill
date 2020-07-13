package com.day9;

import java.util.Scanner;

public class MethodExam3 {
	
	//��������, ������� ���ϴ� �޼���
	public static String getYear(int year){
		/*
				����
				1) 400���� ������ �������� ���� 
				�Ǵ�
				2) 4�� ������ ��������, 100���� ������ �������� ������ ����
		 */
		String result="";
		
		if (year%400==0 || (year%4==0 && year%100!=0))	{
			result="����";
		}else{
			result="���";
		}

		return result;
	}

	//Ȧ������ ¦������ ���ϴ� �޼��� �����
	public static String  getOdd(int num){
		String result = "";
		
		if(num%2==0){
			result="¦��";
		}else{
			result="Ȧ��";
		}//if

		return result;
	}

	//�ֹι�ȣ�� �̿��Ͽ� ��������, �������� ���� ���ϴ� �޼���
	public static String  getGender(int gender){
		String result = "";
		
		if(gender==1 || gender==3){
			result="����";
		}else{
			result="����";
		}//if

		return result;
	}

	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.println("������ �Է��ϼ���");
			int y = sc.nextInt();
			String result = getYear(y);
			System.out.println(y + "=> " + result);

			System.out.println("\n���ڸ� �Է��ϼ���");
			int n = sc.nextInt();
			result = getOdd(n);
			System.out.println(n + "=> " + result);

			System.out.println("\n�ֹι�ȣ�� ������ �Է��ϼ���(1,2,3,4)");
			int g = sc.nextInt();  //1 \n
			result = getGender(g);
			System.out.println(g + "=> " + result);

			System.out.println("\n�������� Q�� �Է�!!");
			sc.nextLine();
			String quit=sc.nextLine(); //
			
			if (quit.equalsIgnoreCase("Q")) break;
		}//while

	}
}

