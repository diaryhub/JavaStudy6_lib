package com.syudy.s1.lang.string;

public class StringStudy1 {
	
	public void study1() {
		String name = "hello";
		String name2 = new String("hello");
		System.out.println(name);
		System.out.println(name2);
		//charAt(i) == 문자열의 i번째 문자를 찾아서 문자 호출 
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
	
	public void indexTest() {
		
		String msg = "Hello World!";
		//indexOf == 문자 또는 문자열이 몇번째 글자부터 시작인지 찾아서 정수 호출
		int num = msg.indexOf('W');
		System.out.println(num);
	}
	

	public void lengthTest() {
		String title = "West Side Story";
		int len = title.length();
		System.out.println(len);
		for(int i=0;i<len;i++) {
			System.out.println(title.charAt(i));
		}
		
		String find = "S";
		int count=0;
		for(int i=0;i<title.length();i++) {
			int index = title.indexOf(find,i);
			if(index>=0) {
				count ++;
				i=index;
			}
		}
		System.out.println(count);
	}

}
