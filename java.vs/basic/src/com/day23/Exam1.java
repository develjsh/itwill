package com.day23;

import java.util.*;

class Exam1	{
	public static void main(String[] args){
		ArrayList<Double> list=new ArrayList<Double>();

		for (int i=0;i<4 ;i++ ){
			list.add(i+1.5);
		}
		
		System.out.println("--------ArrayList �̿�-------");
		for(int i=0; i<list.size(); i++){
			double num = list.get(i);
			System.out.println(num);
		}

		double[] arr = new double[4];
		for (int i=0; i<arr.length;i++ ){
			arr[i] = i+1.5;
		}
		
		System.out.println("\n--------�迭 �̿�-------");
		
		for (int i=0; i<arr.length;i++ ){
			System.out.println(arr[i]);
		}

		HashSet<Double> hset = new HashSet<Double>(10);

		//������ �Է��ϱ�
		for (int i=0;i<4 ;i++ )	{
			hset.add(i+1.5);
		}

		//�÷����� iterator() �޼��� �̿��Ͽ� ������ �б�
		System.out.println("\n--------HashSet iterator() �̿�--------");
		Iterator<Double> iter = hset.iterator();
		while (iter.hasNext())	{
			double data = iter.next();
			System.out.println(data);
		}//while

		
	}//main
}