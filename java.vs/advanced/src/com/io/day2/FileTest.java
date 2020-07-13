package com.io.day2;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File f = new File("text/test.txt");
		
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		System.out.println("��θ� ������ �����̸� - " + f.getName());
		System.out.println("Ȯ���ڸ� ������ �����̸� - " + fileName.substring(0,pos));
		System.out.println("Ȯ���� - " + fileName.substring(pos+1));
		System.out.println("��θ� ������ �����̸� - " + f.getPath());
		System.out.println("������ ������ - " + f.getAbsolutePath());
		System.out.println("������ ���� �ִ� ���丮 - " + f.getParent());
		System.out.println();
		System.out.println("File.pathSeparator - " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println();
		System.out.println("user.dir="+System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path=" + System.getProperty("sun.boot.class.path"));

		File file2 = new File("d:\\lecture","abt.txt");
		
		try {
			boolean bool = file2.createNewFile();
			System.out.println("���� ���� ���� : "+ bool);
			
			if(file2.exists()) {
				System.out.println("������ ������!");
			}
				
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

}
