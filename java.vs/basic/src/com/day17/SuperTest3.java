package com.day17;

class Father{
	protected String name;
	
	Father(String name){
		this.name=name;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
	}
}//class

class Son extends Father{
	//�θ� �����ڿ� �Ű������� �����Ƿ� �ڽ� Ŭ�������� �ݵ�� �����ڰ� �־�� ��
	Son(String name){
		super(name);  //�θ� �����ڿ� �Ű������� �־���� �ϹǷ�
	}
	
}//class

public class SuperTest3 {
	public static void main(String[] args) {
		Son s = new Son("�Ƶ�");
		s.showInfo();
	}

}
