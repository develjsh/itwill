package com.day25;

import java.util.StringTokenizer;

public class TokenizerTest {

	public static void main(String[] args) {
		String str ="10,20,30,40";
		
		//public StringTokenizer(String str, String delim)
		StringTokenizer st = new StringTokenizer(str, ",");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		//split() �̿�
		System.out.println("\n===== split()�̿� =======");
		String[] arr = str.split(",");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("\n=============");
		
		//public StringTokenizer(String str,String delim,boolean returnDelims)
		str = "100+(200*300)/2";
		StringTokenizer st2 = new StringTokenizer(str, "+-*/=()", true);
		//=> �����ڵ� ��ū���� ����
		
		while(st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		//StringTokenizer �� �����ڷ� �� �ϳ��� ���� �ۿ� ������� ����

		// StringTokenizer �� �� �� ������ �����ڸ� ����� �� �ֱ� ������, 
		//   +-*/=() ��ü�� �ϳ��� �����ڰ� �ƴ϶� ������ ���ڰ� ��� ��������
		// �� ���� �̻��� �����ڸ� ����ؾ� �Ѵٸ� split() �޼��� �̿�
		

	}

}
