package com.day14;

import java.util.Scanner;

class Temporary{	
	private String name;
	private int time; //���ѽð�
	private int pay;  //�ð��� �޿�

	public Temporary(String name, int time, int pay){
		this.name = name;
		this.time = time;
		this.pay = pay;
	}
	
	public String getName(){
		return this.name; 
	}
	
	public void setName(String name){
		this.name = name;
	}

	public void setTime(int time){
		this.time = time;	
	}
	
	public int getTime(){
		return this.time;
	}
	
	public void setPay(int pay)	{
		this.pay = pay;	
	}
	
	public int getPay()	{
		return this.pay;
	}
	
	public int calcPay(){
		return time*pay;
	}
}//

class TemporaryExam{
	public static void main(String[] args){
			System.out.println("�̸�, ���ѽð�, �ð��� �޿��� �Է��ϼ���");
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay =sc.nextInt();

			System.out.println("----------------------------------------");
			Temporary t = new Temporary(name, time, pay);
			
			int wage =t.calcPay();
			
			System.out.println("�������: �ӽ���");
			System.out.println("�̸�:"+t.getName());
			System.out.println("�޿�:"+wage);	
			
			sc.close();
	}
}//
