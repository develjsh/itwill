package com.day11;

public class ArrayMax {

	public static void main(String[] args) {
		//�迭 ��� �� �ִ밪 ���ϱ�
		int[] arr = {10,57,19,35,77,26};
		
		int max = arr[0];  //�켱 0��° ��Ҹ� �ִ밪���� ����
		//=> 10 => 57 => 77
		
		//1��° ��Һ��� ���ʴ�� max���� ��
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];  //57=> 77
			}
		}//for
		
		System.out.println("=====�迭 ����� ��=====");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}//for
		
		System.out.println("\n\n�ִ밪 : " + max);
	}

}
