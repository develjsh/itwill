package com.day14;

import java.util.Scanner;

class Score2{
	//1. �������
	//�Է°��� �ش��ϴ� �������
	private int kor;
	private int eng;
	private int math;

	//������� �ش��ϴ� �������
	private int sum;
	private float average;
	
	//������
	public Score2(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//getter/setter
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum=sum;
	}
	
	public float getAverage() {
		return average;
	}
	
	public void setAverage(int average) {
		this.average=average;
	}
	
	//����, ����� ���ϴ� �޼���
	public void findSum(){
		sum = kor+eng+math;
	}

	public void findAverage(){
		findSum();
		average=sum/3f;
	}
	
}//class

public class ScoreExam2 {
	public static void main(String[] args) {
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();

		Score2 obj = new Score2(kor, eng, math);

		obj.findSum();
		obj.findAverage();

		System.out.println("\n����=" + obj.getSum() 
			+ ", ���=" + obj.getAverage());
		
	}

}//class
