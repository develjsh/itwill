package com.io.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderTest3 {

	public static void main(String[] args) {
		// public InputStreamReader(InputStream in, String charsetName)

		InputStreamReader isr = null;
BufferedReader br=null;
		try {
			isr = new InputStreamReader(System.in);
			br=new BufferedReader(isr);
			System.out.println("���� os���� ������� ���ڵ�:" + isr.getEncoding());
			System.out.println("���� �Է�!!!");

			String data = "";
			while ((data = br.readLine()) != null) {
				System.out.println(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
