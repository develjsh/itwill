package com.day20;

/*
AAŬ������ BB Ŭ������ �������� ����

Ŭ���� A �� Ŭ���� B�� ���� ȣ������ �ʰ� �������̽��� �Ű�ü�� �ϴ� ���
- Ŭ���� A�� �������̽� I �ϰ� �������� ���迡 �ֱ� ������ 
   Ŭ���� B�� ���濡 ������ ���� ���� 
*/
class AA{
	public void methodA(II i) {
		i.method();
	}
}

interface II{
	void method();
}

class BB implements II{
	public void method() {
		System.out.println("BB�� �޼���!!");
	}
}

class CC implements II{
	public void method() {
		System.out.println("CC�� �޼���!!");
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		AA obj = new AA();
		//obj.methodA(new BB());
		
		//II b = new BB();
		//obj.methodA(b);
		
		obj.methodA(new CC());
		
		II c = new CC();
		obj.methodA(c);
		
	}

}
