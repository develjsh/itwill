package com.day12;

import java.util.Scanner;

public class ArrayExam1 {

	public static void main(String[] args) {
		/*
		dArr[i] *= (1+interest/100.0);

		a*=(1+����/100);
		a=a*(1+����/100);
		a=a+a*����/100;
		 */

		Scanner sc = new Scanner(System.in);
		
		double[] dArr = new double[5];
		for (int i=0;i<dArr.length ;i++ ){
			System.out.println("�ܰ� �Է��ϼ���");
			dArr[i] = sc.nextDouble();
		}//for
				
		System.out.println("�������� �Է��ϼ���");
		double interest= sc.nextDouble();

		for (int i=0;i<dArr.length ;i++ ){			
			dArr[i] *= (1+interest/100.0);		
		}//for
				
		for (int i=0;i<dArr.length ;i++ ){
			System.out.println("���ڰ� �ݿ��� �ܰ� ��ȸ : " 
					+ Math.round(dArr[i]));
		}//for
		
	}

}
