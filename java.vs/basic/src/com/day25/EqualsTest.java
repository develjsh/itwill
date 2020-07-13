package com.day25;

class Test{
	private int value;
	
	Test(int value){
		this.value=value;
	}
}//

public class EqualsTest {

	public static void main(String[] args) {
		Test t = new Test(100);
		Test t2 = new Test(100);
		
		if(t.equals(t2)) { //Object�� equals �޼��� ȣ��
			System.out.println("t�� t2�� �ּҴ� ����");
		}else {
			System.out.println("t�� t2�� �ּҴ� �ٸ���");
		}
		
		if(t == t2) {
			System.out.println("t�� t2�� �ּҴ� ����");
		}else {
			System.out.println("t�� t2�� �ּҴ� �ٸ���");
		}
		
		/*
		 �� ������ ==
		 [1] �⺻�������� �� ��
		 [2] ������������ �ּ� ��
		 
		 �� String�� equals() �޼��� - ���ڿ��� �� ��
		 					    - Object�� equals()�� �������̵��� ��
		 					   
		 �� Object�� equals() �޼��� - �ּ� �� 					   	
		 */
		
		t=t2;
		if(t.equals(t2)) {
			System.out.println("t�� t2�� �ּҴ� ������");
		}else {
			System.out.println("t�� t2�� �ּҴ� �ٸ���");
		}
	}

}
