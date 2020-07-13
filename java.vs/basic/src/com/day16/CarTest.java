package com.day16;

/*
 this.��� => �ڽ��� ����� ����Ű�� this
 this() => �����ڸ� ȣ���ϴ� this()
 		   �ڽ��� �����ڵ� �� �ٸ� ������ ȣ��
 		   �������� ù�ٿ����� ȣ�� ����	 
*/

class Car{
	private String color;
	private String gearType;  //auto, manual
	private int door; //�� ���� ����
	
	Car(String color, String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	
	Car(){
		this("White", "Auto", 4);  //�ٸ� ������ ȣ��
		
		/*this.color="White";
		this.gearType="Auto";
		this.door=4;*/
	}
	
	Car(String color){
		this(color, "Auto", 4);  //�Ű������� 3���� �ٸ� ������ ȣ��
	}
	
	public void showInfo() {
		System.out.println("���� : " + color);
		System.out.println("���ӱ� ���� : " + gearType);
		System.out.println("�� ���� ���� : " + door+"\n");
	}
}//class

public class CarTest {
	public static void main(String[] args) {
		Car c = new Car();
		c.showInfo();
		
		Car c2 = new Car("Black");
		c2.showInfo();
		
		Car c3 = new Car("Red", "Manual", 2);
		c3.showInfo();
				
	}

}
