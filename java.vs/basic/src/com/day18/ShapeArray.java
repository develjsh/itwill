package com.day18;

import java.util.Scanner;

class Shape2{
	public double findArea() {
		return 0;
	}
}//class

class Circle2 extends Shape2{
	private int r;
	private final double PI=3.141592;
	
	Circle2(int r){
		this.r=r;
	}
	
	public double findArea() {
		return PI*r*r;
	}
}//class

class Rect2 extends Shape2{
	private int w, h;
	
	Rect2(int w, int h){
		this.w=w;
		this.h=h;
	}
	
	public double findArea() {
		return w*h;
	}
}//class

public class ShapeArray {
	public static void main(String[] args) {
		final int MAX_COUNT = 2; 
		Scanner sc = new Scanner(System.in);
		
		Shape2[] shArr=new Shape2[MAX_COUNT];
		int idx=0;
		
		while(true) {
			System.out.println("1.�� �Է�, 2.�簢�� �Է�, 3.���� ���, 4.����");
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					if(idx==MAX_COUNT) {
						System.out.println("�� �̻��� �����͸� �Է��� �� �����ϴ�.");
						break;
					}
					
					System.out.println("������ �Է��ϼ���");
					int r = sc.nextInt();
					
					shArr[idx++] = new Circle2(r);
					break;
				case 2:
					if(idx==MAX_COUNT) {
						System.out.println("�� �̻��� �����͸� �Է��� �� �����ϴ�.");
						break;
					}
					
					System.out.println("����, ���� �Է��ϼ���");
					int w=sc.nextInt();
					int h=sc.nextInt();
					
					shArr[idx++] = new Rect2(w, h);
					break;
				case 3:
					if(idx==0) {
						System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
						break;
					}
					
					System.out.println("\n=====�������� ����======");
					for(int i=0;i<idx;i++) {
						double area=shArr[i].findArea();
						System.out.println("���� : " + area);
					}//for
					
					break;
				case 4:
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default:
					System.out.println("�߸� �Է�!!");
					continue;
			}//switch
		}//while
		
	}

}
