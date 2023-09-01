package com.trainee;

public class Reverse {
public static void main(String[] args) {
	
	
	String s="welcome to the java";
	
	
	for(int i=s.length()-1; i>=0; i--) {
		for(int j = s.length()-1; j<0; j--)
		System.out.print(s.charAt(j)+i);
		
	}
	
}
}

