package com.day25;

public class BuilderTest2 {

	public static void main(String[] args) {
		//String�� StringBuilder�� ��ȯ
		String str = "java";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		//StringBuilder�� String���� ��ȯ
		StringBuilder sb2 = new StringBuilder("test");
		String s = sb2.toString();
		System.out.println(s);
		
	}

}
