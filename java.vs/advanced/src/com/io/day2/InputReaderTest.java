package com.io.day2;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderTest {

	public static void main(String[] args) {
		//InputStreamReader/inputstreamwReader
		//- ����Ʈ ��� ��Ʈ���� �����͸� ������ ���ڵ��� ���� �����ͷ� ��ȯ�ϴ� �۾��� ����
		
		System.out.println("���ڸ� �Է��ϼ���");
		
		try {
			int data=0;
			while((data=System.in.read())!=-1) {
				System.out.println(data + "=> "+(char)data);
				//ctrl + z => console â ���߱�
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				System.in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
	
	}

}
