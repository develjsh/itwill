package com.day26;

import com.day26.Card.Kind;
import com.day26.Card.Number;

class Card1{
	static final int SPADE=0;
	static final int DIAMOND=1;
	static final int HEART=2;
	static final int CLOVER=3;
	
	static final int TWO=0;
	static final int THREE=1;
	
	final int KIND;
	final int NUMBER;
	
	Card1(int k, int n){
		this.KIND=k;
		this.NUMBER=n;
	}
	
	public void showInfo() {
		System.out.println("KIND = " + KIND);
		System.out.println("NUMBER = " + NUMBER+"\n");
	}
}

class Card{
	enum Kind{SPADE, DIAMOND, HEART, CLOVER};
	enum Number{TWO, THREE};
	
	final Kind KIND;
	final Number NUMBER;
	
	Card(Kind k, Number n){
		this.KIND=k;
		this.NUMBER=n;
	}
	
	public void showInfo() {
		System.out.println("KIND = " + KIND);
		System.out.println("NUMBER = " + NUMBER+"\n");
	}
}

public class EnumTest2 {
	public static void main(String[] args) {
		Card1 c1 = new Card1(0, 0);
		c1.showInfo();
		
		Card c = new Card(Card.Kind.SPADE, Card.Number.TWO);
		c.showInfo();
		
		if(Card1.SPADE == Card1.TWO) { //0==0
			System.out.println("Card1�� SPADE�� Card1�� TWO�� ����");//
		}else {
			System.out.println("Card1�� SPADE�� Card1�� TWO�� �ٸ���");
		}
		
		/*if(Card.Kind.SPADE == Card.Number.TWO) {//Incompatible operand types Card.Kind and Card.Number
			System.out.println("Card.Kind.SPADE�� Card.Number.TWO�� ����");
		}else {
			System.out.println("Card.Kind.SPADE�� Card.Number.TWO�� �ٸ���");
		}
		*/
		
		/*
		  ���� ������δ� Ÿ���� �޶� ���� ������, ���ǽ� ����� true ������, 
		  ���� ���Ե� Ÿ�Կ� ������ ������������ ���� ���� ���Ƶ�
		  Ÿ���� �ٸ��� ���ǽ��� ����� false �� ��
		  
		  �� �Ӹ� �ƴ϶� Ÿ�Ա��� üũ�ϱ� ������ Ÿ�Կ� ������(typesafe) �������̶�� ��
		 */
	}

}
