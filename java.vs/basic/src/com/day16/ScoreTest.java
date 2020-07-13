package com.day16;

import java.util.Scanner;

//�迭�� ��������� ���
class Score{
	//�������
	private int[] subject;  //���� �迭, �� �� ��
	
	//������
	Score(int[] subject){
		this.subject=subject;
	}
	
	//getter/setter
	public int[] getSubject() {
		return subject;
	}
	
	public void setSubject(int[] subject) {
		this.subject=subject;
	}
	
	//�޼���
	public int calcTotal() {
		int sum=0;
		
		for(int i=0;i<subject.length;i++) {
			sum+=subject[i];
		}//for
		
		return sum;
	}
	
	public double calcAverage() {
		int sum = calcTotal();
		double avg= (double)sum / subject.length;
		
		return avg;		
	}
	
}//class

public class ScoreTest {

	public static void main(String[] args) {
		int[] arr=new int[3];
		arr[0]=90;
		arr[1]=88;
		arr[2]=70;
		
		Score score = new Score(arr);
		
		int sum = score.calcTotal();
		double avg = score.calcAverage();
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + Math.round(avg*10)/10.0);
		
		//���� �����ϱ�
		int[] arr2 = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��, ��, �� ������ �Է��ϼ���");
		
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = sc.nextInt();
		}
		
		score.setSubject(arr2);
		
		sum = score.calcTotal();
		avg = score.calcAverage();
		
		System.out.println("\n=======����� ���� ����=======");
		int[] subject = score.getSubject();
		for(int n : subject) {
			System.out.print(n+"\t");
		}
		
		System.out.println("\n\n���� : " + sum);
		System.out.println("��� : " + avg);
		
	}

}



