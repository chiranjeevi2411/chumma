package com.trainee;

public class Void_sample {

	public static int add() {
		int tamil = 100;
		int english = 200;
		int maths =300;
		int total=tamil+english+maths;	
		System.out.println(" my total="+ total );
		return english;
	}
	
	public void chumma() {
		
		
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println(c);
		int i=add();
		System.out.println(i);
		
	}
	public static void main(String[] args) {
		Void_sample g=new Void_sample();
		g.chumma();
	}
	
	
	
	
}
