package com.day20;

class Tv{
	public void onTv() {
		System.out.println("TV���� ��� ��");
	}
}//

interface Computer{
	void dataReceive();
}//

//��Ӱ� ������ ���ÿ� �� �� �ִ�
class IPTv extends Tv implements Computer{
	public void dataReceive() {
		System.out.println("���� ������ ���� ��");
	}
	
	public void powerOn() {
		dataReceive();
		onTv();
	}
}//

public class IPTvTest {
	public static void main(String[] args) {
		IPTv obj = new IPTv();
		obj.powerOn();
		
	}

}
