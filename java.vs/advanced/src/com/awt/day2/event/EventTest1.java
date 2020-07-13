package com.awt.day2.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest1 extends Frame{
	Button bt;
	TextField tf;
	Label lb;
	
	public EventTest1(){
		super("��ư Ŭ�� �̺�Ʈ ����");
		
		bt = new Button("Ȯ��");
		tf = new TextField(10);
		lb = new Label("���⿡ ����� ��µ˴ϴ�.");
		
		setLayout(new FlowLayout());
		
		add(tf);
		add(bt);
		add(lb);
		
		setSize(300, 300);
		setVisible(true);
		
		//�̺�Ʈ ����
		//�̺�Ʈ �ҽ� : bt Button
		//�̺�Ʈ : ActionEvent
		//�̺�Ʈ �ڵ鷯 : ActionListener ������ Ŭ����
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd=e.getActionCommand();
				String result = tf.getText() +", " + cmd+"��ư�� Ŭ����!";
				lb.setText(result);
			}
		});
	}
	
	public static void main(String[] args) {
		EventTest1 f = new EventTest1();
	}

}
