package com.day8;

import java.util.Scanner;

public class ForExam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n�� ���� ������ �Է��ϼ���");
		int num1 =  sc.nextInt();
		int num2 =  sc.nextInt();

		/*int sum=0;
		for (int i=num1;i<=num2 ;i++ ){
			sum+=i;
		}//for
		*/	
		
		int start=0, end=0;
		if (num1>num2){
			start=num2;
			end=num1;
		}else{
			start=num1;
			end=num2;
		}

		int sum=0;
		for (int i=start;i<=end ;i++ ){
			sum+=i;
		}//for
		
		System.out.println("\n"+start+"~"+end+"������ ������ ��:"+sum);

		//swap-���� �ٲٴ�
		System.out.println("\n�� ���� ������ �Է��ϼ���");
		num1 =  sc.nextInt();
		num2 =  sc.nextInt();

		int temp=0;
		if(num1>num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}

		sum=0;
		for (int i=num1;i<=num2 ;i++ ){
			sum+=i;
		}//for
		
		System.out.println("\n"+num1+"~"+num2+"������ ������ ��:"+sum);



		
	}

}
