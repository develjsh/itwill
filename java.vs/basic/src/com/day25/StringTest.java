package com.day25;

public class StringTest {

	public static void main(String[] args) {
		//���ڿ��� ������ ��쿡�� �ϳ��� String �ν��Ͻ��� �����ؼ� �����Ѵ�!
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Java";
		
		if(str1 == str2) {  //���������� ==�� �ּ� ��
			System.out.println("str1 �� str2�� �ּҴ� ����");  //
		}else {
			System.out.println("str1 �� str2�� �ּҴ� �ٸ���");
		}
		
		if(str1 == str3) {
			System.out.println("str1 �� str3�� �ּҴ� ����");
		}else {
			System.out.println("str1 �� str3�� �ּҴ� �ٸ���");  //
		}
		
		String str4 = new String("Hello");
		String str5 = new String("Hello");
		
		if(str4 == str5) {
			System.out.println("str4 �� str5�� �ּҴ� ����");
		}else {
			System.out.println("str4 �� str5�� �ּҴ� �ٸ���");  //
		}
		
		if(str1 == str4) {
			System.out.println("str1 �� str4�� �ּҴ� ����");
		}else {
			System.out.println("str1 �� str4�� �ּҴ� �ٸ���");  //
		}
		
		
		
	}

}
