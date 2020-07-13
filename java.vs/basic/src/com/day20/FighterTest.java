package com.day20;

interface Attackable{
	void attack(Unit2 u);  //�ش� ������ �����ϴ� ���
}

interface Movable{
	void move(int x, int y); //������ ��ġ�� �̵��ϴ� ���
}

//�������̽������� extends Ű���带 �̿��Ͽ� ���� ��� ����
//���� ��ӵ� ����
interface Fightable extends Attackable, Movable{
}

abstract class Unit2{
	protected int x, y; //������ ��ġ
	protected int currentHp; //������ ü��
	
	Unit2(int x, int y, int currentHp){
		this.x=x;
		this.y=y;
		this.currentHp=currentHp;
	}
}//

class Fighter extends Unit2 implements Fightable{
	Fighter(int x, int y, int currentHp){
		super(x, y, currentHp);
	}
	
	public void attack(Unit2 u) {
		System.out.println("x=" + u.x +", y=" + u.y
			+"�� ��ġ�� �ְ�, ü���� " + u.currentHp +"�� ������ �����Ѵ�.");
	}
	
	public void move(int x, int y) {
		System.out.println("x=" + x +", y=" + y +"�� ��ġ�� �̵��Ѵ�.");
	}
}

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter(10, 20, 150);
		//40, 50 ��ġ�� �̵��ϱ�
		f.move(40, 50);
		
		//���� ��ġ�� �ִ� ���� �����ϱ�
		Unit2 u = new Fighter(40, 50, 100);
		f.attack(u);
		
		//�ڽ��� �θ��� �ν��Ͻ��̱⵵ �ϴ�
		if(f instanceof Unit2) {
			System.out.println("f�� Unit2�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f instanceof Fightable) {
			System.out.println("f�� Fightable�� ������ Ŭ�����̴�.");
		}
		if(f instanceof Attackable) {
			System.out.println("f�� Attackable�� ������ Ŭ�����̴�.");
		}
		if(f instanceof Movable) {
			System.out.println("f�� Movable�� ������ Ŭ�����̴�.");
		}
		if(f instanceof Object) {
			System.out.println("f�� Object�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		
		
		
		
		
	}

}
