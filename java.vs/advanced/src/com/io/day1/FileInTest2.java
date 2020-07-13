package com.io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInTest2 {

	public static void main(String[] args) {
		//���Ͽ��� �о ���Ͽ� ���
		//�迭 �̿�
		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		try {
			fis=new FileInputStream("text/poetry4.txt");
			fos=new FileOutputStream("text/poetry4.bak");
			
			int cnt=0, total=0, count=0;
			byte[] buf = new byte[1024];
			
			/*
			 public int read(byte[] b) throws IOException
				- Reads up to b.length bytes of data from this 
				inputstream into an array of bytes. 
				-InputStream���� �о byte�迭�� �ִ´�(byte�迭�� ���̸�ŭ)
			 	-�о�� ������ ������ 
			  */
			while((cnt=fis.read(buf))!=-1) {
				fos.write(buf, 0, cnt);
				//=> buf �迭���� 0���� cnt�� �о ��¼ҽ��� ����
				System.out.write(buf, 0, cnt);
				/*				 
				public void write(byte[] buf, int off, int len)				
				- Writes len bytes from the specified byte array 
				   starting at offset off to this stream.
				- byte�迭���� ������ġ off���� len�� ��ŭ OutputStream�� ���   
				  */
				
				System.out.println("\n\n=============cnt : "+ cnt);
				total+=cnt;
				count++;
			}
			
			
			System.out.println("\n�ݺ�Ƚ�� : " + count+", total="+total);
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



