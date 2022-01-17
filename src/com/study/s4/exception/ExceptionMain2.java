package com.study.s4.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		int num1=0;
		int num2=10;
		int result=0;
		
		try {
			result = num2/num1;
		}catch(Exception exception) {
			exception.printStackTrace();
			
			System.out.println("0이 들어옴");
			
		}
		
		System.out.println(result);
		
	}

}
