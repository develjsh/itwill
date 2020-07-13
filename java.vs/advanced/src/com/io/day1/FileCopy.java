package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		// ���Ͽ��� �о ���Ͽ� ���, ����Ʈ ���
		//=> FileInputStream, FileOutputStream
		
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("text/poetry2.txt");
			fos=new FileOutputStream("text/poetry2.bak", true);
			//public FileOutputStream(String name, boolean append)
			//=> true => ������ ������ �߰�(append)��
			
			int data=0;
			while((data=fis.read())!=-1) {
				fos.write(data);
				
				/*public void write(int b) throws IOException
				- Writes the specified byte to this file output stream.
				- byte ������ ��� */
			}
			System.out.println("���Ͽ� ��� �Ϸ�!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
