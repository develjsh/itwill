package com.day20;

abstract class Player{
	protected int curPos;
	protected boolean isPaused;
	
	Player(){  //�߻� Ŭ������ ������ ��� ����
		curPos=0;
		isPaused=false;
	}
	
	//������ ��ġ���� ����� �����ϴ� ���
	public abstract void play(int pos);
	public abstract void stop();  //����� ���ߴ� ���
	
	public void play() {
		play(curPos);  //�߻� �޼��� ȣ�� ����
	}
	
	public void paused() {
		if(isPaused) {  //�Ͻ����� ������ ���
			isPaused = false;
			play();
		}else {  //��� ������ ���
			isPaused = true;
			stop();
		}
	}
}//class

class CDPlayer extends Player{
	private int currentTrack;  //���� ������� Ʈ��
	
	//�߻� �޼��� �������̵�
	public void play(int pos) {
		System.out.println(pos +"��ġ���� CD �÷��̾� ����� �����մϴ�.");
	}
	
	public void stop() {
		System.out.println("���� ��ġ���� CD �÷��̾��� ����� ����ϴ�.");
	}
	
	public void nextTrack() {
		currentTrack++;
		
		System.out.println("nextTrack �� ���� Ʈ�� : " +  currentTrack);		
	}
	
	public void prevTrack() {
		if(currentTrack > 1) {
			currentTrack--;
		}else {
			System.out.println("�� �̻� ������ �� �� �����ϴ�.");
		}
		
		System.out.println("prevTrack �� ���� Ʈ�� : " +  currentTrack);
	}
}

public class PlayerTest {

	public static void main(String[] args) {
		CDPlayer cd = new CDPlayer();
		cd.play(10);
		cd.paused();
		cd.paused();
		cd.stop();
		
		cd.nextTrack();
		cd.prevTrack();
	}

}
