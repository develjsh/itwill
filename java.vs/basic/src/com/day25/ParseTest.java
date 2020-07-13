package com.day25;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParseTest {

	public static void main(String[] args) {
		//����ڰ� �Է��� ��¥�� ���� ��¥ ������ ���� ���ϱ�
		Date today = new Date();  //��������
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��¥�� �Է��ϼ���(��: 2020-04-10)");
		String str = sc.nextLine();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//public Date parse(String source) throws ParseException
		try {
			Date date = sdf.parse(str);  //����ڰ� �Է��� ��¥
			
			long gap=0;
			if(date.getTime() > today.getTime()) {  //�̷� ��¥
				String s=sdf.format(today);  //�������ڿ��� �ú��� ����
				Date today2 = sdf.parse(s);
				
				gap = (date.getTime() - today2.getTime())/1000;
			}else { //���� ��¥
				gap = (today.getTime() - date.getTime())/1000;				
			}
			
			gap=gap/(24*60*60);
			System.out.println("\n�� ��¥ ���� ����� �ϼ� : " + gap+"��");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
