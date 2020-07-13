package com.day26;

class Outer3{
	class InstanceInner{}
	static class StaticInner{}
	
	public void method1() {
		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
	}
	
	static public void method2() {
		//InstanceInner ii = new InstanceInner(); //error
		//=> static����� �ν��Ͻ������ ���� ������ �� ����.
		
		StaticInner si = new StaticInner();
	}
}

public class InnerTest5 {

	public static void main(String[] args) {
		
	}

}
