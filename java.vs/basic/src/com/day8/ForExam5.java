package com.day8;

import java.util.Scanner;

public class ForExam5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �Է��ϼ���");
		int  num1 =  sc.nextInt();  //3, 4
		int  num2 =	sc.nextInt();   

		int sum = 0;
		//num1 = (num1%2==1)?num1:num1+1;
		
		if(num1%2==0) { 
			num1++;
		}
		
		for (int i=num1;i<=num2 ;i+=2 ){
		    sum+=i;
		}
		
		System.out.println(num1 +"~"+ num2 +"������ Ȧ���� ��:" + sum);

		//2
		System.out.println("�� ���� �Է��ϼ���");
		num1 =  sc.nextInt();  //3, 4
		num2 =  sc.nextInt();   
					
		System.out.println("1. Ȧ���� ��, 2. ¦���� �� ����");
		int type =  sc.nextInt();  
		if(type!=1 && type !=2){
			System.out.println("1 �Ǵ� 2�� �����ϼž� �մϴ�!!");
			return;
		}
		
		sum = 0;
		int begin=num1;
		String sType = (type==1)? "Ȧ��":"¦��";

		if((type==1 && (num1%2==0))  || (type==2 && (num1%2==1))){
			begin++;
		}

		for (int i=begin;i<=num2 ;i+=2 ){
			  sum+=i;
		}
		
		System.out.println(num1 +"~"+ num2 +"������"+ sType+"�� ��:" + sum);



	}
}
