package com.study.s2.util.token;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class TokenStudy {

	public static void main(String[] args) {
		String str = "봄, 16 ,여름,32,가을,20,겨울,-15";
		str = str.replace(" ", "");
		
		StringTokenizer st = new StringTokenizer(str,",");
	while(st.hasMoreTokens()) {
		SeasonDTO seasonDTO = new SeasonDTO();
		String token = st.nextToken();
		seasonDTO.setName(token);
		
		ArrayList<SeasonDTO> ar = new ArrayList();
		
		token = st.nextToken();
		seasonDTO.setTempeture(Integer.parseInt(token));
		ar.add(seasonDTO);
		System.out.println(seasonDTO.getName());
		System.out.println(seasonDTO.getTempeture());
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(seasonDTO.getName());
			System.out.println(seasonDTO.getTempeture());
				
		}	
	}
	
	}

}
