package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		tSet.add(10); //����ɶ����� �����Ͱ� ���ĵ�
		tSet.add(2); 
		tSet.add(5); 
		tSet.add(99); 
		tSet.add(2); 
		
		System.out.println("����� ���� : " + tSet.size());
		
		Iterator<Integer> iter = tSet.iterator();
		while(iter.hasNext()) {
			int n = iter.next();
			System.out.println(n); 
		}
		
		TreeSet<String> tSet2 = new TreeSet<String>();
		
		tSet2.add("java");
		tSet2.add("�ѱ�");
		tSet2.add("abcdef");
		tSet2.add("������");
		tSet2.add("123");
		tSet2.add("ABC");
		tSet2.add("Oracle");
		tSet2.add("78");
		
		System.out.println("\n����� ���� : " + tSet2.size());
		
		Iterator<String> iter2 = tSet2.iterator();
		while(iter2.hasNext()) {
			String s = iter2.next();
			System.out.println(s);
		}
		
	}

}
