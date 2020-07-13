package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

public class TextFieldTest {

	public static void main(String[] args) {
		Frame f = new Frame("TextField");
		f.setLayout(new FlowLayout());
		
		Label lb1 =new Label("ID : ", Label.RIGHT);
		Label lb2 =new Label("Password : ", Label.RIGHT);
		
		TextField tfId = new TextField(10); 
		//=> �� 10���� ���ڸ� �Է��� �� �ִ� TextField ����
		
		TextField tfPwd = new TextField(10); 
		tfPwd.setEchoChar('*');
		
		f.add(lb1);
		f.add(tfId);
		f.add(lb2);
		f.add(tfPwd);
		
		TextArea ta = new TextArea("�ϰ� ���� ���� �Է��ϼ���", 5, 40);
		f.add(ta);
		ta.selectAll();
		
		f.setSize(400,300);
		f.setVisible(true);
		
	}

}
