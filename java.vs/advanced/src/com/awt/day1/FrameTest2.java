package com.awt.day1;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;

public class FrameTest2 {

	public static void main(String[] args) {
		Frame f = new Frame("������ ��ġ ����");
		f.setSize(300, 400);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension dimension=toolkit.getScreenSize();  // ȭ���� ũ�⸦ ���Ѵ�.
		
		// ȭ��ũ���� ���ݰ����� Frameũ���� ���ݰ��� �� ��ġ�� �ϸ�
		// Frame�� ȭ�� ��� ��ġ�ϰ� �ȴ�.
		f.setLocation(dimension.width/2 - 150, dimension.height/2-200);
		f.setVisible(true);		
	}

}
