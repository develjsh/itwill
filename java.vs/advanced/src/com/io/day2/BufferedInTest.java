package com.io.day2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedInTest {

	public static void main(String[] args) {
		//���Ͽ��� ����Ʈ ������ �о�´�
		//���� �̿�
		//=> FileInputStream, BufferedInputStream
		
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try {
			fis=new FileInputStream("text/poetry2.txt");
			bis=new BufferedInputStream(fis, 1024);
			//=> ���� ������ �����ϸ� 2048
			
			int data=0;
			while((data=bis.read())!=-1) {
				System.out.print((char)data);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close(); //bis��  close()�ص� ��� ��Ʈ����  close()��
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}




