package com.day16;

/*��� - �θ� Ŭ������ ����� �״�� �����޾� �ڽ� Ŭ�������� �����ϴ� ��
	�ڽ� Ŭ�������� �������� �κ��� �θ� Ŭ�������� �����ϰ�, 
	�ڽ� Ŭ������ �ڽſ� ���ǵ� ����鸸 ����
	
	extends Ű���� �̿�
	
	class �ڽ� extends �θ�{
	
	}
*/

class Parent{
	protected String name;
	protected int age;
	protected int money=1000;
}//class

class Child extends Parent{
	Child(){
		name="�ڽ�";
		age=35;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�������� ���� : " + money+"\n");		
	}
}//class

class Daughter extends Parent{
	Daughter(){
		name="��";
		age=30;
	}
	
	public void showInfo() {
		System.out.println("�̸� - " + name);
		System.out.println("���� - " + age);
		System.out.println("�������� ���� - " + money +"\n");
	}
}//class

class GrandChild extends Child{	
	GrandChild(){
		name = "����";
		age = 2;
	}	
}

public class Inheritance1 {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.showInfo();
		
		Daughter d = new Daughter();
		d.showInfo();
		
		GrandChild gc = new GrandChild();
		gc.showInfo();
	}

}
