package com.day13;

public class Triangle2 {
	//1. �������
	int w;  //�غ�  10
	int h; 	//����  20
	
	//2. ������ - ������� �ʱ�ȭ
	public Triangle2(int p_w, int p_h) {
		w=p_w;
		h=p_h;
	}
	
	//3. �޼���
	public int findArea() {
		return w * h /2;
	}
}
