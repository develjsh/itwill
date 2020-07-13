package com.day24;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//Calendar�� Date�� ��ȯ
		Date date = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 
			= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf3 
			= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS a");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd E����");
		
		String str = sdf.format(date);
		System.out.println("����� : "+str);
		
		str = sdf2.format(date);
		System.out.println("����� �ú��� : " + str);
		System.out.println("����� �ú��� �и��� ����/����: " 
				+ sdf3.format(date));
		System.out.println("����� ���� : " + sdf4.format(date));
		
		
	}

}




