package com.february;

public class family_man extends engg {
	
	public void chiranjeevi() {
		
		
		System.out.println("father");
		System.out.println("husband");
	}

	public static void main(String[] args) {
		
		family_man a= new family_man();
		a.chiranjeevi();
		engg h=new engg();
		a.chiranjeevi();
	}
}
