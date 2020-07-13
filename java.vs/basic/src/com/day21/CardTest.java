package com.day21;

class Card{
	private final int KIND; //ī������ 1~4
	private final int NUMBER; //ī�� ���� 1~10, J, Q, K
	
	private static final int SPADE=1;
	private static final int DIAMOND=2;
	private static final int HEART=3;
	private static final int CLOVER=4;
	
	public static final int MAX_KIND=4;
	public static final int MAX_NUMBER=13;
	
	Card(int k, int n){
		this.KIND=k;  //������� �����ڿ��� �� �ѹ� �ʱ�ȭ, ��ü���� �ٸ� �� �Ҵ� ����
		this.NUMBER=n;
	}
	
	Card(){
		this(SPADE, 1);  //�ڽ��� �ٸ� ������ ȣ��
	}
	
	public String findInfo() {
		String k="", n="";
		
		switch(KIND){
			case SPADE:
				k="SPADE";break;
			case DIAMOND:
				k="DIAMOND";break;
			case HEART:
				k="HEART";break;
			case CLOVER:
				k="CLOVER";break;				
		}
		
		switch(NUMBER) {
			case 11:
				n = "J";break;
			case 12:
				n = "Q";break;
			case 13:
				n = "K";break;
			default:
				n = NUMBER+"";
		}
		
		return "[Card: KIND=" + k+", NUMBER="+ n +"]";
	}
}//

//ī�� �ѹ� - 52���� ī��
class Deck{
	private static final int MAX_CARD=52;
	
	//52���� ī�带 ���� �迭
	private Card[] cardArr = new Card[MAX_CARD];
	private int idx;
	
	Deck() {
		//52���� ī�带 ���� ī�� �迭�� ����
		for(int i=1;i<=Card.MAX_KIND;i++) { //4
			for(int j=1;j<=Card.MAX_NUMBER;j++) { //13
				Card c = new Card(i, j);
				
				cardArr[idx++] = c;
			}
		}//for		
	}
	
	//getter
	public Card[] getCardArr() {
		return cardArr;
	}
	
	public Card pick(int index) {
		//index��° ī�� �̱�
		Card c=null;
		if(index<0 || index >= MAX_CARD) {
			c = pick();
		}else {
			c = cardArr[index];
		}
		
		return c;
	}
	
	public Card pick() {
		//������ ī�� �̱�
		int rnd = (int)(Math.random()*52);
		return cardArr[rnd];
	}
	
	public void shuffle() {
		//ī�� �����ֱ�
		for(int i=0;i<1000;i++) {
			int rnd = (int)(Math.random()*52);
			
			Card temp = cardArr[0];
			cardArr[0] = cardArr[rnd];
			cardArr[rnd] = temp;
		}//for
	}
}//

public class CardTest {
	public static void main(String[] args) {
		Deck d = new Deck();
		
		Card c=d.pick(0);
		String info=c.findInfo();
		System.out.println("ù��° ī�� ���� : " + info+"\n");
		
		System.out.println("====ī�� ���� �� 52���� ī�� ����===");
		Card[] arr=d.getCardArr();
		for(int i=0;i<arr.length;i++) {
			String str = arr[i].findInfo();
			System.out.println(str);
		}//for
		
		//ī�� ����
		d.shuffle();
		System.out.println("\n======ī�带 ���� ��=======");
		for(Card c2 : arr) {
			System.out.println(c2.findInfo());
		}//for
		
		
	}

}





