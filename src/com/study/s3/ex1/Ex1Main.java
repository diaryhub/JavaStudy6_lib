package com.study.s3.ex1;

import java.util.ArrayList;
import java.util.Map;

import com.study.s3.ex1.member.MemberDTO;
import com.study.s3.ex1.member.MemberData;
import com.study.s3.ex1.student.StudentDTO;
import com.study.s3.ex1.student.StudentData;

public class Ex1Main {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();
		
		ArrayList<MemberDTO> ar = memberData.init();
		studentData.addStudent(ar);
	}

}
