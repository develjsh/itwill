package com.day11;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		//public static void sort(int[] a)
		//=> �ش� �迭�� ������������ �������ִ� �޼���
		
		int[] arr = {79,12,66,100,3,27,10,85};

		for(int n : arr) {
			System.out.print(n+" ");
		}//for
		
		Arrays.sort(arr);
		
		System.out.println("\n\n=====���� �� �迭 ���=====");
		
		for(int n : arr) {
			System.out.print(n+" ");
		}//for
		
	}

}
