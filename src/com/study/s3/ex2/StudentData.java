package com.study.s3.ex2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentData {
	private String info;
	
	public StudentData() {
		this.info = "name1,1,15,50,60,";
		this.info = this.info + "name2,2,52,68,40,";
		this.info = this.info + "name3,3,8,87,75,";
	}
	//학생들의 정보를 파싱 후 총점 계산,평균 계산 후 출력
	//학생의 정보를 추가
	//학생의 정보를 삭제
	public void studentInfo() {
		
		ArrayList<StudentDTO> ar = new ArrayList();
		int index = 0;
		StringTokenizer st = new StringTokenizer(info,",");
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3);
			ar.add(studentDTO);
		}
		
	}
	
	public void addStudent(ArrayList<StudentDTO> ar) {
		Scanner sc = new Scanner(System.in);
		
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름 입력:");
		studentDTO.setName(sc.next());
		System.out.println("번호 입력:");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어 점수 입력:");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어 점수 입력:");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학 점수 입력:");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3);
		
		ar.add(studentDTO);
		
	}
	
	public StudentDTO removeStudent(ArrayList<StudentDTO> ar) {
		StudentDTO dto = new StudentDTO();
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 입력하세요:");
		int num = sc.nextInt();
		for(int i=0;i<ar.size();i++) {
			if(ar.get(i).getNum()==num) {
				dto = ar.remove(i);
				System.out.println("삭제 성공");
				return dto;
			}
		}
		System.out.println("삭제 실패");
		return dto;
	}
	
}
