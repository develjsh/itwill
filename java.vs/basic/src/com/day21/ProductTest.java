package com.day21;

/*
abstract class Product{
	protected int price; //��ǰ ����
	protected int bonusPoint; //����Ʈ ����
	private static final double POINT_RATE = 0.02; 
	//=> ����Ʈ ������ ��ǰ�� 2%
	
	Product(int price){
		this.price=price;
		this.bonusPoint=(int)(price * POINT_RATE);		
	}
	
	public abstract String findInfo(); //��ǰ�� ����
}//

class Tv extends Product{
	Tv(int price){
		super(price);
	}
	
	public String findInfo() {
		return "Tv";
	}
}//

class Computer extends Product{
	Computer(int price){
		super(price);
	}
	
	public String findInfo() {
		return "Computer";
	}
}//

class Buyer{  //������
	private int myMoney;
	private int point;
	
	Buyer(int myMoney){
		this.myMoney=myMoney;
	}
	
	public void buyProduct(Product p) {
		myMoney -= p.price;  //��ǰ���ݸ�ŭ ���� �ڻ��� �ٰ�
		point += p.bonusPoint; //��ǰ ����Ʈ��ŭ ����Ʈ�� �þ��
		
		System.out.println(p.findInfo() + "�� �����Ͽ����ϴ�.\n");
	}
	
	public void showInfo() {
		System.out.println("�������� ���� ���� �ڻ� : " + myMoney);
		System.out.println("���� ����Ʈ : " + point+"\n");
	}
}//
*/

public class ProductTest {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//200������ Tv ����
		b.buyProduct(new Tv(200));
		
		//150������ Computer ����
		Product p=new Computer(150);
		b.buyProduct(p);
		
		//��������  ���� ���� ���
		b.showInfo();
	}

}
