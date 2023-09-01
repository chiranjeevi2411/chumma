package com.single;

public class second_pgm {

	public static void main(String[] args) {
		int marks = 81;

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
