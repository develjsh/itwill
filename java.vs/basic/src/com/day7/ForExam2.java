package com.day7;

import java.util.Scanner;

public class ForExam2 {
	public static void main(String[] args){
		System.out.println("����� �������� ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();

		for(int i=9;i>=1;i--) {
			System.out.println(dan + " * " + i + " = " +  dan*i);
		}//for

		sc.close();
	}
}

