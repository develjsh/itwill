package com.thread.day1;

import javax.swing.JOptionPane;

public class ThreadTest3 {
	static boolean inputCheck = false;
	
	public static void main(String[] args) {
		MyThread4 th1 = new MyThread4();
		th1.start();
		MyRunnable2 r = new MyRunnable2();
		Thread th2 = new Thread(r);
		th2.start();
		System.out.println("main ������ ����!!");
		
		
	}

}


class MyThread4 extends Thread{

	@Override
	public void run() {
		System.out.println("10�ʾȿ� ���� �Է��ؾ� �մϴ�.");
		String s = JOptionPane.showInputDialog("�ƹ� ���̳� �Է��ϼ���.");
		ThreadTest3.inputCheck = true;
		//boolean com.thread.day1.ThreadTest3.inputCheck
		System.out.println("�Է°��� " + s + "�Դϴ�.");
	}
	
}

class MyRunnable2 implements Runnable{

	@Override
	public void run() {
		for (int i=10;i>0;i--) {
			if(ThreadTest3.inputCheck) return;
			
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("10�� ���� ���� �Էµ��� �ʾ� �����մϴ�.");
		System.exit(0);

	}
	
}

