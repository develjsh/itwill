package com.day15;

public class PersonTest {

	public static void main(String[] args) {
		System.out.println("PersonTest Ŭ������ main() �޼���!!");
		System.out.println("count = "  + Person.count+"\n");
		
		Person hong = new Person("ȫ�浿", 20);
		hong.display();
		
		Person kim = new Person("��浿", 25);
		kim.display();
		
	}

}




