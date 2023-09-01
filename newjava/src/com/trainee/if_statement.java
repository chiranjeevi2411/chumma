package com.trainee;

import java.util.Scanner;

public class if_statement {
	
	public static void main(String[] args) {
	
		Scanner v=new Scanner(System.in);
		System.out.println("enter the mark");
		int marks1=v.nextInt();
		System.out.println("your mark is"+marks1);
		
		
		
		
		
		
		if(marks1>=91 && marks1<=100) {
			System.out.println("A grade");
		}
			
		else if(marks1>=81 && marks1<=90) {
			System.out.println("B grade");
		}
		else if(marks1>=71 && marks1<=80) {
			System.out.println("C grade");
		}
		else if (marks1>=61 && marks1<=70) {
			System.out.println(" D Grage");
			
		}
		else if(marks1>=51 && marks1<=60) {
			System.out.println("E grade");
		}
		else {
			System.out.println("fail");
		}
	}
	
	
}

