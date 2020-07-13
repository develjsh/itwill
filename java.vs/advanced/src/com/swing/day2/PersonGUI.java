package com.swing.day2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.person.model.PersonDAO;
import com.person.model.PersonDTO;

public class PersonGUI extends JFrame implements ActionListener{
	private JPanel plN, plS;
	private JLabel lb1, lb2, lb3;
	private JTextField tfNo, tfName, tfTel;
	private JButton btAdd, btEdit, btDel, btSearch, btAll, btCancel;
	private JTable table;
	private JScrollPane scrollPane;
	private DefaultTableModel model;
	private PersonDAO dao;
	private String[] colNames = {"��ȣ","�̸�","��ȭ��ȣ"};
	
	public PersonGUI() {
		super("��ȭ��ȣ ����");
		init();
		addEvent();
		
		setSize(500, 600);
		setVisible(true);
		
		tfName.requestFocus();
	}
	
	private void addEvent() {
		btAdd.addActionListener(this);
		btAll.addActionListener(this);
		btCancel.addActionListener(this);
		btDel.addActionListener(this);
		btEdit.addActionListener(this);
		btSearch.addActionListener(this);
		
		table.addMouseListener(new EventHandler());
		
	}
	
	
	

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dao = new PersonDAO();
		
		plN = new JPanel();
		plS = new JPanel();
		
		lb1 = new JLabel("��ȣ");
		lb2 = new JLabel("�̸�");
		lb3 = new JLabel("��ȭ��ȣ");
		
		tfName=new JTextField(10);
		tfNo=new JTextField(10);
		tfTel=new JTextField(10);
		tfNo.setEditable(false);
		
		plN.add(lb1);
		plN.add(tfNo);
		plN.add(lb2);
		plN.add(tfName);
		plN.add(lb3);
		plN.add(tfTel);
		
		add(plN, "North");
		
		btAdd = new JButton("���");
		btAll = new JButton("��ü��ȸ");
		btCancel = new JButton("���");
		btDel = new JButton("����");
		btEdit = new JButton("����");
		btSearch = new JButton("�˻�");
		
		plS.add(btAdd);
		plS.add(btEdit);
		plS.add(btDel);
		plS.add(btSearch);
		plS.add(btAll);
		plS.add(btCancel);
		
		add(plS, "South");
		
		table = new JTable();
		scrollPane = new JScrollPane();
		model = new DefaultTableModel();
		
		model.addColumn("��ȣ");
		model.addColumn("�̸�");
		model.addColumn("��ȭ��ȣ");
				
		table.setModel(model);
		
		table.getTableHeader().setBackground(Color.black);
		table.getTableHeader().setForeground(Color.yellow);
		table.getTableHeader().setReorderingAllowed(false);
		table.setRowHeight(30);
		
		scrollPane.setViewportView(table);
		
		add(scrollPane, "Center");
		
		//��ü ��ȸ
		try {
			showAll();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		
	}

	private void showAll() throws SQLException {
		//1. 		
		//2. db
		ArrayList<PersonDTO> list = dao.selectAll();
		
		//3.
		if(list==null || list.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�����Ͱ� �������� �ʽ��ϴ�.");
			return;
		}
		
		String[][] data = new String[list.size()][3];
		
		for(int i=0;i<list.size();i++) {
			PersonDTO dto=list.get(i);
			
			data[i][0] = dto.getNo()+"";
			data[i][1] = dto.getName();
			data[i][2] = dto.getTel();			
		}
		
		model.setDataVector(data, colNames);
		table.setModel(model);
	}

	public static void main(String[] args) {
		PersonGUI f = new PersonGUI();
	}
	
	//inner class
	class EventHandler extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			//talbe���� Ư�� row�� Ŭ���ϸ� �ش� ���� �����͸� �о�´�
			int selRow =table.getSelectedRow();
			
			//Object javax.swing.JTable.getValueAt(int row, int column)
			Object objVal = table.getValueAt(selRow, 0);
			String sNo= (String)objVal;
			System.out.println("������ ���� no =" + sNo);
			int no  = Integer.parseInt(sNo);
			
			try {
				showByNo(no);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			
		}
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		try {		
			if(e.getSource()==btAdd) {
				//���
				addPerson();
				clear_tf();
				showAll();
			}else if(e.getSource()==btEdit) {
				editPerson();
				clear_tf();
				showAll();
			}else if(e.getSource()==btDel) {
				deletePerson();
				clear_tf();
				showAll();
			}else if(e.getSource()==btSearch) {
				search();
			}else if(e.getSource()==btAll) {
				showAll();
			}else if(e.getSource()==btCancel) {
				
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}

	private void search() throws SQLException {
		//�̸����� ��ȸ
		
		//1.
		String name =tfName.getText();
		if(name==null || name.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���");
			tfName.requestFocus();
			return;
		}
		
		//2. db
		ArrayList<PersonDTO> list=dao.selectByName(name);
		
		//3.��� ó��
		if(list==null || list.isEmpty()) {
			JOptionPane.showMessageDialog(this, name + "�� �ش��ϴ� �����Ͱ� �������� �ʽ��ϴ�");
			return;
		}
		
		//Table�� �ֱ� ���ؼ��� 2������ ���������Ѵ�
		String[][] data = new String[list.size()][3];
		
		for(int i=0;i<list.size();i++) {
			PersonDTO dto=list.get(i);
			data[i][0] = dto.getNo()+"";
			data[i][1] = dto.getName();
			data[i][2] = dto.getTel();
		}//for
		
		model.setDataVector(data, colNames);
		table.setModel(model);
		
	}

	private void deletePerson() throws NumberFormatException, SQLException {
		//1.
		String no = tfNo.getText();	
		
		if(no==null || no.isEmpty()) {
			JOptionPane.showMessageDialog(this,"��ȣ�� �Է��ϰų� Ŭ���ϼ���");
			return;
		}
		
		//2.
		int cnt = dao.deletePerson(Integer.parseInt(no));
		
		//3.
		String result="";
		if(cnt>0) {
			result="�����Ǿ����ϴ�";
		}else {
			result="�����Ǿ����ϴ�";
			
		}
		JOptionPane.showMessageDialog(this,	result);
		
	}

	private void editPerson() throws SQLException {
		//1.
		String name=tfName.getText();
		String tel=tfTel.getText();
		String no=tfNo.getText();
		
		if(no==null || no.isEmpty()) {
			JOptionPane.showMessageDialog(this, "��ȣ�� �Է��ϼ���");
			return;
		}
		
		if(name==null || name.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���");
			tfName.requestFocus();
			return;
		}
		
		//2.
		PersonDTO  dto = new PersonDTO();
		dto.setNo(Integer.parseInt(no));
		dto.setName(name);
		dto.setTel(tel);
		int cnt = dao.updatePerson(dto);
		
		//3.
		String result="";
		if(cnt>0) {
			result="�����Ǿ����ϴ�";
		}else {
			result="���� ����";
			
		}
		JOptionPane.showMessageDialog(this, result);
		
	}

	public void showByNo(int no) throws SQLException {
		//1.
		//2.db
		PersonDTO dto=dao.selectByNo(no);
		//3.��� ���
		if(dto==null) {
			JOptionPane.showMessageDialog(this, no+"�� �ش��ϴ� �����Ͱ� �����ϴ�.");
			return;
		}
		
		tfName.setText(dto.getName());
		tfTel.setText(dto.getTel());
		tfNo.setText(Integer.toString(no));
		//tfNo.setText(String.valueOf(no));
		
		
	}

	private void clear_tf() {
		tfName.setText("");
		tfNo.setText("");
		tfTel.setText("");
	}

	private void addPerson() throws SQLException {
		//1
		String name=tfName.getText();
		String tel=tfTel.getText();
		
		//�ʼ� �׸��� ��� �Է¾��� ��� ���� ó��
		if(name==null || name.isEmpty()) {
			JOptionPane.showMessageDialog(this, "�̸��� �ݵ�� �Է��ؾ� �մϴ�!");
			tfName.requestFocus();
			return;
		}
		
		//2
		PersonDTO dto = new PersonDTO();
		dto.setName(name);
		dto.setTel(tel);
		
		int cnt=dao.insertPerson(dto);
		
		//3
		String result = "";
		if(cnt>0) {
			result="��ϵǾ����ϴ�.";
		}else {
			result="��� ����!";
		}
		
		JOptionPane.showMessageDialog(this, result);
	}
	
	
}
