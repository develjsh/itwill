package com.day14;

import java.util.Scanner;

public class TimeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��, ��, �� �Է�!");
		int h = sc.nextInt(); //15
		int m = sc.nextInt(); //12
		int s = sc.nextInt(); //50
		
		//�����ڸ� �̿��ؼ� ��������� �ʱⰪ �Ҵ� - �ʱ�ȭ
		Time t = new Time(h, m, s);
		
		int sec = t.toSecond();
		System.out.println("\n�ʷ� ȯ�� �ϸ� " + sec +"��");
		
		//setter�� �̿��ؼ� ��������� �� ����
		t.setHour(12);
		t.setMin(13);
		t.setSec(50);
		
		//getter�� �̿��ؼ� ��������� �� �о����
		System.out.println("\n\n----����� �ð�------");
		System.out.println(t.getHour() +"�� " + t.getMin() + "��"
				+ t.getSec() +"��");
		
		System.out.println("�ʷ� ȯ�� : " + t.toSecond() +"��");
		

	}

}
