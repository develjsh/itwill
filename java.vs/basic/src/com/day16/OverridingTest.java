package com.day16;

class Points{
	//2���� ���� ��ǥ
	protected int x, y;
	
	public String findLocation() {
		return "x="+x+", y="+y;
	}
	
}//class

class Points3D extends Points{
	//3���� ���� ��ǥ
	private int z;
	
	//�������̵� �޼��� - �θ�κ��� ��ӹ��� �޼����� ������ �����ϴ� ��
	//				   �޼��� ������
	public String findLocation() {
		return "x="+x+", y="+y+", z=" + z;
	}
}//class

public class OverridingTest {
	public static void main(String[] args) {
		Points p = new Points();
		String location=p.findLocation();
		System.out.println("2���� ���� ��ǥ : " + location+"\n");
		
		Points3D p2 = new Points3D();
		location=p2.findLocation();
		System.out.println("3���� ���� ��ǥ: " + location);
	}

}
