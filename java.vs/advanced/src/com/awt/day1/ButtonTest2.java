package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest2 {

	public static void main(String[] args) {
		Frame f = new Frame("��ư");
		f.setLayout(null); //���̾ƿ� �Ŵ����� ���� ����
		
		Button bt = new Button("�ݱ�");
		bt.setSize(100, 50);
		bt.setLocation(100, 75);
		
		f.add(bt);
		
		f.setSize(300, 400);
		f.setVisible(true);
		
	}

}
