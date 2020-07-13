package com.day23;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public String toString() {
		return "Person[name="+name+", age="+ age +"]";
	}
	
	public int compareTo(Person p) {
		//���̸� �������� ���ĵǵ��� �������̵�
		if(this.age > p.age) {
			return 1;  //����� ����
		}else if(this.age< p.age) {
			return -1;	//���� ����
		}else {
			return 0;	//0 ����
		}
	}
}//

public class ComparableTest {

	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<Person>();
		
		tSet.add(new Person("ȫ�浿", 20));//Person �ν��Ͻ��� TreeSet<E>�� 
										//����� ��, ���̸� �������� ���ĵ�
		tSet.add(new Person("��浿", 15));
		tSet.add(new Person("�̱浿", 7));
		
		Iterator<Person> iter = tSet.iterator();
		while(iter.hasNext()) {
			Person p = iter.next();
			System.out.println(p);
		}		
		/*	
		 Person �ν��Ͻ��� ũ�� ������ ���� �� �ְ� ��
		 TreeSet<E> ��  Person�ν��Ͻ��� ����� ������  
		 ������ ����� �ν��Ͻ����� �񱳸� ���ؼ� compareTo() �޼��带  ����� ȣ���Ͽ�, 
		 �̶� ��ȯ�Ǵ� ���� ������� ������ ����
	 	*/
		
		//TreeSet<E>�� ����Ǵ� �ν��Ͻ��� �ݵ�� Comparable<T> �������̽��� 
		//�����ϰ� �־�� ��
	}

}
