package com.awt.day3.event;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyEventTest extends Frame{
	Label lb1, lb2;
	TextField tfSsn1, tfSsn2;
	
	public KeyEventTest(){
		super("key event");
		
		init();
		addEvent();
		
		this.setSize(400,200);
		this.setVisible(true);
	}
	
	private void addEvent() {
		
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
		
		//�ֹι�ȣ ���ڸ��� ��� �Է��ϸ� ���� �ؽ�Ʈ �ʵ�� ��Ŀ�� �̵��ϱ�
		//�̺�Ʈ �ҽ� : tfSsn1
		//�̺�Ʈ ������ : KeyListener
		tfSsn1.addKeyListener(new EventHandler());
	}

	//inner class
	class EventHandler implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			String ssn1=tfSsn1.getText();
			if(ssn1.trim().length()==6) {
				tfSsn2.requestFocus();
			}
		}

		@Override
		public void keyTyped(KeyEvent e) {
			
		}
		
	}
	
	private void init() {
		this.setLayout(new FlowLayout());
		
		lb1 = new Label("�ֹι�ȣ");
		lb2 = new Label(" - ");
		tfSsn1 = new TextField(10);
		tfSsn2 = new TextField(10);
		tfSsn2.setEchoChar('*');
		
		this.add(lb1);
		this.add(tfSsn1);
		this.add(lb2);
		this.add(tfSsn2);		
	}

	public static void main(String[] args) {
		KeyEventTest f = new KeyEventTest();
	}

}
