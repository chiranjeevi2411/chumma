package com.trainee;

public class cricket_methodol {

	public void chiranjeevi() {
		
		System.out.println("Human being");
	}
	public void chiranjeevi(int a) {
		
		a=100000;
		System.out.println("salary ="+ a);
	}
	
	public void chiranjeevi(int a,int b) {
		
		System.out.println("mobile no="+ 9841376540L);
		System.out.println("door no="+ 47);
	}
	
	public void chiranjeevi(String hi) {
		int a= 20000;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		cricket_methodol g=new cricket_methodol();
		g.chiranjeevi();
		g.chiranjeevi(1,23);
		g.chiranjeevi(21);
		g.chiranjeevi("bg");
		g.chiranjeevi();
		
	}
}
