package com.day20;

interface Tv2{
	public void onTv();
}//

interface Computer2{
	void dataReceive();
}//

//�������̽��� ���� ����� ������
class IPTv2 implements Tv2, Computer2{
	public void dataReceive() {
		System.out.println("���� ������ ���� ��");
	}
	
	public void onTv() {
		System.out.println("Tv ���� ��� ��");
	}
	
	public void powerOn() {
		dataReceive();
		onTv();
	}
}//

public class IPTvTest2 {
	public static void main(String[] args) {
		IPTv2 obj = new IPTv2();
		obj.powerOn();
		
	}

}
