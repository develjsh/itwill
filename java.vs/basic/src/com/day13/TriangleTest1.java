package com.day13;

import java.util.Scanner;

public class TriangleTest1 {

	public static void main(String[] args) {
		//1. main���� �ﰢ�� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�ﰢ���� �غ�, ���̸� �Է��ϼ���");
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int area = w * h / 2;
		
		System.out.println("�ﰢ�� ���� : " + area);
	}

}
