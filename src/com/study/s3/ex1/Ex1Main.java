package com.study.s3.ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.study.s3.ex1.member.MemberDTO;
import com.study.s3.ex1.member.MemberData;
import com.study.s3.ex1.student.StudentDTO;
import com.study.s3.ex1.student.StudentData;

public class Ex1Main {

	public static void main(String[] args) {
		MemberData memberData = new MemberData();
		StudentData studentData = new StudentData();

		ArrayList<MemberDTO> ar = memberData.init();
		Map<String, StudentDTO> map = studentData.addStudent(ar);

		Set<String> set = map.keySet();
		Iterator<String> key = set.iterator();

		while (key.hasNext()) {

			System.out.println(map.get(key).getId());
			System.out.println(map.get(key).getName());
			System.out.println(map.get(key).getKor());
			System.out.println(map.get(key).getEng());
			System.out.println(map.get(key).getMath());
			System.out.println(map.get(key).getTotal());
			System.out.println(map.get(key).getAvg());

		}

	}

}
