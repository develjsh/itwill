package com.day21;

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
	private Product[] pdArr = new Product[10];
	private int count;  //�迭�� index�� ���
	
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
		pdArr[count++] = p;
		
		System.out.println(p.findInfo() + "�� �����Ͽ����ϴ�.\n");
	}
	
	public void showInfo() {
		System.out.println("�������� ���� ���� �ڻ� : " + myMoney);
		System.out.println("���� ����Ʈ : " + point+"\n");
	}
	
	public void summary() {
		int sum=0;
		String str="";
		
		for(int i=0;i<count;i++) {
			sum+= pdArr[i].price;  //������ ��ǰ�� ���� ����
			str += pdArr[i].findInfo()+" ";
		}//for
		
		System.out.println("�����ڰ� ������ ��ǰ���� �� ���� : " + sum);
		System.out.println("������ ��ǰ ��� : " + str);
	}
}//

public class ProductTest2 {
	public static void main(String[] args) {
		/*
		Buyer b = new Buyer(1000);
		
		//200������ Tv ����
		b.buyProduct(new Tv(200));
		
		//150������ Computer ����
		Product p=new Computer(150);
		b.buyProduct(p);
		
		//��������  ���� ���� ���
		b.showInfo();
		b.summary();
		*/
		
		Scanner sc = new Scanner(System.in);
		Buyer b = new Buyer(1000);
		
		while(true) {
			System.out.println("1.��ǰ���� 2.���ų��� ��ȸ 3.����");
			int type = sc.nextInt();
			
			switch(type) {
				case 1:
					System.out.println("������ ��ǰ�� �����ϼ���(1.TV 2.��ǻ��)");					
					int pdType = sc.nextInt();
					if(pdType!=1 && pdType!=2) {						
						System.out.println("��ǰ �߸� ����!!");
						continue;						
					}
					
					System.out.println("��ǰ ������ �Է��ϼ���");
					int price = sc.nextInt();
					
					Product p = null;
					if(pdType==1) {
						p=new Tv(price);
					}else if(pdType==2) {
						p=new Computer(price);
					}
					
					b.buyProduct(p);
					b.showInfo();
					break;
				case 2:
					b.summary();
					break;
				case 3:
					System.out.println("�����մϴ�.");
					return;
				default:
					System.out.println("�߸� �Է�!");
			}//switch
			
		}//while
		
	}

}
