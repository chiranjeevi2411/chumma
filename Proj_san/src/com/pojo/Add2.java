package com.pojo;

public class Add2 {

	public static void main(String[] args) {

		Add1 hello = new Add1();
		int hi = hello.getA();
		System.out.println("1st getter is --->" + hi);

		hello.setA(500);
		int a1 = hello.getA();
		System.out.println(a1);

	}

}
