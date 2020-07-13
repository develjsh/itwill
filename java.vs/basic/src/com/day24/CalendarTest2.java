package com.day24;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		//			     0   1    2   3   4   5    6    7 
		String[] week = {"","��","��","ȭ","��","��","��","��"};
		
		//public static Calendar getInstance()
		Calendar cal = Calendar.getInstance();
		
		//public final void set(int year,int month, int date)
		cal.set(2020, 5, 1);  //2020-06-01  ��
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("���� : " + day); //2
		System.out.println("���� : " + week[day]); //��
		
		//��ĥ ��, �� ���� ��, �� �� �� ���
		//Calendar cal2 = new GregorianCalendar(); //��������
		
		//public GregorianCalendar(int year,int month,int dayOfMonth)
		Calendar cal2 = new GregorianCalendar(2020, 5, 1); //2020-06-01
		System.out.println("\n"+showDate(cal2));
		
		//2020/06/01�κ��� 100�� ��
		//public abstract void add(int field, int amount)
		cal2.add(Calendar.DATE, 100);
		System.out.println("100�� �� : " + showDate(cal2));
		
		//2020�� 9�� 9�� ���� 5���� ��
		cal2.add(Calendar.MONTH, -5);
		System.out.println("5���� �� : " + showDate(cal2));
		
		//2020�� 4�� 9�� ���� 2�� ��
		cal2.add(Calendar.YEAR, 2);
		System.out.println("2�� �� : " + showDate(cal2));
		
	}

	public static String showDate(Calendar cal) {
		return cal.get(Calendar.YEAR) +"�� " 
				+ (cal.get(Calendar.MONTH)+1) +"�� "
				+ cal.get(Calendar.DATE) + "��";
	}
	
}
