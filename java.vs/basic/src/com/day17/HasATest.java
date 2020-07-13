package com.day17;

//���԰��� �̿� - �����Ϸ��� Ŭ������ ��������� �ִ´�
class Point2{
	int x, y;
	
	Point2(int x, int y) {
		this.x=x;
		this.y=y;
	}
}//class

class Circle2{
	int r;
	Point2 p;  //���԰��� �̿� 
	
	Circle2(int r, Point2 p){
		this.r=r;
		this.p=p;
	}
	
	public void showInfo() {
		System.out.println("���� x : " + p.x);
		System.out.println("���� y : " + p.y);
		System.out.println("������ r : " + r+"\n");		
	}
}//class

public class HasATest {
	public static Point2 createPoint(int type) {
		Point2 p=null;
		if(type==1) {
			p = new Point2(10, 20);
		}
		
		return p;
	}
	
	public static void main(String[] args) {
		int radius = 5;
		Point2 p2= new Point2(10, 20);
		
		Circle2 c = new Circle2(radius, p2);		
		c.showInfo();
		
		Circle2 c2 = new Circle2(7, new Point2(100, 300));
		c2.showInfo();
		
		Point2 p3 = createPoint(1);
		System.out.println("x="+p3.x);
		System.out.println("y="+p3.y);
		
	}

}
