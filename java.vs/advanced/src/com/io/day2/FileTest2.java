package com.io.day2;

import java.io.File;
import java.util.Scanner;

public class FileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���丮 �Է�!!");
		String dir = sc.nextLine();
		
		File file = new File(dir);
		
		if(!file.exists() || !file.isDirectory()) {
			System.out.println("�������� �ʰų� ���丮�� �ƴմϴ�!");
			return;
		}
		
		File[] fileArr=file.listFiles();
		
		for(File f : fileArr) {
			String fName=f.getName();
			String str 
			= f.isDirectory()?"["+ fName + "]":fName 
					+"\t " + f.length();
			System.out.println(str);
		}//for
		
	}

}
