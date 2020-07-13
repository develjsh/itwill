package com.day14;

public class Time {
	//1. �������
	private int hour; //15
	private int min;  //12
	private int sec;  //50
	
	//2. ������ - ������� �ʱ�ȭ
	public Time(int h, int m, int s) {
		hour = h;
		min = m;
		sec = s;
	}
	
	//3. getter/setter
	//getter - ��������� �� �о����
	public int getHour() {
		return hour;
	}
	
	//setter - ��������� �� �Ҵ�
	public void setHour(int h) {
		hour = h;
	}
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int m) {
		min = m;
	}
	
	public int getSec() {
		return sec;
	}
	
	public void setSec(int s) {
		sec = s;
	}
	
	//4. �޼���
	public int toSecond() {
		return hour * 60 * 60 + min * 60 + sec;
	}
}
