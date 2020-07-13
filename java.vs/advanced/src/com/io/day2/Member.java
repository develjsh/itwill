package com.io.day2;

import java.io.Serializable;

//����ȭ ���� Ŭ����(��Ʈ��ũ ���� �����Ѵٰ� ǥ��)
public class Member implements Serializable {
	private String userid;
	transient private String pwd;//����ȭ ��󿡼� ����(��й�ȣ�� ������ �ʰڴ�, pwd�� null�� ��µ�)

	private int age;
	
	public Member() {
		super();
	}

	public Member(String userid, String pwd, int age) {
		super();
		this.userid = userid;
		this.pwd = pwd;
		this.age = age;
	} 
	
	public void showInfo() {
		System.out.println("-------" + userid + "�� ����-------");
		System.out.println("���̵� : " + userid);
		System.out.println("��й�ȣ : " + pwd);
		System.out.println("���� : " + age);
	}
	
	
}
