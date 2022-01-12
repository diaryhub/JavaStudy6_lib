package com.study.s1.lang.string.ex1;

public class MemberMain {

	public static void main(String[] args) {
		MemberData md = new MemberData();

		MemberDTO mem1 = new MemberDTO();

		MemberDTO[] mDTO = md.init();

		for (int i = 0; i < mDTO.length; i++) {
			System.out.println("id" + (i + 1) + " :" + mDTO[i].getId());
			System.out.println("pw" + (i + 1) + " :" + mDTO[i].getPw());
			System.out.println("name" + (i + 1) + " :" + mDTO[i].getName());
			System.out.println("email" + (i + 1) + " :" + mDTO[i].getEmail());
			System.out.println("age" + (i + 1) + " :" + mDTO[i].getAge());
			System.out.println("=================================");
		}
	}

}
