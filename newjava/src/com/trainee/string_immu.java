package com.trainee;

public class string_immu {

	public static void main(String[] args) {
		System.out.println("Immutable");
		System.out.println("=====");
		
		String s1="Greens";
		String s2 = "Greens";
		String s3="Technology";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		s2=s2+s3;
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		
		System.out.println("-----");	
		System.out.println("Mutable");
		System.out.println("======");
		String s=new String("greens");
		
		StringBuffer sb1=new StringBuffer("Greens");
		StringBuffer sb2=new StringBuffer("Greens");
		StringBuffer sb3=new StringBuffer("Tech");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
		System.out.println(sb1==sb2);
		System.out.println(System.identityHashCode(sb1));
		
		sb1= sb2.append(sb3);
		System.out.println(sb1);
		System.out.println(System.identityHashCode(sb1));
		
		
		
		
		
		

	}

}
