package com.day11;

import java.util.Scanner;

public class ArrayExam1 {

	public static void main(String[] args) {
		//1.
		Scanner sc=new Scanner(System.in);
		System.out.println("�迭�� ������ �Է��ϼ���");
		int cnt=sc.nextInt();

		int[] arr=new int[cnt];
		/*
		 arr[0]=0;
		 arr[1]=1;
		 arr[2]=2;
		 */
		
		//�ʱ�ȭ
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//2.
		int[] arr2=new int[5];
		/*
		arr2[0]=1; 0   
		arr2[1]=3; 2
		arr2[2]=5; 4
		... 
		  */
		
		//�ʱ�ȭ
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=2*i+1;
		}

		System.out.println("\n\n=======Ȧ��=======");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

	}

}

