package com.study.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		
		Calendar ca2 = Calendar.getInstance();
		
		ca2.set(1997, 7, 13);
		
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
		
		long now = ca.getTimeInMillis();
		long birth = ca2.getTimeInMillis();
		
		long age = now-birth;
		
		System.out.println(age/1000/60/60/24);
		System.out.println(age/1000/60/60/24/365);
	}

}
