package com.study.s4.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력");
		try {
		int num =200;
		int age = sc.nextInt();
		int result =num/age;
		System.out.println("Age :" + age);
		System.out.println("result :" + result);
		}
		catch(InputMismatchException exception) {
			System.out.println("숫자만 입력하세요.");
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
	}

}
