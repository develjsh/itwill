package com.day11;

import java.util.Arrays;
import java.util.Scanner;

public class LottoTest1 {

	public static void main(String[] args) {
		//�ζ� �����
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			//1. 6�� (����)��Ҹ� ���� �迭 �����
			int[] arr = new int[6];
			
			//2. for������ 1~45 ������ ������ ������ �迭 ��ҿ� �ִ´�
			//(for������ �ʱ�ȭ)
			
			/*
			arr[0]=(int)(Math.random()*45+1);
			arr[1]=(int)(Math.random()*45+1);
			arr[2]=(int)(Math.random()*45+1);
			...
			*/
			
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
			
			/*
			 i	k	arr[i] == arr[k]
			 -------------------------			 
			 0
			 1	0	arr[1] == arr[0]
			 	
			 2	0	arr[2] == arr[0]
			 	1	arr[2] == arr[1]
			 	
			 3	0	arr[3] == arr[0]
			 	1	arr[3] == arr[1]
			 	2	arr[3] == arr[2]
			 
			 ...
			 
			 5	0	arr[5] == arr[0]
			 	1	arr[5] == arr[1]
			 	2	arr[5] == arr[2]
			 	3	arr[5] == arr[3]
			 	4	arr[5] == arr[4]		 	
			*/
			
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
