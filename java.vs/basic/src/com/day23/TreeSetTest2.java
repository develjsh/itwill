package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		//�ζ� 
		TreeSet<Integer> tSet = new TreeSet<Integer>();
		
		while(tSet.size()<6) {
			int rnd = (int)(Math.random()*45+1); //1~45
			
			tSet.add(rnd);  //�ߺ����� �ʰ�, ���ĵǾ� ��
		}
		
		Iterator<Integer> iter = tSet.iterator();
		while(iter.hasNext()) {
			int n = iter.next();
			System.out.print(n+" ");
		}//while
		
	}

}
