package com.day19;

public class CastArray {

	public static void main(String[] args) {
		//Car
		Car[] carArr = new Car[3];
		carArr[0]=new FireEngine();
		carArr[1]=new Ambulance();
		Car c = new FireEngine();
		carArr[2]=c;
		
		/*
		Car c = new FireEngine();
		if(c instanceof FireEngine) {
			FireEngine f = (FireEngine)c;
			f.water();
		}
		*/
			
		//�������̵� �޼��� ȣ��
		for(int i=0;i<carArr.length;i++) {
			carArr[i].drive();
		}//for
		
		//�ڽĸ��� �޼��� ȣ��
		System.out.println("\n=====�ڽĸ��� �޼��� ȣ��=======");
		for(int i=0;i<carArr.length;i++) {
			if(carArr[i] instanceof FireEngine) {
				FireEngine f = (FireEngine)carArr[i];
				f.water();
			}else if(carArr[i] instanceof Ambulance) {
				Ambulance am = (Ambulance)carArr[i];
				am.siren();
			}
		}//for

		System.out.println("\n-----Ȯ�� for �̿�-------");
		for(Car c2 : carArr) {
			if(c2 instanceof FireEngine) {
				FireEngine f = (FireEngine)c2;
				f.water();
			}else if(c2 instanceof Ambulance) {
				Ambulance am = (Ambulance)c2;
				am.siren();
			}
		}//for
		
	}

}
