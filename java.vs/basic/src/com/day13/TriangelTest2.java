package com.day13;

import java.util.Scanner;

public class TriangelTest2 {
	public static int findArea(int w, int h) {
		return w * h /2;
	}
	
	public static void main(String[] args) {
		//2. main Ŭ�������� �ﰢ�� ���� ���ϴ� �޼��� ���� ó��
		Scanner sc = new Scanner(System.in);
		System.out.println("�غ�, ���� �Է�!");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		int area=findArea(w, h);
		System.out.println("�ﰢ�� ���� => " + area);

	}

}
