package com.day25;

class Person2{
	private long id;
	
	Person2(long id){
		this.id=id;
	}
	
	//Object�� equals() �������̵�
	//public boolean equals(Object obj)
	
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Person2) {
			Person2 p = (Person2)obj;
			return this.id == p.id;  //id�� ������ true�� �����ϵ��� �������̵�
		}else {
			return false;
		}
	}
	
}

public class EqualsTest2 {

	public static void main(String[] args) {
		Person2 p = new Person2(9901071234567L);
		Person2 p2 = new Person2(9901071234567L);
		Person2 p3 = new Person2(9812282934567L);
		
		if(p==p2) {
			System.out.println("p�� p2�� �ּҴ� ����");
		}else {
			System.out.println("p�� p2�� �ּҴ� �ٸ���"); //
		}
				
		if(p.equals(p2)) {  //�������̵� �޼��� ȣ��
			System.out.println("p�� p2�� ���� ����̴�."); //
		}else {
			System.out.println("p�� p2�� �ٸ� ����̴�"); 
		}
		
		if(p.equals(p3)) {
			System.out.println("p�� p3�� ���� ����̴�."); 
		}else {
			System.out.println("p�� p3�� �ٸ� ����̴�"); //
		}
		
	}

}
