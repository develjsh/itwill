package com.day25;

// Cloneable�������̽��� ������ Ŭ���������� clone()�� ȣ���� �� �ִ�. 
//�� �������̽��� �������� �ʰ� clone()�� ȣ���ϸ� ���ܰ� �߻��Ѵ�.
class Point implements Cloneable{
	private int x, y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
		
	public String toString() {
		return "Point [ x="+x+", y="+y +"]";
	}
	
	public Point copy() throws CloneNotSupportedException {
		Object obj = clone();
		
		return (Point)obj;
	}
	
}//

public class CloneTest {
	public static void main(String[] args) {
		Point p = new Point(10, 20);
		try {
			Point p2 = p.copy();
			p2.setX(88);
			p2.setY(90);
			
			System.out.println("p="+p);
			System.out.println("copy�� �ν��Ͻ� p2="+p2);
			System.out.println("p �ּ� : " + p.hashCode());
			System.out.println("p2 �ּ� : " + p2.hashCode());			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
