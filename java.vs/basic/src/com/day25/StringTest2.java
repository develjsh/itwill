package com.day25;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = " and";
		String s3 = " oracle";
		
		//public String concat(String str)
		String str = s1.concat(s2).concat(s3);
		//str = s1+s2+s3;
		//�� 3���� ���ڿ��� �ϳ��� ������ �̸� ���ؼ� �߰��� ������ �ν��Ͻ��� ���� 2��
		
		System.out.println(str);
		
		/*
		StringBuilder sb = new StringBuilder(s1);
		sb.append(s2).append(s3);
		String s = sb.toString();
		*/
	}

}
