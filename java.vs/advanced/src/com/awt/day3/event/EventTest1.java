package com.awt.day3.event;

import java.awt.Choice;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventTest1 extends Frame implements ItemListener {
	Choice ch;
	List ls;
	Panel p;
	TextField tf;
	Label lb, lb2;

	public EventTest1() {
		super("Event Test");

		init();
		addEvent();

		setSize(300, 300);
		setVisible(true);

	}

	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}

		});

		// �ҽ� : ls
		// ������ : itemlistener
		ls.addItemListener(this);

	}

	private void init() {
		lb = new Label("��밡�� ���");
		lb2 = new Label("���");

		ch = new Choice();
		ch.add("jsp");
		ch.add("java");
		ch.add("oracle");
		p = new Panel();
		p.add(lb);
		p.add(ch);
		p.add(lb2);

		ls = new List(3);
		ls.setSize(30, 30);
		ls.add("�౸");
		ls.add("�߱�");
		ls.add("����");
		ls.add("��ȭ");
		p.add(ls);
		tf = new TextField();
		tf.setEditable(false);

		add(p, "Center");
		add(tf, "South");

	}

	public static void main(String[] args) {
		EventTest1 f = new EventTest1();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == ls) {
			String str = ls.getSelectedItem();
			System.out.println("����Ʈ���� ������ �� : " + str);
		}

	}

}
