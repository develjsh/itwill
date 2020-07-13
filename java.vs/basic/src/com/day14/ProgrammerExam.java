package com.day14;

import java.util.Scanner;

class Programmer{	
	private String name;
	private String language;
	private int career;
	
	public Programmer(String p_name, String p_language, int p_career) {
		name = p_name;
		language = p_language;
		career = p_career;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName()	{
		return this.name;		
	}

	public void setLanguage(String language){
		this.language = language;
	}
	
	public String getLanguage(){
		return this.language;
	}
	
	public int getCareer(){
		return this.career;
	}

	public void setCareer(int career){
		this.career = career;			
	}
	
	public void work(){									
		System.out.println("���α׷����� �մϴ�\n");
	}		
}//class

public class ProgrammerExam {
	public static void main(String[] args){
		System.out.println("�̸�, ���߾��, ���߰���� �Է��ϼ���");	
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		String lang = sc.nextLine();
		int career = sc.nextInt();
		System.out.println("==================================");

		Programmer p = new Programmer(name, lang, career);
		p.work();
		
		p.setName("��浿");
		p.setLanguage("java");
		p.setCareer(5);
		
		System.out.println("�̸�:"+p.getName());
		System.out.println("���߾��:"+p.getLanguage());
		System.out.println("���߰��: "+ p.getCareer() +"��");
		
		p.work();
	}
}