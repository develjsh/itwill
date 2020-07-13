package com.awt.day3.event;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceEventTest extends Frame implements ItemListener{
	Choice ch;
	List list;
	
	public ChoiceEventTest(){
		super("Item Event!");
		init();
		addEvent();
		
		setSize(300, 200);
		setVisible(true);
	}
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
		
		//�̺�Ʈ �ҽ� : ch, list
		//������ : ItemListener
		ch.addItemListener(this);
		list.addItemListener(this);
		
	}

	private void init() {
		setLayout(new FlowLayout());
		
		ch = new Choice();
		ch.add("java");
		ch.add("jsp");
		ch.add("spring");
		
		list = new List(3);
		list.add("���");
		list.add("����");
		list.add("����");
		list.add("�ڵ�");
		
		add(ch);
		add(list);		
	}

	public static void main(String[] args) {
		ChoiceEventTest f = new ChoiceEventTest();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==ch) {
			String selItem=ch.getSelectedItem();
			int selIndex = ch.getSelectedIndex();
			
			System.out.println("�޺����� ���õ� �׸� : " + selItem
					+", ���õ�  index: " + selIndex);
		}else if(e.getSource()==list) {
			String selItem=list.getSelectedItem();
			int selIndex = list.getSelectedIndex();
			
			System.out.println("����Ʈ���� ���õ� �׸� : " + selItem
					+", ���õ�  index: " + selIndex);			
		}
		
	}

}
