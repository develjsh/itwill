package com.day26;

import com.day26.Outer.InstanceInner;
import com.day26.Outer.StaticInner;

class Outer{
	class InstanceInner{
		int iv=10;
		final static int CONST=20;
	}
	
	static class StaticInner{
		int iv=100;
		static int cv=200;
	}
	
	public void method() {
		class LocalInner{
			int iv=1000;
		}
		//�޼��� ���� ���������� ����� ���� Ŭ������ �ܺο��� ������ �� ����.
	}
	
}

public class InnerTest3 {
	public static void main(String[] args) {
		System.out.println("staticŬ������ static����: "
				+Outer.StaticInner.cv);
		System.out.println("�ν��Ͻ� Ŭ������ static final����: "
				+Outer.InstanceInner.CONST);
		
		// �ν��Ͻ�Ŭ������ �ν��Ͻ��� �����Ϸ��� �ܺ� Ŭ������ �ν��Ͻ��� ���� �����ؾ��Ѵ�.
		Outer outer = new Outer();
		Outer.InstanceInner iInner = outer.new InstanceInner();
		System.out.println("�ν��Ͻ� Ŭ������ �ν��Ͻ� ����: "+iInner.iv);
		
		Outer.StaticInner sInner = new Outer.StaticInner();
		System.out.println("static Ŭ������ �ν��Ͻ� ����: "+sInner.iv);
		
	}

}
