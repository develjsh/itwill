package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest2 {

	public static void main(String[] args) {
		String str ="1,ȫ�浿,100,95,88|2,��浿,85,77,66|3,�̱浿,91,79,99";
		
		StringTokenizer st = new StringTokenizer(str, "|");
		while(st.hasMoreTokens()) {
			String token = st.nextToken(); //1,ȫ�浿,100,95,88
			//System.out.println(token); 
			
			StringTokenizer st2 = new StringTokenizer(token, ",");
			while(st2.hasMoreTokens()) {
				String s = st2.nextToken();
				System.out.print(s+"\t");
			}
			System.out.println();
		}//while
		
		/*
		  ���ڿ��� ���Ե� �����Ͱ� �� ���� ������ �����ڷ� �������� ���� �� 
		  �� ���� StringTokenizer �� ���� �ݺ����� ����ؼ�  ó��
		  
		  �� �л��� ������ �����ϱ� ���� "|" �� ��� 
		  �л��� �̸��� ���� ���� �����ϱ� ���� "," �� ���
		*/

		//split() �̿�
		System.out.println("\n=====split() �̿�======");
		
		String[] arr = str.split("\\|");
		for(String s : arr) {
			//System.out.println(s);
			
			String[] sArr = s.split(",");
			for(int i=0;i<sArr.length;i++) {
				System.out.print(sArr[i]+"\t");
			}//for
			
			System.out.println();
		}//for
		
		
		
	}

}

