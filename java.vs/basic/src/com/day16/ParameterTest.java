package com.day16;

class Data{
	int x;
}//class

public class ParameterTest {

	public static void main(String[] args) {
		//1.
		Data d = new Data();
		d.x=10;
		System.out.println("main() - d.x = " + d.x); //10
		
		change1(d.x);
		System.out.println("change1 �޼��� ȣ�� �� main() - d.x = " 
				+ d.x+"\n"); //10
				
		//2.
		Data d2=new Data(); 
		d2.x=20;
		System.out.println("main() - d2.x = " + d2.x); //20
		
		change2(d2);
		System.out.println("change2 �޼��� ȣ�� �� main() - d2.x = "
				+ d2.x); //2000
		
		int[] arr=new int[3];
		arr[0]=30;
		arr[1]=31;
		arr[2]=32;
		
		System.out.println("\nmain() - arr[0] = " + arr[0]);//30
		
		change3(new int[3]);
		System.out.println("change3 �޼��� ȣ�� �� main() - arr[0] = "
				+ arr[0]); //3000
	}

	public static void change1(int a) { 
		//�⺻�� �Ű�����, call by value
		/* �⺻�� �Ű����� - ������ ���� �б⸸ �� �� �ִ�. (read only)		 
		  			   - �޼��忡�� �Ű������� ���� �����ص�
		  			         ȣ���� �������� ������ ������ ���� �ʴ´�	
		 */
		 
		a=1000;
		
		System.out.println("change1() �޼��忡�� a="+a); //1000
	}
	
	public static void change2(Data data) {
		/* ������ �Ű����� - ������ ���� �а� ������ �� �ִ�.(read & write)
		   - call by reference
		   - �޼��忡�� �Ű������� ���� �����ϸ� ȣ���� �������� ������
		   	  ������ �޴´�
		*/ 
		data.x = 2000;
		
		System.out.println("change2() �޼��忡�� data.x = " + data.x);	//2000	
	}
	
	public static void change3(int[] arr) {
		//������ �Ű�����
		arr[0] = 3000;
		
		System.out.println("change3()�޼��忡�� arr[0]=" + arr[0]);
		//3000
	}
	
}



