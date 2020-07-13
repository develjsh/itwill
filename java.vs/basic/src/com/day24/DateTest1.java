package com.day24;

import java.util.Date;

public class DateTest1 {

	public static void main(String[] args) {
		Date d = new Date();  //��������
		System.out.println("���� ��¥ : " + d);
		System.out.println(d.toLocaleString());
		
		int year = d.getYear();
		int month = d.getMonth();  //0~11
		int date = d.getDate();
		System.out.println((1900+year) +"�� " 
				+ (month+1) +"�� " + date +"��");
		System.out.println("���� : " + d.getDay());  //0:��, 1:�� ..
		
		System.out.println(d.getHours()+"�� " + d.getMinutes()+"�� "
				+ d.getSeconds()+"��");
		
		//1970-01-01 00:00:00 ���� ����� �ð��� �и��ʷ� ����		
		long gap = d.getTime()/1000;
		System.out.println("70/01/01 ���� ����� �ð� : " + gap+"��");
		
		//�ʸ� �Ϸ� ȯ��
		gap = gap/(24*60*60);
		System.out.println("����� �ϼ� : " + gap+"��");
		
		//�� ��¥ ������ ���� ���ϱ�
		//�����ϱ��� ��ĥ ���Ҵ��� ���(���ó�¥�� ������ ������ ����)
		//������
		//public Date(int year, int month, int date)
		Date d2 = new Date(2020-1900, 7, 19);
		System.out.println(d2.toLocaleString());
		
		long gap2 = d2.getTime()/1000;
		gap2 = gap2/(24*60*60);
		
		long term = gap2 - gap;
		System.out.println("�� ��¥ ������ ���� : " + term + "��");
		
	}

}
