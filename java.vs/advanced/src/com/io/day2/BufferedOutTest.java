package com.io.day2;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutTest {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			fos=new FileOutputStream("text/123.txt");
			bos=new BufferedOutputStream(fos, 5); //���� ũ�⸦ 5�� ����
			
			for(int i='1';i<='9';i++) {
				bos.write(i);
			}
			System.out.println("���Ͽ� ��� �Ϸ��!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//fos.close();
				/*ũ�Ⱑ 5�� BufferedOutputStream �� �̿��ؼ� ���� 123.txt�� 
				  1~9���� ����ϴ� ����
				   ��� : 5������ ���
				 <= ���ۿ� �����ִ� �����Ͱ� ��µ��� ���� ���·� ���α׷��� ����Ǿ��� ���� 
				 */
				bos.close();
				//bos.close() �� ȣ���ؼ� BufferedOutputStream �� close()��
				//ȣ�����־� ���ۿ� �����ִ� ��� ������ ��µ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
