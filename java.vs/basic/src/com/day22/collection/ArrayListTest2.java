package com.day22.collection;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		//generic �÷��� - �÷��ǿ� ������ ��ü�� Ÿ���� �����ϴ� ��
		ArrayList<Integer> list = new ArrayList<Integer>(3);
		
		System.out.println("list�� ����� ���� : " + list.size());  //0
		
		//1. ������ �����ϱ�
		list.add(1); //autoboxing
		list.add(2);
		list.add(37);
		list.add(4);
		
		//2. ������ �о����
		for(int i=0;i<list.size();i++) {
			int n=list.get(i); //����ȯ �ʿ���� 
			//=> unboxing:����� ���� ���� ���� �⺻�� ������ ���� �ٷ� ��� ��
			
			System.out.println(n);
		}//for
		
		//������ ����
		list.remove(1); //index�� 1�� ��� ����
		
		System.out.println("\n====������ ���� ��======");
		for(int n : list) {
			System.out.print(n +"\t");
		}//for
		
		System.out.println("\n\n���� �� ���� : " + list.size());
		
	}

}
