package com.day11;

public class ArraySwap {

	public static void main(String[] args) {
		//�迭������ ���縦 �̿��ؼ� �� �迭�� �¹ٲ۴� - swap
		
		int[] arr = {10, 20, 30};
		int[] oddArr = {1, 3, 5, 7, 9};

		System.out.println("==ó�� ������ arr �迭 ���==");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n\n==oddArr �迭 ���==");
		for(int i=0;i<oddArr.length;i++) {
			System.out.print(oddArr[i]+" ");
		}
		
		//swap
		int[] temp;
		
		temp=arr;  //10,20,30
		arr=oddArr; //1,3,5,7,9
		oddArr=temp; //10, 20, 30
		
		System.out.println("\n\n\n-------swap �� arr ���-------");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		
		System.out.println("\n\n-------swap �� oddArr ���------");
		for(int i=0;i<oddArr.length;i++) {
			System.out.print(oddArr[i]+"\t");
		}
	}

}
