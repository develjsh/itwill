package com.swing.day1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.person.model.PersonDAO;
import com.person.model.PersonDTO;

public class TableTest3 extends JFrame implements ActionListener{
	JTable table;
	JScrollPane scrollPane;
	DefaultTableModel model = new DefaultTableModel();
	JButton bt;
	String[] colNames= {"��ȣ","�̸�","��ȭ��ȣ"};
	
	public TableTest3(){
		super("��ȭ��ȣ ��ȸ");
		init();
		addEvent();
		
		setSize(400, 300);
		setVisible(true);
	}
	
	private void addEvent() {
		bt.addActionListener(this);
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		table = new JTable();
		model.addColumn("��ȣ");
		model.addColumn("�̸�");
		model.addColumn("��ȭ��ȣ");		
		table.setModel(model);
		
		scrollPane = new JScrollPane();
		scrollPane.setViewportView(table);
		
		bt = new JButton("��ȸ");
		add(bt, "North");
		add(scrollPane, "Center");
		
	}

	public static void main(String[] args) {
		TableTest3 f = new TableTest3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt) {
			try {
				showAll();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}

	private void showAll() throws SQLException {
		//1.		
		//2. db
		PersonDAO dao = new PersonDAO();
		ArrayList<PersonDTO> list =dao.selectAll();
		
		//3.
		if(list==null || list.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�����Ͱ� �����ϴ�.");
			return;
		}
		
		String[][] data = new String[list.size()][3];
		
		for(int i=0;i<list.size();i++) {
			PersonDTO dto = list.get(i);
			
			data[i][0] = dto.getNo()+"";
			data[i][1] = dto.getName();
			data[i][2] = dto.getTel();			
		}//for
		
		model.setDataVector(data, colNames);
		table.setModel(model);
	}

}
