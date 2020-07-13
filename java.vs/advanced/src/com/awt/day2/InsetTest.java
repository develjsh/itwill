package com.awt.day2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.TextArea;

public class InsetTest  extends Frame{
	Button bt1, bt2;
	TextArea ta;
	MyPanel pl;
	
	//������
	public InsetTest(){
		super("�ٱ� ���� �ֱ�");
		
		bt1 = new Button("Ȯ��");
		bt2 = new Button("���");
		pl = new MyPanel();
		pl.setLayout(new GridLayout(1, 2, 10, 10));
		pl.setBackground(Color.orange);
		
		pl.add(bt1);
		pl.add(bt2);
		
		ta = new TextArea();
		
		this.add(ta, "Center");
		this.add(pl, "South");
		
		this.setSize(300,350);
		
	}
	
	
	//�ٱ� ���� �����ϱ� ���� Container ��  getInsets() �������̵�
	@Override
	public Insets getInsets() {
		//public Insets(int top, int left, int bottom, int right)
		Insets insets = new Insets(50, 20, 30, 40);
		return insets;
	}


	public static void main(String[] args) {
		InsetTest f = new InsetTest();
		f.setVisible(true);
	}

}//

class MyPanel extends Panel{
	@Override
	public Insets getInsets() {
		return  new Insets(20, 20, 20, 20);		
	}
}







