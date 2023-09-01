package com.trainee;

public class Exeption {

	public static void main(String[] args) {
		
		
		System.out.println("welcome");
		
		int a=30;
		int b=0	;
		int result = 0;
		
		
		try {
			result = a/b;
		}
		
		catch(ArithmeticException chiran  ) {
			System.out.println(chiran);		
			throw chiran;
			}
		
		finally {
			System.out.println("java");
		}
		System.out.println("resulu -" + result);
	}
	
}
