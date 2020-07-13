package com.awt.day2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame("BorderLayout");
		f.setLayout(new BorderLayout());
		//=> Frame�� �⺻������ BorderLayout�� �����Ǿ������Ƿ� ���� �������� �ʾƵ� ��

		Button btE = new Button("��");
		Button btW = new Button("��");
		Button btS = new Button("��");
		Button btN = new Button("��");
		Button btC = new Button("Center");
		
		//f.add(btE,"East");
		f.add(btW,"West");
		//f.add(btS,"South");
		f.add(btN,"North");
		//f.add(btC, BorderLayout.CENTER);
		
		f.setSize(300, 300);
		f.setVisible(true);
		
		// Center�� ������Ʈ�� ������ �� �ڸ��� ����ְ� ��
		// �ٸ� �ڸ��� ä���� ���� ������ Center�� ������Ʈ�� �� �ڸ��� �޿�� ��

	}

}
