package com.awt.day2.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameEventTest extends Frame{

	public FrameEventTest(){
		super("�ݱ� ó��");
		
		//�̺�Ʈ ����
		//=> �̺�Ʈ �ҽ��� �̺�Ʈ �����ʷ� �̺�Ʈ ó���⸦ ����(���)�Ѵ�
		//�̺�Ʈ �ҽ� : Frame
		//�̺�Ʈ : WindowEvent
		this.addWindowListener(new EventHandler());
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	//inner class
	class EventHandler implements WindowListener{

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			//�ݱ� ��ư Ŭ���� ���α׷� ����ǵ��� ó��
			System.exit(0);
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public static void main(String[] args) {
		FrameEventTest f = new FrameEventTest();
	}

}
