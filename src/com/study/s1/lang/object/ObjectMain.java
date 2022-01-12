package com.study.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		ObjectStudy1 objectstudy = new ObjectStudy1();
		
		objectstudy.study1();
		
		Object obj = new Object();
		
		System.out.println(obj);
		int num=obj.hashCode();
		
		System.out.println(num);
		String str = obj.toString();
		
		System.out.println(str);
		
		Car car = new Car();
		
		System.out.println(car);
		System.out.println(car.toString());
		
		FireCar fc = new FireCar();
		
		fc.hashCode();
		
		obj = fc;
		
		
		
	}

	
	
	
	

}
