package com.day22.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest3 {

	public static void main(String[] args) {
		//��Ģ�� �ִ� ��� for������ �ʱ�ȭ
		ArrayList<Integer> list = new ArrayList<Integer>(4);
		
		//����
		for(int i=0;i<3;i++) {
			list.add((i+1)*2);
		}
		
		//�о����
		for(int i=0;i<list.size();i++) {
			int n = list.get(i);
			System.out.println(n);
		}//for
		
		System.out.println("\n====Ȯ�� for �̿�=====");
		for(int n : list) {
			System.out.print(n+"\t");
		}//for
		
		System.out.println("\n\n---------------------");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> sList = new ArrayList<String>();
		
		for(int i=0;i<2;i++) {
			System.out.println("�̸� �Է��ϼ���!");
			String name = sc.nextLine();
			sList.add(name);
		}
		
		for(int i=0;i<sList.size();i++) {
			String s=sList.get(i);
			System.out.println(s);
		}
			 
	}

}
