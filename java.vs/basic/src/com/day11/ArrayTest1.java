package com.day11;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		//for �� �ȿ��� �迭 �ʱ�ȭ�ϱ�
		//[1] ������ ��Ģ�� �ִ� ������ �ʱ�ȭ�ϴ� ���
		//5, 10,15,20,25
		int a;
		a=7;
		
		//1. �迭 ����
		int[] arr;
		
		//2. �޸� �Ҵ�
		arr=new int[5];
		
		//3. �ʱ�ȭ
		/*
		arr[0]=5;       1
		arr[1]=10;		2
		arr[2]=15;		3
		arr[3]=20;		4
		arr[4]=25;		5
		*/
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i+1)*5;
		}
		
		//4. ���
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}//for
		
		//[2] ����ڷ� ���� �Է� ���� ��(double)���� �ʱ�ȭ�ϴ� ��� -4��
		Scanner sc = new Scanner(System.in);
		
		double[] dArr=new double[4];
		
		/*
		System.out.println("�Ǽ��� �Է��ϼ���");
		double num=sc.nextDouble();
		dArr[0]=num;
		dArr[1]=sc.nextDouble();
		dArr[2]=sc.nextDouble();
		dArr[3]=sc.nextDouble();
		*/
		
		for(int i=0;i<dArr.length;i++) {
			System.out.println("�Ǽ��� �Է��ϼ���");
			//double num=sc.nextDouble();
			//dArr[i]=num;
			dArr[i]=sc.nextDouble();
		}
		
		for(int i=0;i<dArr.length;i++) {
			System.out.println("dArr[" + i +"] = " + dArr[i]);
		}//for
		
	}

}




