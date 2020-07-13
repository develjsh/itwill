package com.day19;

class Person{
	public String kind() {
		return "���";
	}
}//

class Student extends Person{
	public String kind() {
		return "�л�";
	}
}//

class Graduate extends Student{
	public String kind() {
		return "���п���";
	}
}//

class Assitant extends Person{
	public String kind() {
		return "����";
	}
}//

class Professor extends Person{
	public String kind() {
		return "����";
	}
}//

public class PolymoArgs {
	/*
	public static void register(Student st) {
		System.out.println(st.kind() + "�� ����� �մϴ�.");
	}

	public static void register(Graduate gr) {
		System.out.println(gr.kind() + "�� ����� �մϴ�.");
	}
	
	public static void register(Assitant as) {
		System.out.println(as.kind() + "�� ����� �մϴ�.");
	}	
	*/
	
	public static void register(Person p) {
		//if(p instanceof Student || p instanceof Graduate 
		//		|| p instanceof Assitant) {
		if(p instanceof Student || p instanceof Assitant) {
			System.out.println(p.kind() + "�� ����� �մϴ�.");
		}else {
			System.out.println(p.kind() + "�� ����� �� �����ϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		register(s);
		
		Graduate g = new Graduate();
		register(g);
		
		register(new Assitant());
		
		Person p = new Professor();
		register(p);
		
	}

}
