package com.study.s2.util.collection;

import java.util.HashMap;

public class MapStudy {
	public void study1() {
		//HashMap
		HashMap<String, Integer> map = new HashMap<>();
		//put
		map.put("F1", 1);
		map.put("F2", 2);
		map.put("F3", 1);
		
		System.out.println(map);
		
		Integer num = map.get("F2");
		
		System.out.println(num);
		
		map.remove("F3");
		
		System.out.println(map);
		
		map.put("F1", 100);
		
		System.out.println(map);
		
		Integer n = map.get("test");
		
		System.out.println(n);
		
		String name ="K5";
		map.put(name ,null);
		
		map.clear();
		
		System.out.println(map);
	}
}
