package com.day26;

enum Color{
	RED, GREEN, BLUE
}

public class EnumTest {

	public static void main(String[] args) {
		Color col = Color.RED;
		System.out.println("col="+ col);
		
		System.out.println(col +"��  value=" + col.ordinal()+"\n");
		
		//Color[] colArr = col.values();
		for(Color c : col.values()) {
			System.out.println(c +"�� value=" + c.ordinal());	
		}
		
		/* ���ŵ� ������ ���� 0���� �������� ������ ���������� ��ȯ�Ͽ� ����� �� �ִ�.

		 �������� �ٷ�� ���� �⺻���� �޼ҵ�
		[1]values() : ���ŵ� ��� ���Ҹ� ������� ��ȯ�ϴ� �޼ҵ�
		[2]ordinal() : ������ ���ŵ� ������ ���� ������ ��ȯ�ϴ� �޼ҵ�
		[3]valueOf() : �Ű������� �־��� ��Ʈ���� ���������� ��ġ�ϴ� �̸��� ���� ���Ҹ� 
						��ȯ�ϴ� �޼ҵ�. 
		(���� �־��� ��Ʈ���� ��ġ�ϴ� ���Ұ� ���� ��� IllegalArgumentException ���� �߻�)
		 */
		
		Color c2 = col.valueOf("RED");
		System.out.println("\n\n"+ c2);
		
		Color c3 = col.valueOf("Red"); //����:IllegalArgumentException
		System.out.println(c3);
	}

}
