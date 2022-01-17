package com.study.s6;

public class ThreadMain {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
