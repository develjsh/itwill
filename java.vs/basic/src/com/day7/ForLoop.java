package com.day7;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		//���� ���� - ������ �ݺ��Ǵ� ���� ����		
		/*
		 for(;;){
		 	�ݺ��� ���;
		 	
		 	if(���ǽ�) break;
		 }
		 
		 => ���ѷ����ȿ����� break�� ����ؼ� �ݺ����� ���������� �ؾ� ��
		 */
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("������!!!!");
			
			System.out.println("����Ͻðڽ��ϱ�?(Y/N)");
			String type = sc.nextLine();
			if(type.equalsIgnoreCase("N"))
				break;
		}//for
		
		System.out.println("\n=======next========");	
	}

}
