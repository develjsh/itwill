package com.day6;

import java.util.Scanner;

public class ForTest3 {

	public static void main(String[] args) {
		//1~3���� �� ���ϱ�
		/*
		 sum = 0
		 sum = sum + i
		 
		 			sum
		 ------------------------			
		 i : 1		0 + 1
		     2		0+1 + 2
		     3		0+1+2 + 3
		 */

		int sum=0;  //�����ϱ� ���� �ݵ�� 0���� �ʱ�ȭ
		for(int i=1;i<=3;i++) {  //i: 1,2,3
			sum+=i;  //sum=sum+i
			
			//System.out.println("i:"+i+", sum="+sum);
		}//for
		
		System.out.println("\n1~3������ �� : " + sum);
		
		//1~50  Ȧ���� ��
		sum=0;
		for(int i=1;i<=50;i+=2) {
			sum+=i;
		}
		System.out.println("1~50���� Ȧ���� ��:"+ sum);
		
		//1~ n ¦���� ��
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�!");
		int n=sc.nextInt();
		
		sum=0;
		for(int i=2;i<=n;i+=2) {
			sum+=i;
		}//for
		System.out.println("1~"+n +" ���� ¦���� ��: " +sum);
	}

}









