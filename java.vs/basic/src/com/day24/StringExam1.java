package com.day24;

import java.util.Scanner;

class StringExam1{
	public static void main(String[] args){
		String str = "test.txt";		
		int idx = str.lastIndexOf(".");
		System.out.println("���ϸ�:"+ str.substring(0, idx));
		System.out.println("Ȯ����:"+ str.substring(idx+1));

		String content = "�ȳ��ϼ���\r\n ���� ȫ�浿�Դϴ�.";
		String s = content.replace("\r\n", "<br>");
		System.out.println(s);

              //01234567890123456789012345
		str = "c:\\shop\\upload\\test.txt";
		int i = str.lastIndexOf(".");
		int k = str.lastIndexOf("\\");

		System.out.println("����:"+ str.substring(0, k));
		System.out.println("���ϸ�:"+ str.substring(k+1, i));
		System.out.println("Ȯ����:"+ str.substring(i+1));

		//str = "http://www.mall.com/default.html";
		Scanner sc = new Scanner(System.in);
		System.out.println("URL�ּҸ� �Է��ϼ���");
		String url = sc.nextLine();
		String path = "http://www.mall.com";
		if(url.indexOf(path)== -1)
			System.out.println("url �ּҰ� �������� �ʽ��ϴ�");
		else
			System.out.println("�ش� url �ּ�:"+ url);
		
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���(�����¾��� �Է�)");
		String ssnNo = sc.nextLine();
		//0123456789012
		//9010191232222
		String gender = ssnNo.substring(6,7);
		String yy="", mm, dd, gender2="";
		yy = ssnNo.substring(0,2); //�� => 90
		
		if(gender.equals("1") ||gender.equals("2")){
			yy =  "19" + yy;
		}else if(gender.equals("3") ||gender.equals("4")){
			yy = "20" + yy;
		}else{
			System.out.println("�߸��Է�!!");
			return;
		}
		
		mm =ssnNo.substring(2,4);  //10
		dd = ssnNo.substring(4,6); //19
		
		if(gender.equals("1") ||gender.equals("3")){
			gender2 = "��";
		}else if(gender.equals("2") ||gender.equals("4")){
			gender2 = "��";
		}else{
			System.out.println("�߸��Է�!!");
			return;
		}

		System.out.println(yy +"�� " + mm +  "�� " +dd +"�� "+ ","+ gender2);
	}
}

