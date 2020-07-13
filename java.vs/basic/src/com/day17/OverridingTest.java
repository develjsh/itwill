package com.day17;

class Points{
	//2���� ���� ��ǥ
	protected int x, y;
	
	//������
	Points(int x, int y){
		
		this.x=x;
		this.y=y;
	}
	
	public String findLocation() {
		return "x="+x+", y="+y;
	}
	
}//class

class Points3D extends Points{
	//3���� ���� ��ǥ
	private int z;
		
	//������
	/*
	 ����� �޾��� ��� �θ�Ŭ������ �����ڰ� �Ű������� ������ �ִٸ� 
	 �ڽ���  �θ���  �����ڿ���  �Ű�������  �־���� ��
	 
	 �������� ù �ٿ��� this()�� super()�� �̿��ؼ� �ٸ� �����ڸ� ȣ������ ������
	 �����Ϸ��� �ڵ����� super()�� �־��ش�
 	 */
	Points3D(int x, int y, int z){
		super(x, y);
		this.z=z;
	}
	
	public String findLocation() {
		//return "x="+x+", y="+y+", z=" + z;
		
		//�θ� �޼��� ȣ�� => super.�θ� �޼���()
		String str = super.findLocation();
		return str +", z=" + z;
	}
}//class

public class OverridingTest {
	public static void main(String[] args) {
		Points p = new Points(10, 20);
		String location=p.findLocation();
		System.out.println("2���� ���� ��ǥ : " + location+"\n");
		
		Points3D p2 = new Points3D(100,200,300);
		location=p2.findLocation();
		System.out.println("3���� ���� ��ǥ: " + location);
	}

}
