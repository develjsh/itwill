package com.day7;

public class ForDup2 {

	public static void main(String[] args) {
		//������ ���
		for(int dan=2;dan<=9;dan++) {
			for(int j=1;j<=9;j++) {
				System.out.println(dan + " * " + j + " = " + dan*j);	
			}//���� for
			
			System.out.println();
		}//�ٱ� for
		
		//���� ������ ���
		System.out.println("\n\n======���� ������=======");
		for(int i=1;i<=9;i++) {
			for(int dan=2;dan<=9;dan++) {
				System.out.print(dan + "*" + i + "=" + dan*i +"\t");
			}
			System.out.println();
		}//for
		
	}

}





