package com.day18;

import java.util.Scanner;

class ShapeManager{
	final int MAX_COUNT = 2; 
	Scanner sc = new Scanner(System.in);
	
	Shape2[] shArr=new Shape2[MAX_COUNT];
	int idx=0;
		
	public void showMenu() {
		System.out.println("1.�� �Է�, 2.�簢�� �Է�, 3.���� ���, 4.����");
	}
	
	public void inputCircle() {
		if(idx==MAX_COUNT) {
			System.out.println("�� �̻��� �����͸� �Է��� �� �����ϴ�.");
			return;
		}
		
		System.out.println("������ �Է��ϼ���");
		int r = sc.nextInt();
		
		shArr[idx++] = new Circle2(r);
	}
	
	public void inputRect() {
		if(idx==MAX_COUNT) {
			System.out.println("�� �̻��� �����͸� �Է��� �� �����ϴ�.");
			return;
		}
		
		System.out.println("����, ���� �Է��ϼ���");
		int w=sc.nextInt();
		int h=sc.nextInt();
		
		shArr[idx++] = new Rect2(w, h);
	}
	
	public void printAll() {
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
}

public class ShapeArray3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ShapeManager sm = new ShapeManager();
		
		while(true) {
			sm.showMenu();
			
			int type=sc.nextInt();
			
			switch(type) {
				case 1:
					sm.inputCircle();
					
					break;
				case 2:
					sm.inputRect();
					
					break;
				case 3:
					sm.printAll();
					
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
