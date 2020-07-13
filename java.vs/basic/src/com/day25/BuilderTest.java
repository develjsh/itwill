package com.day25;

public class BuilderTest {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("AB");
		sb.append(123);
		sb.append(true);
		sb.append('A');
		sb.append(25).append(3.14);
		//public StringBuilder append(String str)
		// append() �޼���
		// - ���޵� ���� StringBuilder �� �ν��Ͻ��� �����ϰ� �ִ� ���ڿ� �������� 
		//���� ������ ���·� �߰���
		System.out.println(sb+"\n");
		
		sb.insert(2, false);
		System.out.println("insert�� : "+sb+"\n");
		/*
		  public StringBuilder insert(int offset, String b)
		  
		  insert(2, "��") �޼���
		  -	 ��ġ(index)�� 2�� ������ , �� ��° �Ű������� �������·� ����
		  */
		sb.insert(sb.length(), "test");
		System.out.println("���� sb=" + sb);
		
	}

}
