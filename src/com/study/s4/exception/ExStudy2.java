package com.study.s4.exception;

public class ExStudy2 {
	public void ex1() {
		//유치원생 -2자릿수 까지 읽기 가능
		int num1 = 70;
		int num2 = 50;
		int num3 = num1+num2;
		int num4 = num2 -num1;
		
		try {
		if(num3>99) {
			throw new ChildException("3자리 수를 출력할 수 없습니다.");
		}
		}catch(Exception exception) {
			exception.printStackTrace();
			System.out.println("Message :"+exception.getMessage());
		}
		
		
	}
}
