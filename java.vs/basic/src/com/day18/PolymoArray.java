package com.day18;

public class PolymoArray {

	public static void main(String[] args) {
		Shape[] shArr = new Shape[4];
		
		//Shape�迭���� �ڽ� ��ü�� �ִ´�		
		//=> ������ �̿�
		shArr[0] = new Circle();
		shArr[1] = new Triangle();
		shArr[2] = new Triangle();
		shArr[3] = new Circle();
		
		for(int i=0;i<shArr.length;i++) {
			shArr[i].draw();  //�ڽ��� �������̵� �޼��� ȣ��
			shArr[i].delete();
		}//for
		
	}

}
