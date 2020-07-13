package com.awt.day1;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class ListTest {

	public static void main(String[] args) {
		Frame f = new Frame("List");
		f.setLayout(new FlowLayout());
		
		List list1 = new List(5);
		list1.add("java");
		list1.add("jsp");
		list1.add("oracle");
		list1.add("html");
		list1.add("jquery");
		list1.add("spring");
		
		List list2 = new List(3, true); //���߼��� ����
		list2.add("����");
		list2.add("�ڵ�");
		list2.add("������");
		
		List list3 = new List(); //default=>4
		list3.add("��ǻ��");
		list3.add("��Ʈ��");
		list3.add("�����");
		list3.add("Ű����");
		list3.add("���콺");
		
		f.add(list1);
		f.add(list2);
		f.add(list3);
		
		f.setSize(300, 400);
		f.setVisible(true);
		
	}

}
