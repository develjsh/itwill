package com.day15;

public class BookSales {
	private String title;	//å ����
	private int quantity;	//����
	private int price;		//�ܰ�
	private int salesPrice;  //�Ǹűݾ�
	
	//static ����
	private static int totalPrice;	//�Ǹűݾ��� �Ѿ�
	
	//������
	public BookSales(String title, int quantity, int price) {
		this.title=title;
		this.quantity=quantity;
		this.price=price;
	}
	
	//getter/setter
	public int getSalesPrice() {
		return salesPrice;
	}
	
	public static int getTotalPrice() {
		return totalPrice;
	}
	
	//�޼���
	public void calcSalesPrice() {
		salesPrice = price * quantity; //�Ǹűݾ� ���ϱ�
	}
	
	public void calcTotalPrice() {
		totalPrice += salesPrice;		//���� �Ǹűݾ� ���ϱ�
	}
	
}



