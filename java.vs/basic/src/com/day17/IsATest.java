package com.day17;

/*
�� Ŭ������ �����ϴ� ���
[1] ��Ӱ��� �̿�
is a ���谡 �����ϸ� ����� �̿�
~�� ������ ~�̴�

��) SportCar�� ������ Car�̴�
SportCar is a Car.

[2] ���԰��� �̿�
has a ���谡 �����ϸ� ���԰��� �̿�
~�� ~�� ������ �ִ�

��) Circle�� Point�� ������ �ִ�
Circle has a point.
 */

//��Ӱ��� �̿�
class Point{
	protected int x, y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
	}	
}//class

class Circle extends Point{
	private int r;
	
	Circle(int x, int y, int r){
		super(x, y);
		this.r=r;
	}
	
	public void showInfo() {
		System.out.println("������ x��ǥ : " + x);
		System.out.println("������ y��ǥ : " + y);
		System.out.println("������ : " + r);		
	}
}//class

public class IsATest {

	public static void main(String[] args) {
		Circle c = new Circle(10, 20, 50);
		c.showInfo();
				
	}

}
