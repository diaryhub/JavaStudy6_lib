package com.study.s2.util.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SetStudy {
	
	public void study3() {
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			int num = it.next();
			System.out.println(num);
		}
		
	}

	public void study2() {
		Random random = new Random();
		// Lotto 번호를 랜덤하게 추출 1~45 6개
		HashSet<Integer> Lotto = new HashSet();
		while( Lotto.size() < 6) {
			int num = random.nextInt(45) + 1;
			Lotto.add(num);
		}
		System.out.println(Lotto);
	}

	public void study1() {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(100);
		hs.add(200);
		hs.add(100);
		hs.remove(200);
		System.out.println(hs);
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(100);
		ar.add(200);
		ar.add(100);
		System.out.println(ar);
		System.out.println(hs.size());

	}

}
