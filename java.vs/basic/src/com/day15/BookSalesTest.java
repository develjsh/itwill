package com.day15;

import java.util.Scanner;

public class BookSalesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("å����, ����, �ܰ��� �Է��ϼ���");
			String title=sc.nextLine();
			int qty=sc.nextInt();
			int price=sc.nextInt();
			
			BookSales bs = new BookSales(title, qty, price);
			bs.calcSalesPrice(); //�Ǹűݾ� ���ϱ�
			bs.calcTotalPrice(); //���� �Ǹűݾ� ���ϱ�
			
			System.out.println("\n�Ǹűݾ� : " + bs.getSalesPrice());
			System.out.println("���� �Ǹűݾ� : " 
					+ BookSales.getTotalPrice()+"\n");
			
			System.out.println("�׸��Ϸ��� Q");
			sc.nextLine();
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}//while
		
	}

}
