package com.day10.array;

public class ArrayExam1 {

	public static void main(String[] args) {
		double[] darr=new double[4];
		darr[0]=70.5;
		darr[1]=90;
		darr[2]=88.3;
		darr[3]=95.4;

		//double[] darr2= {90.6, 88.7, 76.3, 65.4};
		
		double sum=0;
		for (int i=0;i<darr.length ;i++ ){
			sum+=darr[i];
		}
		
		double avg=sum/darr.length;
		
		System.out.println("����: " + sum + ", ���: " + avg);
		System.out.println("����: " + Math.round(sum*10)/10.0 
				+ ", ���: " + Math.round(avg*10)/10.0);
		System.out.println("����: " + (int)(sum*10)/10.0 
				+ ", ���: " + (int)(avg*10)/10.0);

	}

}
