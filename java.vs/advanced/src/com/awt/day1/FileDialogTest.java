package com.awt.day1;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogTest {

	public static void main(String[] args) {
		Frame f = new Frame("���� ���� ����");
		f.setSize(400, 400);
		f.setVisible(true);
		
		FileDialog fd = new FileDialog(f, "���� ����", FileDialog.LOAD);
		//FileDialog fd = new FileDialog(f, "���� ����", FileDialog.SAVE);
		fd.setDirectory("d:\\lecture");
		fd.setVisible(true);
		
		//������ ������ ����, FileDialog�� �����ư�� ������,
		// getFile()�� getDirectory()�� �̿��ؼ� �����̸��� ��ġ�� ���丮�� 
		//���� �� �ִ�.
		System.out.println("������ dir : " +  fd.getDirectory());
		System.out.println("������ file : " +  fd.getFile());
		System.out.println(fd.getDirectory()+fd.getFile());
		//��Ҹ� ������  null�� ����
	}

}
