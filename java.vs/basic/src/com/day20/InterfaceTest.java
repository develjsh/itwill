package com.day20;

import java.util.Scanner;

/*
 �������̽�
 - ������ �߻� Ŭ����
 - �߻� �޼���� ����� ����� ���� �� �ִ�
 - �޼��� ��ϸ� ������ ��
 - �ر׸��� �׷��� �ִ� �⺻ ���赵
 - ǥ���� �����ϴ� �뵵�� ���
 - ������ ���, �ּ����� ������ ���
 
 interface �������̽���{
 	public static final ���;
 	public abstarct �߻� �޼���();
 }
 => public static final�̳� public abstract�� ���� ����
 
 �ڽ�Ŭ�������� ������ �� implements Ű���� ���
 class �ڽ� Ŭ���� implements �������̽�{
 
 }
 */

interface IAnimal{
	public abstract void sound();
	void showInfo();
}//

class Dog implements IAnimal{
	public void sound() {
		System.out.println("�۸�!");
	}
	
	public void showInfo() {
		System.out.println("Dog�� �޼���");
	}
}//class

abstract class Mammal implements IAnimal{
	public void showInfo() {
		System.out.println("�������� �޼���");
	}
	
	//sound()�� ���� �Ұ�
	//=> �߻� �޼��尡 ���� �����Ƿ� �ڽĵ� �߻� Ŭ������ ��
}//class

class Cow extends Mammal{
	public void sound() {
		System.out.println("����~");
	}
	
	//=> �������� ���ߴ� sound() �߻� �޼��带 ���������Ƿ� ������ Ŭ������ ��
}//class

class Cat implements IAnimal{
	public void sound() {
		System.out.println("�߿�");
	}
	
	/*
	void showInfo() {  //error:Cannot reduce the visibility of the inherited method from IAnimal
		System.out.println("Cat�� �޼���");
	}
	//interface�� �޼���� public abstract �̹Ƿ� 
	//�������̵��� �� ���� �������� ������ �� ���������� �ȵȴ�
	*/
	
	public void showInfo() { 
		System.out.println("Cat�� �޼���");
	}	
}//class

public class InterfaceTest {
	public static void main(String[] args) {
		//IAnimal ani = new IAnimal() //error: //error:Cannot reduce the visibility of the inherited method from IAnimal
		//=> �������̽��� ��ü ���� �Ұ�		
		
		Dog d = new Dog();
		d.sound();
		d.showInfo();
		
		//Mammal m = new Mammal(); //error=> �߻�޼��� ��ü ���� �Ұ�
		Cow c = new Cow();
		c.sound();
		
		//�������̽��� ������ �̿� ����
		IAnimal ani = new Cat();
		ani.sound();
		ani.showInfo();
		
		Mammal mam = new Cow();
		mam.sound();
		
		//����� �Է� �޾Ƽ� ó��
		Scanner sc = new Scanner(System.in);
		System.out.println("\n1.������ 2.����� 3.��  ����!");
		int type=sc.nextInt();
		
		IAnimal iAni = null; 
		if(type==1) {
			iAni = new Dog();
		}else if(type==2) {
			iAni = new Cat();
		}else if(type==3) {
			iAni = new Cow();
		}else {
			System.out.println("�߸� �Է�!");
			return;
		}
		
		iAni.sound();
	}

}
