package com.day22;

import java.io.IOException;

public class ThrowsTest3 {

	public static void main(String[] args) throws IOException{
		//public abstract int read() throws IOException
		
		System.out.println("��(M), ��(F) ����!");
		char ch=(char)System.in.read();
		
		//public static char toUpperCase(char ch)
		
		String result="";
		switch(Character.toUpperCase(ch)) {
			case 'M':
				result = "����";break;
			case 'F':
				result = "����";break;
			default:
				result = "�߸� �Է�!";
		}
		
		System.out.println(ch+"=>"+result);
	}

}
