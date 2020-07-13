package com.awt.day3.event;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ItemEventTest extends Frame{
	CheckboxGroup group;
	Checkbox ck1, ck2,ck3;
	TextField tfResult;
	
	public ItemEventTest(){
		super("Item Event");
		init();
		addEvent();
		
		setSize(300, 250);
		setVisible(true);		
	}
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});
		
		//�̺�Ʈ �ҽ� : ck1, ck2, ck3
		//�̺�Ʈ ������ : ItemListener
		ck1.addItemListener(new EventHandler());
		ck2.addItemListener(new EventHandler());
		ck3.addItemListener(new EventHandler());		
	}
	
	//inner Class
	class EventHandler implements ItemListener{
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			Checkbox ck=(Checkbox) e.getSource(); //�̺�Ʈ�� �߻��� �ҽ�(������Ʈ)
			String str=ck.getLabel();
			tfResult.setText("������ �׸� : " + str);
		}		
	}

	private void init() {
		setLayout(new FlowLayout());
		
		group=new CheckboxGroup();
		ck1 = new Checkbox("java", group, false);
		ck2 = new Checkbox("jsp", group, false);
		ck3 = new Checkbox("oracle", group, false);
		
		tfResult=new TextField(20);
		
		add(ck1);
		add(ck2);
		add(ck3);
		add(tfResult);		
	}

	public static void main(String[] args) {
		ItemEventTest f = new ItemEventTest();
	}

}
