package com.day19;

class Car{
	public void drive() {
		System.out.println("���� �����ϴ� �޼���");
	}
	
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}
}//class

class FireEngine extends Car{
	public void drive() {
		System.out.println("�ҹ����� �����մϴ�.");
	}
	
	public void water() {
		System.out.println("water!!!!");
	}
}//class

class Ambulance extends Car{
	public void drive() {
		System.out.println("�ں深���� �����մϴ�.");
	}
	
	public void siren() {
		System.out.println("siren~~~");
	}
}//class

public class CastingTest1 {
	public static void main(String[] args) {
		//�⺻��ó�� ������ ���������� ����ȯ�� ������
		//=> ��, ��Ӱ����� Ŭ���� ���̿����� ����
		
		//[1] ������ ������ �ڵ� ����ȯ => ������
		//�θ� Ÿ�� <- �ڽ�
		//=> upcasting		
		Car c = new FireEngine();
		c.drive();
		//c.water(); //�ڽĸ��� �޼��� ȣ�� �Ұ�
		
		//[2] ������ ������ ����� ����ȯ
		//�ڽ� Ÿ�� <- �θ�
		//=> downcasting
		FireEngine f = (FireEngine)c;
		//=> �θ� ���������� �ڽ� Ÿ�Կ� ����
		f.drive();
		f.water();  //�ڽĸ��� �޼��嵵 ȣ�� ��������
		
		//FireEngine f2 = (FireEngine)new Car();  //�������� ������
		//���࿡�� �߻� : ClassCastException
		
		c = new Ambulance();
		c.drive();
		//c.siren();  //error: �ڽĸ��� �޼��� ȣ�� �Ұ�
		
		Ambulance am = (Ambulance)c;
		am.drive();
		am.siren();  //�ٿ�ĳ���� �ϸ� �ڽĸ��� �޼��嵵 ȣ�Ⱑ������
		
		/*
		 instanceof ������
		 - ���������� �����ϰ� �ִ� �ν��Ͻ��� ���� Ÿ���� �˾ƺ��� ���� ���
		 
		 �������� instanceof Ÿ��(Ŭ����)
		 => ���������� �ش�Ÿ���� �ν��Ͻ��̸� true, �ƴϸ� false�� ����
		 => ���ǹ����� ���
		 ��) c instanceof FireEngine
		 => �������� c�� FireEngine�� �ν��Ͻ����� üũ 
		 */
		boolean bool = c instanceof FireEngine;
		System.out.println("�������� c�� ���� �ν��Ͻ��� FireEngine�ΰ�? "
				+ bool);
		
		System.out.println("c�� ���� �ν��Ͻ��� Ambulance�ΰ�? " 
				+ (c instanceof Ambulance));
		
		if(c instanceof FireEngine) {
			FireEngine f2 = (FireEngine)c;
			f2.water();
		}else if(c instanceof Ambulance) {
			Ambulance am2 = (Ambulance)c;
			am2.siren();
		}
		
		/*
		 �ڽ�  instanceof �θ�Ŭ����
		 => true
		 �ڽ��� �θ��� �ν��Ͻ��̱⵵ �ϴ�
		 */
		FireEngine f3 = new FireEngine();
		if(f3 instanceof Object) {
			System.out.println("f3�� Object�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f3 instanceof Car) {
			System.out.println("f3�� Car�� �ν��Ͻ��̱⵵ �ϴ�");
		}
		if(f3 instanceof FireEngine) {
			System.out.println("f3�� FireEngine�� �ν��Ͻ��̴�");
		}
	
		
		
	}

}
