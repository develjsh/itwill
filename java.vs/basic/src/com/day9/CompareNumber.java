package com.day9;

import java.util.Scanner;

public class CompareNumber {

	public static void main(String[] args) {
		/*
		public static double random()
		=> 0.0 ~ 1.0 ������ ������ �Ǽ��� ����
		��  0.0 <= x < 1.0
		
		1) �߻���Ű���� ���� ������ �� ���� ���Ѵ�
		2) ���۰��� ���Ѵ�
		3) int�� ����ȯ�Ѵ�

		��1) 1~100 ������ ������ ����
		0.0 <= Math.random() * 100 < 100.0 
		1.0 <= Math.random() * 100 + 1 < 101.0
		1 <= (int)(Math.random() * 100 + 1) < 101
		
		��2) 0~100 ������ ������ ����
		0.0 <= Math.random() * 101 < 101.0
		0 <= (int)(Math.random() * 101) < 101
		
		��) A ~ Z ������ ������ �빮��
		0.0 <= Math.random() * 26 < 26.0 
		65.0 <= Math.random() * 26 + 65 < 91.0
		65 <= (int)(Math.random() * 26 + 65) < 91
		
		��) d ~ g ������ ������ �ҹ���
		0.0 <= Math.random() * 4 < 4.0 
		100.0 <= Math.random() * 4 + 100 < 104.0
		100 <= (int)(Math.random() * 4 + 100) < 104
		
		*/
		
		//1. ���� ���ϱ� : 1~100 ������ ������ ���� ���ϱ�
		//int answer =(int)(Math.random() * 100 + 1);
		//System.out.println("answer="+ answer);
		
		//int answer=findAnswer();
		
		int answer=findAnswer2(1, 100);
		
		//4�� �ݺ� ó�� - 2~4 ���� for�� �ȿ� �ִ´�
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			//2. ����ڷ� ���� 1~100 ������ ���� �Է¹ޱ�
			System.out.println("1~100 ������ ������ �Է��ϼ���");
			int num = sc.nextInt();
			
			//3. ����� ����� �Է°� ��
			//4. ��� ���
			if(num==answer) {
				System.out.println("�����Դϴ�!!");
				break;
			}
			
			if(i==3) {
				System.out.println("����! ���� ��ȸ��!! ������ " 
							+ answer +"�����ϴ�.");
			}else {
				if(num>answer) {
					System.out.println("�ʹ� Ů�ϴ�. ���� ���� ���� �Է��ϼ���\n");
				}else {
					System.out.println("�ʹ� �۽��ϴ�. �� ū ���� �Է��ϼ���\n");
				}//if
			}
			
		}//for		
		
	}//main
	
	public static int findAnswer(){
		int answer =(int)(Math.random() * 100 + 1);
		System.out.println("answer="+ answer);
		
		return answer;
	}

	public static int findAnswer2(int start, int end){
		int answer =(int)(Math.random() * (end-start+1) + start);
		System.out.println("answer="+ answer);
		
		return answer;
	}
	
}



