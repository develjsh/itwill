package com.awt.day1;

import java.awt.Button;
import java.awt.Frame;

public class ButtonTest {

	public static void main(String[] args) {
		Frame f = new Frame("��ư ����");
		
		Button bt = new Button("Ȯ��");
		f.add(bt); //Frame ��  Button �߰�(���Խ�Ű��)
		
		f.setSize(300,200);
		f.setVisible(true);
		
		//Frame�� �⺻ ���̾ƿ��� BorderLayout
		//�����̳ʿ��� ���̾ƿ� �Ŵ����� ���������� ������ �� �ִµ�, 
		//���̾ƿ� �Ŵ����� �����̳��� ũ�Ⱑ ����� ������ �����̳ʿ� ���Ե� ������Ʈ���� 
		//ũ��� ��ġ�� �ڵ������� ������ ��
	}

}
