package com.person.model;

import java.sql.Timestamp;

/*
 DTO(Data Transfer Object) 
 - ������ ���� ����
 - �Ű������� ��ȯŸ�Կ� ����
 - ���̺��� �÷����� ��������� ���´�
 - private�������, public getter/setter => �ʼ�
  */
public class PersonDTO {
	//1. ������� - �ʼ�
	private int no;
	private String name; //�浿
	private String tel;//010-100-1000
	private Timestamp regdate;
	
	//2. ������ - ���� 
	public PersonDTO() {
		super();
	}

	public PersonDTO(int no, String name, String tel, Timestamp regdate) {
		super();
		this.no = no;
		this.name = name;
		this.tel = tel;
		this.regdate = regdate;
	}

	//3. getter/setter - �ʼ�
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}

	//toString() �������̵� - ����
	@Override
	public String toString() {
		return "PersonDTO [no=" + no + ", name=" + name + ", tel=" + tel + ", regdate=" + regdate + "]";
	}
	
	
	  
}
