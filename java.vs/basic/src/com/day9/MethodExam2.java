package com.day9;

import java.util.Scanner;

public class MethodExam2 {
	public static float toInch(float cm){
		float inch = cm / 2.54f;
		
		return inch;
	}
	
	public static float toCm(float inch){
		float cm = inch * 2.54f;
		
		return cm;
	}

	public static double findArea(double w, double h){
		double area = w*h*1/2;
		
		return area;
	}
	
	public static void main(String[] args) {
		//1.
		Scanner sc = new Scanner(System.in);

		System.out.println("��ȯ�Ϸ��� inch�� �Է�!!");
		float inch = sc.nextFloat();
		float res = toCm(inch);

		System.out.println(inch + "inch => " + res +"cm");

		System.out.println("\n��ȯ�Ϸ��� cm�� �Է�!!");
		float cm = sc.nextFloat();
		res = toInch(cm);

		System.out.println(cm + "cm => " + res +"inch");
		
		//2.
		System.out.println("\n�ﰢ�� �غ�, ���� �Է�!");
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		
		double area = findArea(w, h);
		System.out.println("�ﰢ�� ���� : " + area);
	}


}

