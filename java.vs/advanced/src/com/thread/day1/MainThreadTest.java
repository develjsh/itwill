package com.thread.day1;

public class MainThreadTest {

	public static void main(String[] args) {
		System.out.println("main() �޼����Դϴ�");
		
		Thread th=Thread.currentThread();
		System.out.println("���� �������� ������ �̸� : "+th.getName());
		System.out.println("�������� ������ ���� : "+Thread.activeCount());
		
		th.setName("Prime");//������ �̸� ����
		System.out.println("����� �̸� : "+Thread.currentThread().getName());
		
		
		
	}

}
