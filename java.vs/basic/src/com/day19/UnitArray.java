package com.day19;

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

public class UnitArray {

	public static void main(String[] args) {
		//Unit => 4
		Unit[] uArr = new Unit[4];
		uArr[0] = new Marine(10, 20);
		uArr[1] = new Tank(30, 50);
		uArr[2] = new Marine(40, 60);
		uArr[3] = new Dropship(17, 34);
		
		//[1] �������̵� �޼��� ȣ��
		for(int i=0;i<uArr.length;i++) {
			uArr[i].move(90, 120);
		}//for
		
		System.out.println("\n--Ȯ�� for---");
		for(Unit u : uArr) {
			u.move(100, 200);
		}
				
		//[2] �ڽĸ��� �޼��� ȣ��
		for(int i=0;i<uArr.length;i++) {
			if(uArr[i] instanceof Marine) {
				Marine m = (Marine)uArr[i];
				m.stimpack();
			}else if(uArr[i] instanceof Tank) {
				Tank t = (Tank)uArr[i];
				t.changeMode();						
			}else if(uArr[i] instanceof Dropship) {
				Dropship d = (Dropship)uArr[i];
				d.load();
				d.unload();
			}			
		}//for
		
		System.out.println("\n====Ȯ�� for====");
		for(Unit u : uArr) {
			if(u instanceof Marine) {
				Marine m = (Marine)u;
				m.stimpack();
			}else if(u instanceof Tank) {
				Tank t = (Tank)u;
				t.changeMode();						
			}else if(u instanceof Dropship) {
				Dropship d = (Dropship)u;
				d.load();
				d.unload();
			}
		}//for
		
	}

}
