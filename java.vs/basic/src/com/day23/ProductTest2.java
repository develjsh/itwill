package com.day23;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	//�����ڰ� ������ ��ǰ���� ������ �迭
	private ArrayList<Product> pdList = new ArrayList<Product>();
	
	Buyer(int myMoney){
		this.myMoney=myMoney;
	}
	
	public void buyProduct(Product p) {
		if(myMoney < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�!!");
			return;
		}
		
		myMoney -= p.price;  //��ǰ���ݸ�ŭ ���� �ڻ��� �ٰ�
		point += p.bonusPoint; //��ǰ ����Ʈ��ŭ ����Ʈ�� �þ��
		
		//������ ��ǰ�� �迭�� ����
		pdList.add(p);
		
		System.out.println(p.findInfo() + "�� �����Ͽ����ϴ�.\n");
	}
	
	public void showInfo() {
		System.out.println("�������� ���� ���� �ڻ� : " + myMoney);
		System.out.println("���� ����Ʈ : " + point+"\n");
	}
	
	public void summary() {
		int sum=0;
		String str="";
		
		if(pdList.isEmpty()) {
			System.out.println("������ ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i=0;i<pdList.size();i++) {
			Product p=pdList.get(i);
			
			sum+= p.price;  //������ ��ǰ�� ���� ����
			str += p.findInfo()+" ";
		}//for
		
		System.out.println("�����ڰ� ������ ��ǰ���� �� ���� : " + sum);
		System.out.println("������ ��ǰ ��� : " + str);
	}
	
	public void refund(Product p) {
		//������ ��ǰ ��ȯ(ȯ��)
		if(pdList.remove(p)) {
			myMoney += p.price;
			point -= p.bonusPoint;
			
			System.out.println(p.findInfo()+"�� ��ǰó���Ǿ����ϴ�.");
		}else {
			System.out.println(p.findInfo() + "�� ���Ÿ�Ͽ� ��� ��ǰ �Ұ�!");
		}
	}
}//

public class ProductTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer(1000);
		
		//�� ���Ű��ݰ� ��� ��� summary
		b.summary();
		
		//170������ ��ǻ�� ����
		Product com = new Computer(170);
		b.buyProduct(com);
		
		//300������ TV ����
		b.buyProduct(new Tv(300));
		
		//250������ ��ǻ�� ����
		b.buyProduct(new Computer(250));
		
		//�� ���Ű��ݰ� ��� �ٽ� ��� summary
		b.summary();
		
		//showInfo ȣ��
		b.showInfo();
		
		//170���� ��ǻ�� ��ǰ
		//b.refund(new Computer(170)); //��ǰ �Ұ�
		b.refund(com);
		
		//���� showInfo, summary ȣ��
		b.showInfo();
		b.summary();
	}

}
