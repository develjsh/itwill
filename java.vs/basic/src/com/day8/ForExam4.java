package com.day8;

import java.util.Scanner;

public class ForExam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		String value =  sc.nextLine();
		//String value = "12a34";
		
		char ch = ' ';
		boolean isNumber = true;
		// �ݺ����� charAt(int i)�� �̿��ؼ� ���ڿ��� ���ڸ� �ϳ��� �о �˻��Ѵ�.
			
		for(int i=0; i < value.length() ;i++) {  //5�� �ݺ�, 0,1,2,3,4
			ch = value.charAt(i); //'1', '2', 'a'
			if(!(ch>='0' && ch<='9')) {
				isNumber = false;
				break;
			}
		}//for
		
		if (isNumber) {
			System.out.println(value+"�� �����Դϴ�.");
		} else {
			System.out.println(value+"�� ���ڰ� �ƴմϴ�.");
		}//if

	}

}
