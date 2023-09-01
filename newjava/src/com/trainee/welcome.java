package com.trainee;

import java.util.Scanner;

public class welcome {

	public void hi() {

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 1; j++) {

				System.out.println(j);

			}
			System.out.println();
		}
	}

	public void chiran() {

		System.out.println("chiranjeevi");
		Scanner c = new Scanner(System.in);
		String j = c.nextLine();
		String sp[] = j.split("");
		System.out.println(sp);
	}

	public static void main(String[] args) {

		welcome g = new welcome();
		g.chiran();
        
	    welcome f= new welcome();
	    f.hi();
	    
        
	}

}
