package com.single;

import java.util.Scanner;

public class Condi_scanner {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
				System.out.println("hi");
				String hi = sc.nextLine();
				System.out.println("Whats is u r name=");
				String name = sc.nextLine();
				System.out.println("whai is your age");
				int age = sc.nextInt();
				System.out.println("what is u r marks in 10th");
				int marks = sc.nextInt();
				System.out.println("your"+name+age);
				System.out.println("what Grade");
				
				
				
		if (marks > 90 && marks <= 100) {
			System.out.println("A GRADE");
		}

		else if (marks > 80 && marks <= 90) {
			System.out.println("B GRADE");
		}

		else if (marks > 70 && marks <= 80) {
			System.out.println("C GRADE");
		}

		else if (marks > 60 && marks <= 70) {
			System.out.println("D GRADE");
		}

		else if (marks > 50 && marks <= 60) {
			System.out.println("E GRADE");
		}

		else if (marks >=35 && marks <= 50) {
			System.out.println("F GRADE");
		}
		
		else if (marks>100)
			System.out.println("INVALID");

		else {
			System.out.println("FAIL");
		}
	}
	
}
