package com.day12;

public class CmdArgsTest3 {

	public static int larger(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		//����� �μ��� �� ���� �Է¹޾� �� ū �� ���ϱ� (�� ū�� ���ϴ� �޼��� �����)
		if(args.length<2) {
			System.out.println("����� �μ��� �� �� �Է��ϼ���!");
			return;
		}
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		
		int result = larger(n1, n2);
		System.out.println("�� ū�� : " + result);
	}

}
