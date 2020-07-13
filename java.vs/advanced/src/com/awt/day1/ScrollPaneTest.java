package com.awt.day1;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.ScrollPane;

public class ScrollPaneTest {

	public static void main(String[] args) {
		Frame f = new Frame("ScrollPane");
		
		ScrollPane sp = new ScrollPane();
		
		Panel p = new Panel();
		p.setBackground(Color.green);
		p.add(new Button("ù��°"));
		p.add(new Button("�ι�°"));
		p.add(new Button("����°"));
		p.add(new Button("�׹�°"));
		p.add(new Button("�ټ���°"));
		
		sp.add(p);
		f.add(sp);
		
		f.setSize(300,200);
		f.setVisible(true);
		
	}

}
