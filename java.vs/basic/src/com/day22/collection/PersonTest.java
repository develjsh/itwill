package com.day22.collection;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {
		//�迭 �̿�
		Person[] pArr = new Person[3];
		pArr[0] = new Person("ȫ�浿", 20);
		pArr[1] = new Person("��浿", 10);
		pArr[2] = new Person("�̱浿", 25);
		
		for(int i=0;i<pArr.length;i++) {
			pArr[i].showInfo();
		}//for
		
		System.out.println("\n====Ȯ�� for ===");
		for(Person p : pArr){
			p.showInfo();
		}
		
		//ArrayList �̿�
		ArrayList<Person> pList = new ArrayList<Person>();
		
		pList.add(new Person("���浿", 21));
		pList.add(new Person("���浿", 22));
		Person p = new Person("���浿", 23);
		pList.add(p);
		
		System.out.println("\n====ArrayList=====");
		for(int i=0;i<pList.size();i++) {
			Person p2 = pList.get(i);
			p2.showInfo();
		}

		System.out.println("\n---- Ȯ�� for------");
		for(Person p2 : pList) {
			System.out.println(p2); //toString()ȣ��
		}
		
	}

}
