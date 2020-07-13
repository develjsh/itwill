package com.awt.day3.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventSourceTest extends Frame{
	Button btAdd, btEdit, btDel;
	Label lb;
	
	public EventSourceTest(){
		super("�̺�Ʈ ����");
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
		
		//�̺�Ʈ �ҽ� : btAdd, btEdit, btDel
		//������ : ActionListener
		btAdd.addActionListener(new EventHandler());
		btEdit.addActionListener(new EventHandler());
		btDel.addActionListener(new EventHandler());		
	}

	//inner class
	class EventHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String str = e.getActionCommand();
			
			if(e.getSource()==btAdd) {
				lb.setText(str+"��ư Ŭ��!, �����մϴ�.");
			}else if(e.getSource()==btEdit) {
				lb.setText(str+"��ư Ŭ��!, �����մϴ�.");				
			}else if(e.getSource()==btDel) {
				lb.setText(str+"��ư Ŭ��!, �����մϴ�.");				
			}			
		}
		
	}
	
	private void init() {
		setLayout(new FlowLayout());
		
		btAdd=new Button("���");
		btEdit=new Button("����");
		btDel=new Button("����");
		
		lb = new Label("��ư�� Ŭ���ϸ� ��� ����� �˴ϴ�.");
		
		add(btAdd);
		add(btEdit);
		add(btDel);
		add(lb);		
	}

	public static void main(String[] args) {
		EventSourceTest f = new EventSourceTest();
	}

}
