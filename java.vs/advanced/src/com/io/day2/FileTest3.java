package com.io.day2;

import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		File file = new File("text/score.dat");
		
		System.out.println("���ϸ� - "+file.getName());
		System.out.println("������ - "+file.getAbsolutePath());
		System.out.println("���� ũ�� - "+file.length()+"byte");
		
		File file2 = new File("text","test.txt");
		File file3 = new File("text\\123.txt");
		
		System.out.println("test.txt ���� ���翩�� : "+file2.exists());
		System.out.println("123.txt �б� ����? : "+file3.canRead());
		System.out.println("123.txt ���� ����? : "+file3.canWrite());
		
		System.out.println("file���� ����: "+file2.isFile());
		System.out.println("dir ���� ����: "+file2.isDirectory());
		
		File file4 = new File("rain");
		file4.mkdir(); //���丮 ����
		
		File file5 = new File("sun","moon");
		file5.mkdirs();
		//=> sun���丮 �����ϰ�, �� �Ʒ��� ���� ���丮 moon ����
		
		
		boolean bool=file4.renameTo(new File("star")); 
		//=>rain��  star�� �̸� ����
		System.out.println("�̸� ���� ���� : "+ bool);
		
		bool = file5.delete(); //���丮 ������ ����־�� ��
		System.out.println("���� ����:"+ bool); //moon �� ������
		
	}

}
