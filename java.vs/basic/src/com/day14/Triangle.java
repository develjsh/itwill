package com.day14;

public class Triangle {
	//1. �������
	private int width, height;
	
	//2. ������
	public Triangle(int width, int height) {
		this.width=width;
		this.height=height;
		
		/* this
		  - �ڱ� �ڽ��� ����Ű�� this
		  - �ڽ��� ����� ����Ű�� this (this.���)  
		  - �ν��Ͻ� �ڽ��� ����Ű�� ��������
		  - �ν��Ͻ��� �ּҰ� ����Ǿ� ����	
		*/
	}
	
	//3. getter/setter
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width=width;
	}
	
	public int getHeight() {
		return height;				
	}
	
	public void setHeight(int height) {
		this.height=height;		
	}
	
	//4. �޼���
	public int findArea() {
		return width * height / 2;
	}
}
