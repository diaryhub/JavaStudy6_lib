package com.study.s1.lang.string;

import java.util.Scanner;







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
	
	public void subStringTest() {
		String title = "West Side Story";
		String result = title.substring(title.indexOf("S"),9);
		System.out.println(result);
	}
	
	public void subStringEX1() {
		//키보드로부터 업로드 할 파일명 입력
		//a.txt, b.pdf, c.jpg
		//jpg, gif, png ->이미지 파일입니다 출력
		//txt, pdf, hwp ->문서 파일입니다 출력
		//mp3, wav, ogg ->음원 파일입니다 출력
		//나머지는 알 수 없는 파일입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명 입력:");
		String file = sc.next();
		String result = file.substring(file.lastIndexOf("."+1));
		
		if(result.equals("png")||result.equals("jpg")||result.equals("gif")) {
			System.out.println("이미지 파일입니다.");
		}
		else if(result.equals("txt")||result.equals("hwp")||result.equals("pdf")) {
			System.out.println("문서 파일입니다.");
		}
		else if(result.equals("mp3")||result.equals("ogg")||result.equals("wav")) {
			System.out.println("음원 파일입니다.");
		}
		else
			System.out.println("알 수 없는 파일입니다.");
	}

	
	
	
	public void replaceTest() {
		String title = "West Side Story";
		
		String rep = title.replace("West", "North");
		
		System.out.println(title);
		System.out.println(rep);
		
	}

	public void caseTest() {
		String title = " West Side Story ";
		String result1 = title.toLowerCase();
		String result2 = title.toUpperCase();
		String result3 = title.trim();
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	
	
	public void valueOfTest() {
		int num = 1000;
		String result = String.valueOf(num);
		System.out.println(result);
	}
	
	public void splitTest() {
		String name = "a,b,c,d,e,f";
		
		String [] nameArray = name.split(",");

		for(int i=0;i<nameArray.length;i++) {
			System.out.println(nameArray[i]);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
}



