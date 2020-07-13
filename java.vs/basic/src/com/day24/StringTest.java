package com.day24;

public class StringTest {

	public static void main(String[] args) {
		//			  01234567890123456789
		String str = "Hello java, Hi java!";
		
		char ch = str.charAt(4);
		System.out.println("index�� 4�� �ش��ϴ� ���� => " + ch);  //o
		
		//indexOf : Ư�� ���ڿ��� ��ġ�� ���� �� ���
		//�ش� ���ڿ��� �������� ������ -1�� ����
		int idx=str.indexOf("java"); //java�� ��ġ
		System.out.println("java�� ��ġ : " + idx);  //6
		
		idx = str.lastIndexOf("java"); //�ڿ������� ã�� java�� ��ġ
		System.out.println("�ڿ��� ã�� java�� ��ġ : " + idx); //15
		
		//substring(begin, end) : Ư�� ���ڿ��� ������ �� ���
		//begin <= x < end ������ ���ڿ� ����
		String sub =str.substring(6, 10); //6~9������ ���ڿ� ����
		System.out.println("6 <= x < 10 ������ ���ڿ� : " +  sub); //java
		
		sub = str.substring(12); //12���� �������� ���ڿ� ����
		System.out.println("index 12���� �������� ���ڿ� : " + sub); //Hi java!
		
		String url = "www.naver.com";
		if(url.startsWith("www")) {
			System.out.println("url�� www�� ���۵�");
		}else {
			System.out.println("url�� www�� ���۵��� ����");
		}
		
		if(url.endsWith("com")) {
			System.out.println("url�� com���� ����!");
		}else {
			System.out.println("url�� com���� ������ ����!");
		}
		
		//				0123456789012
		String email = "hong@nate.com";
		if(email.indexOf("@") != -1 && email.indexOf(".") != -1
			&& email.indexOf("@") < email.indexOf(".")) {
			System.out.println("\n�̸��� ��Ģ�� �½��ϴ�.");
		}else {
			System.out.println("\n�̸��� ��Ģ�� ���� �ʽ��ϴ�.");
		}
		
		//String em1 = email.substring(0,4);  //hong
		//String em2 = email.substring(5,9);  //nate
		//String em3 = email.substring(10);  //com
		
		//email = "kim@gmail.com";
		int idx1 = email.indexOf("@"); //@�� ��ġ  4
		int idx2 = email.indexOf("."); //.�� ��ġ  9
		
		//**************************************************
		String em1 = email.substring(0, idx1);  //hong
		String em2 = email.substring(idx1+1, idx2);  //nate
		String em3 = email.substring(idx2+1);  //com
		
		System.out.println("�̸��� ù�κ� : " + em1);
		System.out.println("�̸��� ��� �κ� : " + em2);
		System.out.println("�̸��� ������ �κ� : " + em3);
		
		String s = "   java, python!  ";
		System.out.println("["+ s +"]");
		System.out.println("���ڿ� ���� : " + s.length());
		
		String s2 =  s.trim();
		System.out.println("trim �� [" + s2 + "]");
		System.out.println("trim �� ���� : " + s2.length());
		
		int n = 10;
		
		String s3 = Integer.toString(n);
		System.out.println("int�� ���ڿ��� ��ȯ - toStrint(): " + s3);
		s3 = String.valueOf(n);
		System.out.println("int�� ���ڿ��� ��ȯ - valueOf() : " + s3);
		
		
	}

}
