package com.test2;

import com.test1.Parent;

public class Child extends Parent{
	public Child(){
		name="�ڽ�";
		age=20;
		address = "���ʵ�";
		//nickName="����"; //error: private
		//number=10; //error: default
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address + "\n");
	}
}
