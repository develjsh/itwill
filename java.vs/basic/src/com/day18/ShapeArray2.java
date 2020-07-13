package com.day18;

import java.util.Scanner;

public class ShapeArray2 {
	final static int MAX_COUNT = 2; 
	static Scanner sc = new Scanner(System.in);
	
	static Shape2[] shArr=new Shape2[MAX_COUNT];
	static int idx=0;
		
	public static void showMenu() {
		System.out.println("1.�� �Է�, 2.�簢�� �Է�, 3.���� ���, 4.����");
	}
	
	public static void inputCircle() {
		if(idx==MAX_COUNT) {
			System.out.println("�� �̻��� �����͸� �Է��� �� �����ϴ�.");
			return;
		}
		
		System.out.println("������ �Է��ϼ���");
		int r = sc.nextInt();
		
		shArr[idx++] = new Circle2(r);
	}
	
	public static void inputRect() {
		if(idx==MAX_COUNT) {
			System.out.println("�� �̻��� �����͸� �Է��� �� �����ϴ�.");
			return;
		}
		
		System.out.println("����, ���� �Է��ϼ���");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		shArr[idx++] = new Rect2(w, h);
	}
	
	public static void printAll() {
		if(idx==0) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
			return;
		}
		
		System.out.println("\n=====�������� ����======");
		for(int i=0;i<idx;i++) {
			double area=shArr[i].findArea();
			System.out.println("���� : " + area);
		}//for
	}
	
	public static void main(String[] args) {
		
		while(true) {
			showMenu();
			
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					inputCircle();
					
					break;
				case 2:
					inputRect();
					
					break;
				case 3:
					printAll();
					
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
