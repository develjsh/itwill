package com.day12;

public class Array2Exam1 {

	public static void main(String[] args) {
		double[][] twoArr=new double[3][2];
		/*
		       i  k 
		twoArr[0][0] = 10.1;  => 0    	0 + 0 
		twoArr[0][1] = 10.2;  => 1		0 + 1
		twoArr[1][0] = 10.3;  => 2		2 + 0
		twoArr[1][1] = 10.4;  => 3		2 + 1
		twoArr[2][0] = 10.5;  => 4		4 + 0
		twoArr[2][1] = 10.6;  => 5		4 + 1
		
		[row][column] => [column�� ũ��*row+column]
		*/
		
		//double[][] twoArr={{10.1, 10.2},{10.3, 10.4},{10.5, 10.6}};

		int n=0;
		for (int i=0;i<twoArr.length ;i++ )	{
			for (int k=0;k<twoArr[i].length ;k++ ){
				twoArr[i][k]=10+(++n/10.0);
			}
		}//for
		
		for(int i=0;i<twoArr.length;i++) { //3
			for(int j=0;j<twoArr[i].length;j++) { //2
				System.out.print(twoArr[i][j]+"\t");
			}
			
			System.out.println();
		}//for
		
		//2���� �迭�� ��ҵ��� 1���� �迭�� �ֱ�
		int row = twoArr.length;  //3��
		int col = twoArr[0].length; //2��

		//1. 1���� �迭 �����
		double[] oneArr=new double[row*col]; //6
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				//2. 2���� �迭�� ��Ҹ� �о 1���� �迭�� �ִ´�
				
				//���� 1���� �迭�� index�� ���Ѵ�
				//[row][column] => [column�� ũ��*row+column]
				int index = i*col + j;
				
				oneArr[index] = twoArr[i][j];
			}
		}//for
		
		//3. 1���� �迭 ���
		System.out.println("\n\n===��ȯ�� 1���� �迭===");
		for(double d : oneArr) {
			System.out.println(d);
		}//for
		
		
	}

}



