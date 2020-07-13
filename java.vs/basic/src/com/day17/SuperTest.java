package com.day17;

class Parent{
	protected int x=10;
}//class

class Child extends Parent{
	public void method() {
		System.out.println("x="+x);	//10
		System.out.println("this.x="+ this.x);	//10
		System.out.println("super.x="+ super.x);	//10
		
		/*
		 this	- �ڽ��� ����� �����ϴ� this 
		 this() - �ڽ��� �����ڸ� ȣ���ϴ� this()
		 
		 super	- �θ��� ����� �����ϴ� super
		 super()- �θ��� �����ڸ� ȣ���ϴ� super()
		*/
	}
}//class

public class SuperTest {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.method();
	}

}
