package com.day25;

class Test2{
	private int value;
	
	Test2(int value){
		this.value=value;
	}
	
	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof Test2) {
			return this.value == ((Test2)obj).value;
		}else {
			return false;
		}
	}
}//

public class EqualsExam {

	public static void main(String[] args) {
		Test2 t = new Test2(100);
		Test2 t2 = new Test2(100);
		
		if(t.equals(t2)) { 
			System.out.println("t�� t2�� ����");
		}else {
			System.out.println("t�� t2�� �ٸ���");
		}
		
		if(t == t2) {
			System.out.println("t�� t2�� �ּҴ� ����");
		}else {
			System.out.println("t�� t2�� �ּҴ� �ٸ���");
		}
		
	}

}
