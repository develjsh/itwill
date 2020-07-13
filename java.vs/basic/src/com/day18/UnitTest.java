package com.day18;

class Unit{
	protected int x, y; //������ ��ġ
	
	Unit(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("�� ������ ������ ��ġ�� �̵��ϴ� �޼���");
	}
	
	public void stop() {
		System.out.println("�����.");
	}
}//class

class Marine extends Unit{
	Marine(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("������ x="+x+", y=" +y +"�� ��ġ�� �̵��Ѵ�");		
	}
	
	public void stimpack() {
		System.out.println("�������� ����Ѵ�.");
	}
}//class

class Tank extends Unit{
	Tank(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("��ũ�� x="+x+", y="+y+"�� ��ġ�� �̵�!");		
	}
	
	public void changeMode() {
		System.out.println("���ݸ�带 ��ȯ�Ѵ�");
	}
}//class

class Dropship extends Unit{
	Dropship(int x, int y){
		super(x, y);
	}
	
	public void move(int x, int y) {
		this.x=x;
		this.y=y;
		
		System.out.println("x="+x+", y="+y +"�� ��ġ�� ���ۼ��� �̵���!");
	}
	
	public void load() {
		System.out.println("���õ� ����� �¿��");
	}
	
	public void unload() {
		System.out.println("���õ� ����� ������.");
	}
}//class

public class UnitTest {

	public static void main(String[] args) {
		Unit u = new Marine(10, 20);
		u.move(40, 50);
		
		System.out.println("\n=====�迭 �̿�=======");
		Unit[] uArr=new Unit[5];
		uArr[0] = new Marine(20, 30);
		uArr[1] = new Tank(30, 40);
		uArr[2] = new Marine(50, 70);
		uArr[3] = new Dropship(20, 90);
		uArr[4] = new Tank(100, 60);
		
		for(int i=0;i<uArr.length;i++) {
			uArr[i].move(90, 75);
		}//for
		
		
	}

}
