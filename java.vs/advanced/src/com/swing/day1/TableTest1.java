package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableTest1 extends JFrame{
	JTable table;
	JScrollPane scrollPane;
	String[] colNames= {"��ȣ","�̸�","�ּ�"};
	String[][] data = {
			{"1", "ȫ�浿", "����"},
			{"2", "��浿", "��õ"},
			{"3", "�̱浿", "���"},
			{"4", "�ڱ浿", "����"}
	};
	
	public TableTest1(){
		super("jTable ����1");
		
		init();
		
		setSize(300, 300);
		setVisible(true);
	}
	
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		table = new JTable(data, colNames);
		//public JTable(Object[][] rowData, Object[] columnNames)

		scrollPane = new JScrollPane(table);
		
		add(scrollPane);
	}

	public static void main(String[] args) {
		TableTest1 f = new TableTest1();
	}

}
