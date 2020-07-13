package com.awt.day2.event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterTest extends Frame{
		
	public AdapterTest(){
		super("Adapter����");
		
		setSize(300,300);
		setVisible(true);
		
		//�̺�Ʈ ����
		/*
		//�͸� Ŭ���� �̿� 
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}			
		});*/
		
		//���� Ŭ���� �̿�
		this.addWindowListener(new EventHandler());
	}
	
	//inner class
	class EventHandler extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}	
	}
	
	public static void main(String[] args) {
		AdapterTest f = new AdapterTest();		
	}

}
