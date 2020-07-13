package com.day10.array;

public class ArrayTest1 {

	public static void main(String[] args) {
		/*
		 ���� - ������ �� ���� �����ϱ� ���� �����
		 �迭 - ������ Ÿ���� ������ ���� ���� �����ϱ� ���� �����
		            ������ (new Ű����� �޸𸮿� �Ҵ��ؾ� ��)
		      default������ �ʱ�ȭ��      
		            �迭 �̸����� ������(�ּҰ�)�� ��
		            �� ��ҵ��� �ε���(index, ÷��)�� ���� ����            
		 */
		
		//[1] �迭����� �޸� �Ҵ��� ����
		//1. �迭 ����
		int[] arr;
		
		//2. �޸� �Ҵ�
		arr = new int[3];  //���� 3���� ������ �� �ִ� �迭
				
		//3. �ʱ�ȭ
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		//4. ���
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		*/
		
		for(int i=0;i<3;i++) {
			System.out.println(arr[i]);
		}
		
		//[2] �迭����� �޸� �Ҵ��� ���ÿ�
		int[] arr2=new int[2];
		
		//�ʱ�ȭ
		arr2[0]=4;
		arr2[1]=7;
		//arr2[2]=8;  //���� error: ArrayIndexOutOfBoundsException
		
		//[3] �迭����, �޸� �Ҵ�, �ʱ�ȭ ��� ���ÿ�
		int[] arr3 = {15,30,21,77,95};
		
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}//for
		
		System.out.println("\n\narr �迭�� ũ�� : " +  arr.length+"\n\n");
		
		//
		int arr4[];  //����
		arr4 = new int[4];  //default������ �ʱ�ȭ��
		
		for(int i=0;i<arr4.length;i++) {
			System.out.println(arr4[i]);
		}
		
		//
		int[] arr5=new int[] {4,9,7,3};
		
		//
		int[] arr6;
		arr6 = new int[] {1,2,7};
		
		//
		//int[] arr6 = new int[4];
		//arr6= {5,6,4,9};  //error
		
		System.out.println(arr6);  //�迭 �̸����� �ּҰ� ��
		
	}

}
