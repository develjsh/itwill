package com.day25;

class MyName{
	private String objName;
	
	MyName(String objName){
		this.objName=objName;
	}
	
	//protected void finalize() throws Throwable
	public void finalize() throws Throwable{ //�ν��Ͻ��� �Ҹ�Ǳ� ������
											 //�ڹٰ���ӽſ� ���� �ڵ����� ȣ���
		super.finalize();
		
		System.out.println(objName+" �ν��Ͻ� �Ҹ��!");
	}
}

public class FinalizeTest {

	public static void main(String[] args) {
		MyName obj1 = new MyName("instance1");
		MyName obj2 = new MyName("instance2");
		
		//obj1 = null;  //instance1�� �Ҹ� ����� ��
		//obj2 = null;
		
		obj1 = obj2;  //instance1 �� �Ҹ� ��� 
		obj2 = null;  //
		obj1 = null;  //instance2 �� �Ҹ� ���	
		System.out.println("\n���α׷� ����!!!");
		
		System.gc();
		System.runFinalization();
		//=> finalize �޼����� �Ϻ��� ȣ���� �ʿ��� ��Ȳ������ 
		//�� �� �޼����� ������ ȣ���� �ʿ���
	}

}
