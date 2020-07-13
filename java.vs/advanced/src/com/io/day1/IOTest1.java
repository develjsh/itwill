package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest1 {

	public static void main(String[] args) {
		//����Ʈ ���, ���Ϸκ��� �о����
		
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("text/poetry2.txt");
			
			int data=0;
			while((data=fis.read())!=-1) {
				//System.out.print(data +" ");
				System.out.print((char)data);
				//=> �ѱ��� ���� 
				/* public void print(char c)
					- Prints a character. 
					- char ������ ��� */
			}
			/*
			public int read() throws IOException
			- Reads a byte of data from this input stream.
			- inpuStream���� 1����Ʈ�� �о�´�
			- �ƽ�Ű�ڵ带 ������
			- �� �̻� �о�� ���� ������ -1�� ������ */ 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
