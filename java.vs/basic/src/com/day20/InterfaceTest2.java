package com.day20;

//AAA�� BBB Ŭ������ �������� ���� (���յ��� ����)
//=> provider �� BBB�� ����Ǹ� User�� AAA�� �����ؾ� ��
class AAA{
	/*
	public void methodA(BBB b) {
		b.method();
	}*/
	
	public void methodA(CCC c) {
		c.method();
	}
}//

class BBB{
	public void method() {
		System.out.println("BBB�� �޼���!");
	}
}//

class CCC{
	public void method() {
		System.out.println("CCC�� �޼���!");
	}
}
public class InterfaceTest2 {
	public static void main(String[] args) {		
		AAA a = new AAA();		
		//a.methodA(new BBB()); //
		
		//BBB b=new BBB();
		//a.methodA(b);
		
		a.methodA(new CCC());
		
		CCC c = new CCC();
		a.methodA(c);
	}

}










