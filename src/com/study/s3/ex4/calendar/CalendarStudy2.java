package com.study.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy2 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.YEAR,2023);
		ca2.set(Calendar.MONTH,1);
		ca2.set(Calendar.DATE,25);
		System.out.println(ca2.getTime());
		
	}

}
