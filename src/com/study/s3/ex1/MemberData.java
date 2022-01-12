package com.study.s3.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberData {

	private String data;

	// 기본 생성자 선언

	public MemberData() {
		this.data = "id1-pw1-name1-id1@gmail.com-19-";
		this.data = this.data + "id2-pw2-name2-id2@naver.com-18-";
		this.data = this.data + "id3-pw3-name3-id3@hanmail.net-17-";
		System.out.println(this.data);
	}

	public MemberDTO removeMember(ArrayList<MemberDTO> ar) {
		// 삭제받을 ID 입력
		// ArrayList에서 삭제
		MemberDTO member = null;
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).getId().equals(id)) {
				member=ar.remove(i);
				break;
			}
		}
		return member;
	}

	public void adMember(ArrayList<MemberDTO> ar) {
		// 새로 추가한 MemberDTO 생성
		// 키보드로부터 id,pw,이름,email,나이를 입력 받아서
		// MemberDTO의 멤버변수 값으로 대입
		// 매개변수로 받은 ar에 MemberDTO추가
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.next(), ",");
		MemberDTO member = new MemberDTO();
		member.setId(st.nextToken().trim());
		member.setPw(st.nextToken().trim());
		member.setName(st.nextToken().trim());
		member.setEmail(st.nextToken().trim());
		member.setAge(Integer.parseInt(st.nextToken().trim()));
		ar.add(member);

	}

	public ArrayList<MemberDTO> init() {

		System.out.println("MemberEx1 branch");

		ArrayList<MemberDTO> ar = new ArrayList();

		StringTokenizer st = new StringTokenizer(data, "-");
		while (st.hasMoreTokens()) {
			MemberDTO mDTO = new MemberDTO();

			mDTO.setId(st.nextToken().trim());
			mDTO.setPw(st.nextToken().trim());
			mDTO.setName(st.nextToken().trim());
			mDTO.setEmail(st.nextToken().trim());
			mDTO.setAge(Integer.parseInt(st.nextToken().trim()));
			ar.add(mDTO);

		}

		return ar;
	}

}
