package com.day17;

class Card{
	public static final int WIDTH = 120;
	public static final int HEIGHT = 200;
	
	//final ������ ����� �ʱ�ȭ�ϴ� ��� �����ڿ��� �� �ѹ� �ʱ�ȭ�� �� �ִ�
	//=> �ν��Ͻ����� �ٸ� ���� ���� �� �� �ִ�
	public final String KIND;
	final int NUMBER;
	
	Card(String k, int num){
		this.KIND=k;
		this.NUMBER=num;
	}
	
	public void showInfo() {
		System.out.println("ī�� ���� : " + KIND);
		System.out.println("ī�� ���� : " + NUMBER+"\n");
	}
}//class

public class CardTest {

	public static void main(String[] args) {
		Card c1 = new Card("Heart", 3);
		c1.showInfo();
		
		System.out.println("ī���� ���� ũ�� : " + Card.WIDTH);
		System.out.println("���� ũ�� : " + Card.HEIGHT+"\n");
		
		Card c2 = new Card("Diamond", 7);
		c2.showInfo();
		
		//Card.WIDTH=100;  //error
		//c2.KIND = "Clover"; //error
		
		
	}

}
