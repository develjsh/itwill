package com.day8;

public class ForExam3 {

	public static void main(String[] args) {		
		for (int dan=2;dan<10 ;dan+=2 ){ //2, 4, 6, 8
			for (int j=1;j<=dan ;j++ ){
				System.out.println(dan+"*"+j +"=" + dan*j);
			}
			System.out.println();
		}//for

		//7. 5*5 �簢�� �ȿ� ���ڰ� ���ʴ�� ������ ���
		for (int i=1;i<26 ;i+=5 ){ //1, 6, 11, 16, 21
			for (int j=0; j<5; j++){ //0,1,2,3,4
				System.out.print(i+j +"\t");
			}
			System.out.println();
		}//�ٱ�for

		System.out.println();
		int num=0;
		for (int i=0;i<5 ;i++ ){
			for (int j=0;j<5 ;j++ ){
				System.out.print(++num +"\t");
			}
			System.out.println();
		}

		System.out.println();
		num=0;
		for (int i=0;i<25 ;i++ ){
			System.out.print(++num +"\t");
			
			if(num%5==0) System.out.println();
		}

		System.out.println();		
		for (int i=1;i<=25 ;i++ ){
			System.out.print(i +"\t");
			
			if(i%5==0) System.out.println();
		}


		
	}

}



