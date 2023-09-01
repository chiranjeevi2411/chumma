package com.trainee;

public class variable_type {

	int a = 200;
	public static int c= 500;

	public void hello() {
        String v="dress";
		int b = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(v);
	}
    public static void main(String[] args) {
		variable_type f= new variable_type();
		f.hello();
		System.out.println(f.a);
		
		
	}
}
