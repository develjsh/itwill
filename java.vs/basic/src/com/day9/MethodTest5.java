package com.day9;

public class MethodTest5 {

	public static void main(String[] args) {
		int sum = getSum(10);
		System.out.println("1~10������ �� : " + sum);
		
		int num=100;
		sum = getSum(num);
		System.out.println("1 ~ " + num +"������ �� : " + sum);
	}

	public static int getSum(int num) {	//�Ű������� num		
		int sum=0;  //��������
		
		//�Ű������� ���������� �����̴�
		//�Ű����� num�� �������� sum�� getSum() �޼��峻���� ��밡���ϰ�
		//�ش� �޼��带 ����� (����Ǹ�) �Ҹ�ȴ�
		
		for(int i=1;i<=num;i++) {
			sum+=i;
		}//for
				
		return sum;
	}
	
}
