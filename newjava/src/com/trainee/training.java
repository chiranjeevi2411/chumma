package com.trainee;

import java.util.Scanner;

public class training {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Hi,welcome");
		String start = t.nextLine();
		System.out.println("what is your name?");
		String name = t.nextLine();

		System.out.println("your father name");
		String fathername = t.nextLine();
		System.out.println("age");
		int age = t.nextInt();
		t.nextLine();
		System.out.println("phone no");
		int mobile = t.nextInt();
		t.nextLine();

		System.out.println("ID");
		int id = t.nextInt();
		t.nextLine();

	}
}
