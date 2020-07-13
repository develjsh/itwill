package com.day19;

import java.util.Scanner;

class Employee{	
	protected String name;

	public Employee(String name){
		this.name = name;
	}
	
	public void setName(String name){
			this.name = name;
	}
	
	public String getName(){
			return this.name;
	}
	
	public int findPay(){
		return 0;
	}
}//

class Permanent extends Employee{	
	protected int salary; //�⺻�޿�

	public Permanent(String name, int salary){
		super(name);
		this.salary = salary;
	}	
	
	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int findPay(){
		return salary;
	}	
}//

class Temporary extends Employee{	
	private int time; //���ѽð�
	private int pay;  //�ð��� �޿�

	public Temporary(String name, int time, int pay){
		super(name);
		this.time = time;
		this.pay = pay;
	}	
	
	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int findPay(){
		return time*pay;
	}	
}//

class SalesPerson extends Permanent{	
	private final Double RATE = 0.15;

	private int earnings; //�Ǹż���

	public SalesPerson(String name, int salary, int earnings){
		super(name, salary);
		this.earnings = earnings;
	}
		
	public int getEarnings() {
		return earnings;
	}

	public void setEarnings(int earnings) {
		this.earnings = earnings;
	}

	public int findPay(){
		return (int)(salary+(earnings*RATE));
	}
}//

class Exam2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("������� - �����(P), �ӽ���(T), �Ǹ���(S)�� �Է��ϼ���");
		String emptype = sc.nextLine();
		
		String etype="";
		Employee e=null;
		if (emptype.equalsIgnoreCase("P")){
			System.out.println("�̸�, �⺻�޿��� �Է��ϼ���");
			String name = sc.nextLine();
			int salary = sc.nextInt();

			e = new Permanent(name, salary);
			etype = "�����";
		}else if (emptype.equalsIgnoreCase("T"))	{
			System.out.println("�̸�, ���ѽð�, �ð���޿��� �Է��ϼ���");
			String name = sc.nextLine();
			int time = sc.nextInt();
			int pay = sc.nextInt();

			e = new Temporary(name, time, pay);
			etype = "�ӽ���";
		}else if (emptype.equalsIgnoreCase("S")){
			System.out.println("�̸�, �⺻�޿�, �Ǹż����� �Է��ϼ���");
			String name = sc.nextLine();
			int salary = sc.nextInt();
			int earnings = sc.nextInt();

			e = new SalesPerson(name, salary, earnings);
			etype = "�Ǹ���";
		}

		System.out.println("�������:"+etype);
		System.out.println("�̸�:"+e.getName());
		System.out.println("�޿�:"+e.findPay());
	}
	
}
