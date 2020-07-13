package com.day22.collection;

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	//public String toString()
	
	//Object�� toString() �������̵�
	public String toString() {
		return "Person [name="+name+", age="+ age +"]";
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age+"\n");
	}
}

public class ObjectTest2 {

	public static void main(String[] args) {
		Person p = new Person("ȫ�浿", 20);
		
		System.out.println("p.toString()=>"+p.toString());
		System.out.println("p="+p);  //toString()�޼��� ȣ��
		System.out.println(p);
		

	}

}
