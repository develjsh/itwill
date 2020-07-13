package com.io.day2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {
		//���ڱ��, ���Ͽ��� �о ���Ͽ� ���
		//=> FileReader, FileWriter
		
		FileReader fr =null;
		FileWriter fw=null;
		
		try {
			fr = new FileReader("text/poetry.txt");
			fw = new FileWriter("text/poetry.bak");
			
			//������ ������ ��� ���ִ� ����
			int data=0;
			while((data=fr.read())!=-1) {
				if(data!='\t' && data!='\n' && data!='\r' && data!=' ') {
					fw.write(data);
					
				}
				// enter : \r\n
			}
			System.out.println("���� ���� �Ϸ�");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
