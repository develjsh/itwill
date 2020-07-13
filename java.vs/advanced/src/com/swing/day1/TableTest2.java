package com.swing.day1;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableTest2 extends JFrame{
	JTable table;
	JScrollPane scrollPane;
	DefaultTableModel model;
	
	String[] colNames= {"��ȣ","�̸�","�ּ�"};
	String[][] data = {
			{"1", "ȫ�浿", "����"},
			{"2", "��浿", "��õ"},
			{"3", "�̱浿", "���"},
			{"4", "�ڱ浿", "����"}
	};
	
	public TableTest2(){
		super("jTable ����2");
		init();
		
		setSize(300, 300);
		setVisible(true);
	}
	
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//model = new DefaultTableModel(data, colNames);
		model = new DefaultTableModel();
		model.setDataVector(data, colNames);
		
		table = new JTable();
		scrollPane = new JScrollPane(table);
		
		table.setModel(model);
		
		add(scrollPane);
	}

	public static void main(String[] args) {
		TableTest2 f = new TableTest2();
	}

}
