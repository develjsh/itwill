package com.day26;

class Outer1{
	private int outerIv=10;
	static int outerCv = 20;
	
	class InstanceInner{
		int iv = outerIv;
		int iv2 = outerCv;
	}
	
	static class StaticInner{
		static int cv = outerCv;
		//int iv = outerIv; //error
		//=> ����ƽ Ŭ������ �ܺ� Ŭ������ static ����� ������ �� �ִ�.
	}
	
	public void method() {
		int lv = 100;
		final double PI = 3.14;
		
		class LocalInner{
			int iv = outerIv;
			int iv2 = outerCv;
			int iv3 = lv; //JDK 8.0 �������� error
			//�ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ����ϴ�.
			//=> JDK 8.0 ���ʹ� ���������� ���� ����

			double d = PI;
		}
	}
}

public class InnerTest2 {
	public static void main(String[] args) {

	}

}
