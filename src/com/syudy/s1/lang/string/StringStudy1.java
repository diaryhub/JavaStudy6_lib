package com.syudy.s1.lang.string;

public class StringStudy1 {
	
	public void study1() {
		String name = "hello";
		String name2 = new String("hello");
		System.out.println(name);
		System.out.println(name2);
		
		char ch = name.charAt(1);
		
		System.out.println(ch);
		
	}
	
	public void equalTest() {
		
		String str = "diary";
		String str2 = "diary";
		String str3 = new String ("diary");
		String str4 = new String ("diary");
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str==str4);
		System.out.println(str3==str4);
		System.out.println(str.equals(str2));
		System.out.println(str.equals(str3));
		System.out.println(str3.equals(str4));
		
		
	}

}
