package com.day23;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		//Properties - HashMap�� �������� Hashtable�� ����� Ŭ����
		//(key, value) => (String, String) ���� �ܼ�ȭ�� ����
		//ȯ�漳��� �ַ� ���
		//���Ϸκ��� ���� �о ���� ����
		
		Properties props = new Properties();
		
		props.setProperty("size", "10");
		props.setProperty("timeout", "30");
		props.setProperty("capacity", "100");
		props.setProperty("language", "kr");
		
		Enumeration en = props.propertyNames();
		while(en.hasMoreElements()) {
			String key = (String) en.nextElement();
			String val = props.getProperty(key);
			System.out.println("key="+key+", value="+val);
		}
		
		//�� ����
		props.setProperty("size", "20");
		
		//public String getProperty(String key,String defaultValue)
		String value = props.getProperty("capacity", "10");
		System.out.println("\ncapacity => "+value);
		System.out.println("lang=> "+ props.getProperty("lang", "java"));
		System.out.println("size=> "+ props.getProperty("size"));
		
		System.out.println("\n����� ���� : "+props.size()); //4
	}

}
