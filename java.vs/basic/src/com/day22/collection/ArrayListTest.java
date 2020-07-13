package com.day22.collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		/*
		 �÷��� �����ӿ�ũ
		 - ������ �׷��� �����ϴ� Ŭ�������� ǥ��ȭ�� ���� 
		 - �޸� ũ�⸦ �������� Ȯ���� �� �ִ�
		 - ����, �˻�, ���� ���� �޼��� ����
		 
		 �÷��� �������̽� 3����
		 [1] List
		 	������ �����ǰ�, �ߺ��� ���
		 	���� Ŭ���� - ArrayList, Vector��
		 [2] Set
		 	������ �������� �ʰ�, �ߺ��� ������ �ʴ´�
		 	���� Ŭ���� - HashSet
		 [3] Map
		 	Ű, �� (key, value)������ ����Ǵ� ������ ����
		 	������ �������� �ʰ�, Ű�� �ߺ������� �ʰ�, ���� �ߺ� ����
		 	���� Ŭ���� - HashMap, Hashtable, Properties
		 */
		
		//1. ����
		ArrayList list = new ArrayList(3);
		list.add(new Integer(10));
		//add(Object obj) <= �Ű������� Object�� �ڽİ�ü�� �־��ش�
		list.add(new Integer(20)); //boxing -�⺻���� �������� WrapperŬ������
									//��ȯ�ϴ� ��
		list.add(35); //jdk 5.0 ���ʹ� �⺻�ڷ����� ���� �� �ְ� ��
		//=> AutoBoxing : �ڵ����� �⺻���� ���������� ��ȯ����
		
		//2. �˻�(������ �о����)
		for(int i=0;i<list.size();i++) {
			Object obj = list.get(i);
			Integer n = (Integer)obj; //downcasting
			
			//public int intValue()
			//=> Returns the value of this Integer as an int.
			int k = n.intValue(); //Integer => int
			System.out.println(i + "��° ��� : " + k);
		}//for
		
		System.out.println("\nlist�� ���� ������ ���� : "+list.size());
		
		list.add(new Double(3.14));
		list.add(4.56f);
		list.add("java");
		//=> ��� �ڷ����� ������ �� �ִ�
		
		Double d=(Double)list.get(3);
		System.out.println("3��° ��� => "+ d);
		
		String s = (String)list.get(5);
		System.out.println("5��° ��� - " + s);
		
		//������ ����
		list.remove(3);  //index�� 3�� ��� ����
		Float f = (Float)list.get(3);
		System.out.println("index�� 3�� ��� ���� �� 3��° ��Ұ� : " + f);
		
		System.out.println("���� �� ����� ���� : " + list.size());
		
		
	}

}
