package com.study.s3.ex1;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		MemberData md = new MemberData();

		MemberDTO mem1 = new MemberDTO();

		ArrayList<MemberDTO> mDTO = md.init();
		for(int i=0;i<mDTO.size();i++) {
		
		System.out.println("id:"+mDTO.get(i).getId());
		System.out.println("pw:"+mDTO.get(i).getPw());
		System.out.println("name:"+mDTO.get(i).getName());
		System.out.println("Email:"+mDTO.get(i).getEmail());
		System.out.println("age:"+mDTO.get(i).getAge());
		}
		
	}

}
