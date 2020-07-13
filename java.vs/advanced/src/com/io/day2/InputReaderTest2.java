package com.io.day2;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderTest2 {

	public static void main(String[] args) {
		// public InputStreamReader(InputStream in, String charsetName)

		InputStreamReader isr = null;

		try {
			isr = new InputStreamReader(System.in);
			System.out.println("���� os���� ������� ���ڵ�:" + isr.getEncoding());
			System.out.println("���� �Է�!!!");

			int data = 0;
			while ((data = isr.read()) != -1) {
				System.out.println(data + " => " + (char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
