package com.day23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>(5);
		
		map.put(3, "ȫ�浿");
		map.put(7, "��浿");
		map.put(12, "�̱浿");
		
		//public V get(Object key)
		String name = map.get(3); //key�� 3�� ������ �о����
		System.out.println("key�� 3�� ������ : " + name);
		System.out.println("7�� �л��̸� : " + map.get(7));
		System.out.println("12�� �л��̸� : " + map.get(12)+"\n");
		
		//public V remove(Object key)
		map.remove(7);  //key�� 7�� ������ ����(����)
		System.out.println("���� �� map����� ���� : "+map.size());
		
		//Iterator �̿�
		System.out.println("\n======key Iterator �̿�======");
		//public Set<K> keySet()
		
		//Set<Integer> set = map.keySet();
		//Iterator<Integer> iter = set.iterator();
		
		Iterator<Integer> iter = map.keySet().iterator();		
		while(iter.hasNext()) {
			int key = iter.next();
			String val = map.get(key);
			
			System.out.println("key="+ key+", value="+ val);
		}
		
	}

}
