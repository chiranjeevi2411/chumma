package com.trainee;

public class void_sample1 {

	public static int tree() {
		
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
		
		return c;
		}
	
	public static void  mango() {
		int a=25;
		int b= 5;
		int c=a-b;
		System.out.println(a);
		int r=tree();
		System.out.println("mango ="+r);
		
	}
	public static void main(String[] args) {
		void_sample1 g=new void_sample1();
		g.mango();
	}
}
