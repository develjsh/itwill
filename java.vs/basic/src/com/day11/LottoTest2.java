package com.day11;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTest2 {
	
	//�迭�� ��ȯŸ���� ���
	public static int[] lotto() {
		//1. 6�� (����)��Ҹ� ���� �迭 �����
		int[] arr = new int[6];
		
		//2. for������ 1~45 ������ ������ ������ �迭 ��ҿ� �ִ´�
		//(for������ �ʱ�ȭ)					
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*45+1); //0, 1, 2, 3,...5
			
			//�ߺ� ����
			for(int k=0;k<i;k++) {
				if(arr[i]==arr[k]) {
					//���� �ߺ��Ǵ� ��� �ٽ� �̾ƾ� ��
					i--;
					break;
				}
			}//���� for
		}//�ٱ� for
		
		return arr;
	}
	
	public static void main(String[] args) {
		//�ζ� �����
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//1,2
			int[] arr=lotto();
			
			//3. �迭 ��� ����
			Arrays.sort(arr);
			
			//4. �迭 ��� ���
			for(int n : arr) {
				System.out.print(n+"\t");
			}//for
			
			System.out.println("\n\n�׸��Ϸ��� Q �Է�!");
			String quit=sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
			
		}//while
		
	}

}
