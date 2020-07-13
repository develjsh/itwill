package com.day19;

abstract class Animal{  //�߻� Ŭ����
	public abstract void sound();  //�߻� �޼���
	
	public void showInfo() {
		System.out.println("Animal�� showInfo() �޼���");
	}
	
	/*
	  �߻� �޼��� - �޼����� �����ΰ� ���� ��, {}���� ���� ����θ� ����
	  			�ڽ� Ŭ�������� �˸°� �����ؾ� �� (�������̵� �ؾ� ��)
	  			
	  			public abstract ��ȯŸ��  �޼ҵ��(�Ű�����);
	  			
	 �߻� Ŭ���� - �̿ϼ� Ŭ����
	  			�߻�޼��带 �����ϰ� ������ �߻� Ŭ������ ��
	  			�߻� �޼��尡 ������ abstract�� ���̸� �߻� Ŭ������ ��
	  			�߻� Ŭ������ �̿ϼ� Ŭ�����̹Ƿ� ��ü ������ �� ����

	 abstract class Ŭ������{
	 	�߻� �޼���();
	 } 			
	 
	 abstract class Ŭ������{
	 	�Ϲ� �޼���();
	 }
	 
	�� �߻� Ŭ����
	- ����� ���踦 �����ϱ� ���� ���� Ŭ������ 
	    �ν��Ͻ�ȭ��Ű�� ���ؼ� ������ Ŭ������ �ƴ� ��� �߻� Ŭ������ �����

	�� �߻� �޼���
	- �������̵��� ���踦 �����ϱ� ���� ���ǵ� �޼���, 
	    ����ִ� �޼���� �߻� �޼���� �����
	 */
	
}//

class Dog extends Animal{
	public void sound() {
		System.out.println("�۸�!");
	}
}//

class Cat extends Mammal{
	public void sound() {
		System.out.println("�߿�");
	}
}//

abstract class Mammal extends Animal{  //������
	public void breed(int n) {
		System.out.println(n +"���� ������ ���´�");
	}
	
	//�߻� Ŭ������ ��ӹ��� �ڽ� Ŭ�������� �߻� �޼��带 ��� �����ؾ�
	//�Ϲ� Ŭ������ ��
	//�ϳ��� �������� ���� �߻� �޼��尡 ���� �ִٸ� �ڽ� Ŭ������ �߻� Ŭ������
	//�Ǿ�� ��
}//

public class AbstractTest {
	public static void main(String[] args) {
		//Animal ani = new Animal(); //error:�߻� Ŭ������ ��ü ���� �Ұ�
		
		Dog d = new Dog();  //�ڽ��� �߻� �޼��带 �������̵��ϸ�
							//�ڽ��� ������ Ŭ������ �Ǿ� ��ü ������ ��������
		d.sound();
		
		Cat c = new Cat();
		c.sound();
		
		Animal ani = new Cat();  //�߻� Ŭ������ ������ �̿� ����
		ani.sound();
		
		//Mammal m = new Mammal();  //error : �ڽĵ� �߻�Ŭ�����̹Ƿ�
									//��ü ���� �Ұ�
		Mammal m = new Cat();
		m.sound();
		m.breed(2);
		
	}

}
