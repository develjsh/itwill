package com.day24;

import java.util.*;

class CalendarExam{
	public static void main(String[] args){
		Calendar date1 = Calendar.getInstance();
		Calendar today = Calendar.getInstance();

		// date1�� ��¥�� 1999-07-15�� �����Ѵ�.
		date1.set(1999, 6, 15);
		
		//�� ��¥���� ���� - getTimeInMillis() �� �̿��ؼ� õ���� ���� ������ ��ȯ�ؾ� ��
		long difference 
			=(today.getTimeInMillis() - date1.getTimeInMillis())/1000;
		System.out.println("����(1999-07-15) ���� ����ϼ�:  "
			+ difference/(24*60*60) +"��");

		Calendar date2 = Calendar.getInstance();
		date2.set(2020, 11, 25);		
		difference 
			=(date2.getTimeInMillis() - today.getTimeInMillis())/1000;
		System.out.println("ũ������������ ���� �ϼ�:  "
				+ difference/(24*60*60) +"��");

		today.add(Calendar.DATE, -50);
		System.out.print("���� ���� 50�� �� : ");
		System.out.println(showDate(today));
	}//main

	public static String showDate(Calendar date){
		return date.get(Calendar.YEAR)+"�� "
		+ (date.get(Calendar.MONTH)+1) + "�� " 
		+ date.get(Calendar.DATE) + "��";
	}
	
}

