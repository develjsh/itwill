package com.awt.day1;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CheckBoxTest {

	public static void main(String[] args) {
		Frame f = new Frame("checkbox");
		f.setLayout(new FlowLayout());
		
		Label lb = new Label("1. ����� ���� �оߴ�? (������ ���� ����)");
		Checkbox cb1 = new Checkbox("news");
		Checkbox cb2 = new Checkbox("sports");
		Checkbox cb3 = new Checkbox("movie");
		Checkbox cb4 = new Checkbox("music");
		
		f.add(lb);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		
		Label lb2 = new Label("2. ������?");
		CheckboxGroup group1 = new CheckboxGroup();
		Checkbox cbM = new Checkbox("����", group1, true);
		Checkbox cbF = new Checkbox("����", group1, false);
		
		f.add(lb2);
		f.add(cbM);
		f.add(cbF);
		
		Label lb3 = new Label("3. ��ǻ�� ���ð���?");
		CheckboxGroup group2 = new CheckboxGroup();
		Checkbox cbh1 = new Checkbox("5�ð� ����", group2, false);
		Checkbox cbh2 = new Checkbox("10�ð� ����", group2, false);
		Checkbox cbh3 = new Checkbox("15�ð� �̻�", group2, false);
		
		f.add(lb3);
		f.add(cbh1);
		f.add(cbh2);
		f.add(cbh3);
		
		f.setSize(300, 400);
		f.setVisible(true);
		
	}

}
