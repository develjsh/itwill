package com.day26;

public class InnerTest {
	//���� Ŭ���� - �ν��Ͻ� Ŭ���� 
	class InstanceInner{
		int iv=100;
		//static int cv = 200; //error
		//=> ���� Ŭ������ static Ŭ������ static ����� ���� �� �ִ�
		
		static final int CONST=300; //final static�� ��� ����
	}
	
	//staticŬ����
	static class StaticInner{
		int iv=1000;
		static int cv =2000; 
		static final int CONST = 3000;
	}
	
	public void method() {
		//���� Ŭ����
		class LocalInner{
			int iv = 10;
			//static int cv = 20; //error
			static final int CONST = 30;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InnerTest.StaticInner.cv);
		System.out.println(StaticInner.CONST);
		System.out.println(InstanceInner.CONST);
	}

}
