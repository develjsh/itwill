package com.day7;

import java.util.Scanner;

public class ForExam4{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
			
		int sum=0;
		while(true){
			System.out.println("���� �Է�!");
			int n=sc.nextInt();
			
			if(n==0) break; 
				
			sum+=n; //		
		}//while
		
		System.out.println("��:"+ sum);
		
		//2.
		System.out.println("���� �Է�!");
		int count=sc.nextInt();
		
		sum=0;
		for(int i=0;i<count;i++) {
			System.out.println("���� �Է�!");
			
			int num=sc.nextInt();
			sum+=num;
		}//for
		
		double avg=(double)sum/count;
		System.out.println("���:" + avg);
		
		//public static long round(double a)	
		avg=Math.round(avg*100)/100.0;
		System.out.println("�ݿø� �� : " + avg);
	}

}






