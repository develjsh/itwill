package com.day20;

//���� �Ǹ���
class FruitSeller{
	private int numOfApple; //�����ϰ� �ִ� ��� ���� 30=>27, 20=>18
	private int myMoney;	//�Ǹ� ���� 0=>4500, 0=>2000
	public final int PRICE_OF_APPLE; //���� ��� ���� 1500, 1000
	
	FruitSeller(int numOfApple, int price){
		this.numOfApple=numOfApple;
		PRICE_OF_APPLE = price;
	}
	
	public int[] saleFruit(int money) {  //3500
		int num = money/PRICE_OF_APPLE;  //3, 2
		//=> 2
		//�Ž������� ���Ѵ�
		int change = money%PRICE_OF_APPLE; //500
		
		numOfApple -= num;  //��� ������ �ٰ�		
		myMoney += (money-change);  //�Ǹż����� �þ
		
		//��������� �Ž������� ���� �迭�� �����Ѵ�
		int[] arr = new int[2];
		
		//�Ž������� ��������� �迭�� �� ��ҿ� �ִ´�
		arr[0] = num;
		arr[1] = change;
		
		//�迭�� �����Ѵ�
		return arr;
	}
	
	public void showInfo() {
		System.out.println("���� ��� ���� : " + numOfApple);
		System.out.println("�Ǹ� ���� : " + myMoney+"\n");
	}
}//class

class FruitBuyer{  //���� ������
	private int myMoney;  //���� �ڻ�  10000=> 5500 => 3500
	private int numOfApple; //������ ��� ���� 0=>3=>5
	
	FruitBuyer(int myMoney){
		this.myMoney = myMoney;		
	}
	
	//������ �����ϴ� �޼���
	public void buyFruit(FruitSeller seller, int money) {
		if(myMoney < money) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
			return;
		}
		
		int[] arr=seller.saleFruit(money);  //3, 2
		int num = arr[0];
		int change = arr[1];
		
		numOfApple += num;
		myMoney -= (money-change);
	}
	
	public void showInfo() {
		System.out.println("������ ��� ���� : " + numOfApple);
		System.out.println("���� ���� �ڻ� : " + myMoney+"\n");
	}
}//class

public class FruitTest {

	public static void main(String[] args) {
		//�������1 : 30�� ��� ����, ���� 1500��
		FruitSeller seller1 = new FruitSeller(30, 1500);
		
		//�������2 : 20�� ��� ����, ���� 1000��
		FruitSeller seller2 = new FruitSeller(20, 1000);
		
		//������ : �����ڻ� 10000��
		FruitBuyer buyer = new FruitBuyer(10000);
		
		//�����ڰ� �������1���� 4500����ŭ�� ��� ����
		buyer.buyFruit(seller1, 4500);
		
		//�����ڰ� �������2���� 2000����ŭ�� ��� ����
		buyer.buyFruit(seller2, 2000);
		
		//�������1�� ���� ���� ���
		seller1.showInfo();
		
		//�������2�� ���� ����
		seller2.showInfo();
		
		//�������� ���� ����
		buyer.showInfo();
		
		//�����ڰ� �������2���� 4000�� ��ŭ �����ϱ�
		buyer.buyFruit(seller2, 4000);
		buyer.showInfo();
		
		//�����ڰ� �������1���� 3500�� ��ŭ �����ϱ�
		//(2000�� ��ŭ �����ϱ�)
		buyer.buyFruit(seller1, 3500);
		buyer.showInfo();
		
	}

}
