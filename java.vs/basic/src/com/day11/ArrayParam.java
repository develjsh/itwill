package com.day11;

import java.util.Scanner;

public class ArrayParam {

	//��,��,�� ������ �� �迭�� �Ű������� �޾� ����� �����ϴ� �޼���
	//�迭�� �Ű������� ���
	public static double findTotal(int[] score) {
		//call by reference : �Ű������� �ּҰ� �Ѿ
		//=> �޼��忡�� �Ű������� ���� �����ϸ� �ش� �޼��带 ȣ���� ��(main)������
		//������ ������ �޴´�(���� ����ȴ�)
		
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		
		score[0]++; //96
		
		double avg = (double)sum/score.length;
		
		return avg;
	}
	
	public static int add(int a, int b) {
		//call by value : �Ű������� ���� �Ѿ
		//=> �޼��忡�� �Ű������� ���� �����ص� �ش� �޼ҵ带 ȣ���� ��(main)������
		//���� ���� �ʴ´�
		
		int c = a + b;
		a++; //6
		return c;
	}
	
	public static void main(String[] args) {
		int a=5, b=7;
		int result=add(a, b); //call by value
		System.out.println(result+", a="+a); //a=5
		
		int[] arr=new int[3];
		arr[0]=95;
		arr[1]=81;
		arr[2]=77;
		
		//int[] arr2= {100, 96, 87};
		
		double avg=findTotal(arr); //call by reference
		System.out.println(avg+", arr[0]=> "+arr[0]);
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr3=new int[3];
		System.out.println("��,��,�� ������ �Է��ϼ���");
		
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=sc.nextInt();		
		}
		
		avg=findTotal(arr3);
		System.out.println(avg);
	}

}
