package com.day12;

import java.util.Scanner;

public class HwArray1 {
	public static int[] findMax()	{
		//5�� ������ ��� �迭
		int[] num = new int[5];
		System.out.println("5���� ���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);

		for (int i=0;i<5 ;i++ ){ //5�� �ݺ�
			//����ڰ� �Է��� ���� 5���� �迭�� �ִ´�			
			num[i] = sc.nextInt();
		}

		for (int i=0;i<num.length ;i++ ){ //5�� �ݺ�
			for (int k=0;k<i ;k++ ){ //2��° �迭(num[1])�� ������ ���� ����� ���ʷ� ��
				if (num[i] > num[k]){  //�� ū ���� ���� �迭�� �̵�
					//swap, �� ���� ���� �ٲ۴�
					int temp = num[k]; 
					num[k] = num[i];
					num[i] = temp;
				}
			}
		}//for
		
		return num; //�迭�� ����
	}
	
	public static void main(String[] args) {
		//1.
		System.out.println("������ ���ڿ��� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		for(int i=0; i < str.length(); i++){
			char ch = str.charAt(i);
			
			System.out.println("str.charAt("+i+"):"+ ch 
					+"=>" + (int)ch);
		}

		//2.
		int[] num = findMax();

		//����ϱ�
		System.out.println("===������������ ����===");
		for (int i=0;i<num.length ;i++ ){
			System.out.print(num[i]+"\t");
		}//for
		
	}

}

