package com.day7;

public class ForDup1 {

	public static void main(String[] args) {
		/* ��ø for
		- for�� �ȿ� for���� �� ��
		
		for(�ʱ��;���ǽ�;������){
			for(�ʱ��;���ǽ�;������){
				ó���� ����
			} //���� for
		} //�ٱ� for
		 
		=> �ٻ� for�� ���� for 
		*/
		
		for(int i=0;i<3;i++) {
			System.out.println("========���� i : " + i);
			
			for(int j=0;j<2;j++) {
				System.out.println("���� j -> " + j);
			}//���� for
			
			System.out.println();
		}//�ٱ� for

		/*
		===== i : 0
		  j -> 0
		  j -> 1
		  
		===== i : 1
		  j -> 0
		  j -> 1
		===== i : 2
		  j -> 0
		  j -> 1  
		*/
		
	}

}
