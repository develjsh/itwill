package com.awt.day3.event;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ActionEventTest extends Frame implements ActionListener{
	CheckboxGroup group;
	Checkbox ckM, ckF, ck1,ck2,ck3;
	Button btOk;
	
	public ActionEventTest(){
		super("��ư Ŭ���� ó��");
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
		
		//�̺�Ʈ �ҽ� : btOk
		//������ : ActionListener
		btOk.addActionListener(this);
	}

	private void init() {
		setLayout(new FlowLayout());
		
		group = new CheckboxGroup();
		ckM = new Checkbox("����", group, true);
		ckF = new Checkbox("����", group, false);
		
		ck1 = new Checkbox("���");
		ck2 = new Checkbox("��");
		ck3 = new Checkbox("������");
		
		btOk = new Button("Ȯ��");
		
		add(ckM);
		add(ckF);
		add(ck1);
		add(ck2);
		add(ck3);
		add(btOk);
	}

	public static void main(String[] args) {
		ActionEventTest f = new ActionEventTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Checkbox ���� ���õ� �� �о����
		String gender="", fruit="";
		if(ckM.getState()) {
			gender = "��";
		}else if(ckF.getState()) {
			gender ="��";
		}
		
		if(ck1.getState()) {
			fruit += ck1.getLabel()+" ";
		}
		if(ck2.getState()) {
			fruit += ck2.getLabel()+" ";
		}
		if(ck3.getState()) {
			fruit += ck3.getLabel()+" ";
		}
		
		System.out.println("����:"+ gender+", �����ϴ� ����:"+ fruit);
	}

}
