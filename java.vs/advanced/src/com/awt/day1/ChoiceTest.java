package com.awt.day1;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ChoiceTest {

	public static void main(String[] args) {
		Frame f = new Frame("�޺��ڽ�");
		
		Choice ch = new Choice();
		ch.add("���");  // Choice�� ��Ͽ� ��Ÿ�� ������ �߰��Ѵ�.
		ch.add("��");
		ch.add("��");
		ch.add("����");
		
		f.setLayout(new FlowLayout()); //Frame�� ���̾ƿ� �Ŵ�����  FlowLayout
										//���� ����
		f.add(ch);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}

}
