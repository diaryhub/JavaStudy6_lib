package com.study.s3.ex4.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarStudy5 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();		
		
		//30*60*1000
		ca2.setTimeInMillis(ca2.getTimeInMillis()+30*60*1000);
		
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
		
		ca.roll(Calendar.DATE, 70);
		
		System.out.println(ca.getTime());
		
		ca.add(Calendar.DATE, 70);
		
		System.out.println(ca.getTime());
		
		String pattern = "yyyy년 MM월 dd일 - HH:mm:ss";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		System.out.println(sd.format(ca.getTime()));
		
		pattern = "yyyy-MM-dd (E)";
		sd.applyPattern(pattern);
		
		System.out.println(sd.format(ca.getTime()));
		
	}

}
