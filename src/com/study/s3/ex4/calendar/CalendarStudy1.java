package com.study.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		//Calendar 는 추상 클래스
		//GregorianCalendar 가 Calendar 클래스 상속 
		//Calendar 의 메서드는 GregorianCalender 에 있다
		
		GregorianCalendar gc = new GregorianCalendar();
		
		Calendar calendar = new GregorianCalendar();
		
		Calendar ca = Calendar.getInstance();
		
		int y =ca.get(ca.YEAR);
		
		int m = ca.get(ca.MONTH);
		int d = ca.get(ca.DATE);
		int h = ca.get(ca.HOUR);
		int hh = ca.get(ca.HOUR_OF_DAY);
		int min = ca.get(ca.MINUTE);
		int sec = ca.get(ca.SECOND);
		int msec = ca.get(ca.MILLISECOND);
		int millis = (int) ca.getTimeInMillis();
		Date a = ca.getTime();
		System.out.println(y);
		System.out.println(m);
		System.out.println(d);
		System.out.println(h);
		System.out.println(hh);
		System.out.println(min);
		System.out.println(sec);
		System.out.println(msec);
		System.out.println(millis);
		System.out.println(a);
	}

}
