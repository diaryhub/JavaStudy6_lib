package com.syudy.s1.lang.wrapper;

import java.util.Scanner;

public class WrapperEX1 {
	public void ex1() {
		// 주민번호 입력
		// 970813-1693211
		int age = 0;// 나이 대충 계산
		String sex = "";// 남녀 판별
		String season = "";
		// 3~5월 계절 봄
		// 6~8월 계절 여름
		// 9~11월 계절 가을
		// 12~2월 계절 겨울
		Scanner sc = new Scanner(System.in);
		String[] number = sc.next().split("-");
		if (Integer.parseInt(number[1].substring(0, 1)) < 3) {
			age = 122 - Integer.parseInt(number[0].substring(0, 2));
		} else {
			age = 22 - Integer.parseInt(number[0].substring(0, 2));
		}
		System.out.println(age);
		if (Integer.parseInt(number[1].substring(0)) % 2 == 1) {
			sex = "남";
		} else {
			sex = "여";
		}
		if (Integer.parseInt(number[0].substring(2, 4)) == 3 || Integer.parseInt(number[0].substring(2, 4)) == 4
				|| Integer.parseInt(number[0].substring(2, 4)) == 5) {
			season = "봄";
		} else if (Integer.parseInt(number[0].substring(2, 4)) == 6 || Integer.parseInt(number[0].substring(2, 4)) == 7
				|| Integer.parseInt(number[0].substring(2, 4)) == 8) {
			season = "여름";
		} else if (Integer.parseInt(number[0].substring(2, 4)) == 9 || Integer.parseInt(number[0].substring(2, 4)) == 10
				|| Integer.parseInt(number[0].substring(2, 4)) == 11) {
			season = "가을";
		} else if (Integer.parseInt(number[0].substring(2, 4)) == 12 || Integer.parseInt(number[0].substring(2, 4)) == 1
				|| Integer.parseInt(number[0].substring(2, 4)) == 2) {
			season = "겨울";
		}

		System.out.println("나이:" + age);
		System.out.println("성별:" + sex);
		System.out.println("계절:" + season);

	}

	public void ex2() {
		// 주민번호 입력
		// 970813-1693211
		// 정상 주민번호 잘못된 주민번호 판별
		// 9 7 0 8 1 3 - 1 6 9 3 2 1 1 -마지막은 채크용 번호
		// 2 3 4 5 6 7 - 8 9 2 3 4 4
		// 18 21 0 40 6 21 - 8 54 18 9 8 4
		// sum all
		// 207
		// 결과 값을 11로 나누어서 나머지를 구한다
		// 207%11 = 9
		// 나머지 값을 11에서 빼고 그 값이 체크용 번호와 같은지 비교
		// 틀리면 잘못된 번호, 맞으면 정상적인 번호
		// 만약 결과 값이 2자리라면 결과값을 다시 10으로 나누어서
		// 나온 나머지 값을 체크용 값과 비교
		// 같으면 정상 주민번호
		// 아니면 잘못된 번호
		Scanner sc = new Scanner(System.in);
		String[] number = sc.next().split("-");
		String[] nums0 = number[0].split("");
		String[] nums1 = number[1].split("");
		int[] ints = new int[nums0.length + nums1.length];
		for (int i = 0; i < nums0.length + nums1.length; i++) {
			if (i < 6)
				ints[i] = Integer.parseInt(nums0[i]);
			else
				ints[i] = Integer.parseInt(nums1[i - 6]);
		}
		ints[0] = ints[0] * 2;
		ints[1] = ints[1] * 3;
		ints[2] = ints[2] * 4;
		ints[3] = ints[3] * 5;
		ints[4] = ints[4] * 6;
		ints[5] = ints[5] * 7;
		ints[6] = ints[6] * 8;
		ints[7] = ints[7] * 9;
		ints[8] = ints[8] * 2;
		ints[9] = ints[9] * 3;
		ints[10] = ints[10] * 4;
		ints[11] = ints[11] * 4;
		int sum = 0;
		for (int i = 0; i < 12; i++) {
			sum = sum + ints[i];
		}
		if (11 - sum % 11 < 9) {
			if (11 - sum % 11 == ints[12]) {
				System.out.println("정상적인 번호입니다.");
			} else {
				System.out.println("잘못된 번호입니다.");
			}
		} else {
			int retry = (11 - sum % 11) % 10;
			if(retry == ints[12]) {
				System.out.println("정상적인 번호입니다.");
			}
			else
			{
				System.out.println("잘못된 번호입니다.");
			}
		}

	}

}
