package com.awt.day2;

import java.awt.Font;
import java.awt.GraphicsEnvironment;

public class FontList {

	public static void main(String[] args) {
		GraphicsEnvironment ge
			=GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font[] fontArr=ge.getAllFonts();
		//=> �ý��ۿ��� ������� ��Ʈ ����Ʈ
		
		for(Font font : fontArr) {
			System.out.println(font.getFontName());
		}
		
	}

}


