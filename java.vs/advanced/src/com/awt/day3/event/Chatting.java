package com.awt.day3.event;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class Chatting extends Frame implements ActionListener{
	TextArea ta;
	TextField tf;
	
	private String nickName;
	
	public Chatting() {
		super("Chatting");
		
		init();
		addEvent();
		
		setSize(300,300);
		setVisible(true);
	}
	
	
	private void addEvent() {
		this.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
			
		});
		
		//�̺�Ʈ �ҽ� : tf
		//������ : ActionListener
		tf.addActionListener(this);
	}


	private void init() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� �Է�!");
		nickName = sc.nextLine();
		
		
		ta = new TextArea();
		ta.setEditable(false);
		ta.setText("#"+ nickName + "�� ��ſ� ä�õǼ���.");
		
		tf = new TextField();
		
		add(ta, "Center");
		add(tf, "South");
		
		tf.requestFocus();
		
	}


	public static void main(String[] args) {
		
		Chatting f =new Chatting();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf) {
			String content = tf.getText();
			ta.append("\r\n"+nickName+">"+content);
			tf.setText("");
			
		}
	}

}
