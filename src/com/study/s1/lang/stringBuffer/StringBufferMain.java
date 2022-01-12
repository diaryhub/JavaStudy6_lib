package com.study.s1.lang.stringBuffer;

public class StringBufferMain {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("diary");
		sb.append("일기");
		System.out.println(sb);
		String name = "diary";
		String name2 = "일기";
		name = name + name2;
		
		boolean check = name.equals(sb.toString());
		
		System.out.println(check);
	}

}
