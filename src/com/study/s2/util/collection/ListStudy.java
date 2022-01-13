package com.study.s2.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStudy {
	
	
	public List<String> study5() {
		LinkedList<String> list = new LinkedList<>();
		list.add("a");
		return list;
	}
	
	public void study4() {
		LinkedList<Integer> list = new LinkedList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list.get(0));
		
	}
	
	
	public void study3() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
//		ar.add('b');
//		ar.add(3.12);
//		ar.add("iu");
		for(int i=0;i<ar.size();i++) {
		System.out.println(ar.get(i));
		
		int num = ar.get(0);	
		
		}
	}
	public void study2() {
		ArrayList ar = new ArrayList();
		
		int num = 1;
		
		Integer n = num;//AutoBoxing
		
		ar.add(n);
		ar.add(1);		//AutoBoxing
		
		ar.add('a');
	}
	
	public void study1() {
		
		int [] nums = new int [1];
		
		
		
		ArrayList ar = new ArrayList();
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(1,100);
		ar.set(0, 2000);
		ar.remove(3);
		ar.clear();
		for(int i = 0 ; i<ar.size();i++) {
		System.out.println(ar.get(i));
		}
	}
	
}
