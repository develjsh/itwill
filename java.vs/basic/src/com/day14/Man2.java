package com.day14;

public class Man2 {
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int p_age) {
		if(p_age<0 || p_age >= 200) {  //�߸� ���� ���� ���� �� �ִ�.
			age = 0;
			System.out.println("\n��ȿ���� ���� �����Դϴ�!");
		}else {
			age=p_age;
		}
	}
	
}
