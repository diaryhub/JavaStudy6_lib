package com.study.s3.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MemberData {
	
	private String data;
	
	//기본 생성자 선언
	
	public MemberData() {
		this.data="id1-pw1-name1-id1@gmail.com-19-";
		this.data=this.data+"id2-pw2-name2-id2@naver.com-18-";
		this.data=this.data+"id3-pw3-name3-id3@hanmail.net-17-";
		System.out.println(this.data);
	}
	
	public ArrayList<MemberDTO> init() {
		
		
		System.out.println("MemberEx1 branch");
		
		
		return null;
	}
	
}
