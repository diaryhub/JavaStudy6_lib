package com.syudy.s1.lang.string.ex1;

public class MemberData {
	
	private String data;
	
	//기본 생성자 선언
	
	public MemberData() {
		this.data="id1-pw1-name1-id1@gmail.com-";
		this.data=this.data+"id2-pw2-name2-id2@naver.com-";
		this.data=this.data+"id3-pw3-name3-id3@hanmail.net-";
		System.out.println(this.data);
	}
	
	public MemberDTO [] init() {
		
		String [] mData = this.data.split("-");
		
		MemberDTO [] mDTO = new MemberDTO[3];
		int index = 0;
		for(int i=0;i<3;i++) {
			mDTO[i]= new MemberDTO();
			mDTO[i].setId(mData[index]);
			mDTO[i].setPw(mData[++index]);
			mDTO[i].setName(mData[++index]);
			mDTO[i].setEmail(mData[++index]);	
			index++;
		}
		
		return mDTO;
	}
	
}
