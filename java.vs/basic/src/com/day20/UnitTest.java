package com.day20;

abstract class Unit{
	protected int x, y; //������ ��ġ
	
	Unit(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public abstract void move(int x, int y);
	
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
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine(10, 20);
		uArr[1] = new Tank(30, 40);
		uArr[2] = new Dropship(60, 70);
		uArr[3] = new Marine(90, 45);
		
		for(int i=0;i<uArr.length;i++) {
			uArr[i].move(120, 140);
		}//for
				
	}

}
