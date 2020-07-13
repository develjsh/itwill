package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest3 {

	public static void main(String[] args) {
		/*
		 split() �� �� ���ڿ��� ��ū���� �ν��ϴ� �ݸ� 
		 StringTokenizer �� �� ���ڿ��� ��ū���� �ν����� �ʱ� ������ �ν��ϴ�
		  ��ū�� ������ ���� �ٸ�		 
		 */
		
		String str = "100,,,200,300,400";
		
		//split()�̿�
		String[] arr = str.split(",");
		int count = 0;
		for(String s : arr) {
			System.out.print(s + "|");
			
			count++;
		}
		
		System.out.println("\n\nsplit, ��ū�� ���� : " + count);
		
		//StringTokenizer �̿�
		System.out.println("\n\n=====StringTokenizer �̿�======");
		
		count=0;
		StringTokenizer st = new StringTokenizer(str, ",");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.print(token+"|");
			
			count++;
		}
		
		System.out.println("\n\nStringTokenizer, ��ū�� ���� : " + count);
		
	}

}
