package com.day7;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		//while�� �̿��� ���ѷ���
		/*
		  while(true){
		  	 �ݺ��� ���;
		  	 
		  	 Ư�������� ��� break;	  
		  }		  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������ �Է��ϼ���. (�������� 0 �Է�)");
			int n=sc.nextInt();
			
			String result="";
			if(n==0) {
				break;
			}else if(n>0) {
				result="���";
			}else {
				result="����";
			}
			
			System.out.println(result+"\n");
		}//while

		System.out.println("\n\n------next-----");
	}

}
