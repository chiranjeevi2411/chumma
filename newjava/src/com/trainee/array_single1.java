package com.trainee;

public class array_single1 {

	public static void main(String[] args) {

		String j[] = new String[5];
		j[0] = "WELCOME";
	    j[1] = "HI";
		j[2] = "CHIRAN";
		j[3] = "POORI";
		j[4] = "PRIYA";
		
		
		int i=1;
		while(i<j.length) {
			System.out.println(j[i]);
			i++;
			
		}
		
		String hi[]= {"jkl","lmb","gggg"};
		for(String h : hi) {
			System.out.println(h);
		}

		

	}
}