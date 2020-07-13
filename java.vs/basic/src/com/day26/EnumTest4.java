package com.day26;

enum OverTimeValues{
	//�߱ټ���� ���� �ٹ� ���� ���� ������
	THREE_HOUR(18000),
	FIVE_HOUR(30000),
	WEEKEND_FOUR_HOUR(40000),
	WEEKEND_EIGHT_HOUR(60000);
	
	private final int amount;
	
	//������
	OverTimeValues(int amount){
		this.amount=amount;
	}
	
	public int getAmount() {
		return amount;
	}
}

public class EnumTest4 {

	public static void main(String[] args) {
		OverTimeValues overTime = OverTimeValues.FIVE_HOUR;
		System.out.println("5�ð� �߱� : " + overTime +", �߱� ���� : "
				+ overTime.getAmount() + "��");
		
		System.out.println("���� 8�ð� �ٹ� : " 
				+ OverTimeValues.WEEKEND_EIGHT_HOUR
				+", ���� �ٹ� ���� : " 
				+ OverTimeValues.WEEKEND_EIGHT_HOUR.getAmount()+"��");
		
	}

}
