package com.day15;

import java.util.Scanner;

class FoodSales{
	//��� ����
	private String menu;  
	private int quantity, price;
	private int salesPrice;
	
	private static final double DISCOUNT_RATE=0.15;
	private static int totalPrice;

	//������
	public FoodSales(String menu, int quantity, int price){
		this.menu = menu;
		this.quantity = quantity;
		this.price = price;
	}

	public int getSalesPrice(){
		return salesPrice;
	}

	public static int getTotalPrice(){
		return totalPrice;
	}

	//�޼���
	public void calcSalesPrice(){
		int discount = (int)(price*quantity*DISCOUNT_RATE);
		salesPrice = price * quantity - discount;
	}

	public void calcTotalPrice(){
		totalPrice += salesPrice;
	}
}//class

class FoodSalesTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true)	{
			System.out.println("�޴�, ����, �ܰ��� �Է��ϼ���!");
			String menu = sc.nextLine();
			int quantity = sc.nextInt();
			int price =sc.nextInt();

			FoodSales obj = new FoodSales(menu, quantity, price);
			obj.calcSalesPrice();
			obj.calcTotalPrice();
			
			System.out.println("\n�Ǹűݾ�=" + obj.getSalesPrice());
			System.out.println("�� �Ǹűݾ�=" + FoodSales.getTotalPrice());

			System.out.println("\n�׸��Ͻðڽ��ϱ�?(Q)uit");
			sc.nextLine();
			String str = sc.nextLine();
			if (str.equalsIgnoreCase("Q")) break;
		}//while
		
		sc.close();
	}
	
}//class
