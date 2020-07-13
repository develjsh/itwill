package com.swing.day1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SwingTest extends JFrame implements ActionListener{

	JButton bt1, bt2, bt3, bt4;
	
	public SwingTest(){
		super("Swing ����");
		
		init();
		addEvent();
		
		setSize(600, 300);
		setVisible(true);
	}
	
	private void addEvent() {
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);		
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1, 4));
		
		ImageIcon icon1 = new ImageIcon("img/open.JPG");
		ImageIcon icon2 = new ImageIcon("img/input.JPG");
		ImageIcon icon3 = new ImageIcon("img/confirm.JPG");
		
		bt1 = new JButton("��ư");
		bt2 = new JButton("OPEN", icon1);
		bt3 = new JButton("INPUT", icon2);
		bt4 = new JButton("CONFIRM", icon3);
		
		ImageIcon icon4 = new ImageIcon("img/exit.JPG");
		bt4.setPressedIcon(icon4);
		bt2.setMnemonic('C'); //����Ű : Alt+C
		
		bt2.setVerticalTextPosition(JButton.BOTTOM);
		bt2.setHorizontalTextPosition(JButton.CENTER);
		
		bt3.setVerticalTextPosition(JButton.TOP);
		bt3.setHorizontalTextPosition(JButton.CENTER);
		bt3.setToolTipText("ǳ�� ����!");
		
		bt1.setBorder(new LineBorder(Color.blue, 5));
		bt2.setBorder(new TitledBorder("�׵θ��� ���� �ֱ�"));
		bt3.setBorder(new BevelBorder(BevelBorder.RAISED));
		//bt3.setBorder(new BevelBorder(BevelBorder.LOWERED));
		bt4.setBorder(new EtchedBorder());
		
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		
	}

	public static void main(String[] args) {
		SwingTest f = new SwingTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			JOptionPane.showMessageDialog(this, "ȯ���մϴ�.");
		}else if(e.getSource()==bt2) {
			JOptionPane.showMessageDialog(this, "������ ������", "���",
					JOptionPane.WARNING_MESSAGE);
		}else if(e.getSource()==bt3) {
			String name
				=JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���");
			setTitle(name);
		}else if(e.getSource()==bt4) {
			int opt=JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?", 
					"����", JOptionPane.YES_NO_CANCEL_OPTION);
			System.out.println("���:"+opt);
			//0=>��,  1=>�ƴϿ�, 2=>���
			
			if(opt == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}//if
		
	}

}
