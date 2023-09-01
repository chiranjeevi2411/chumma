package com.february;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

	public static void main(String[] args) {
		
		Set<Object> a=new LinkedHashSet<>();
		a.add(55);
		a.add(25);
		a.add("welcome");
		a.add(65);
		
		Set<Object> b= new LinkedHashSet<>();
		
		b.add(88);
		b.add("family");
		b.add(45);
		b.add(25);
		b.add("");
		
		System.out.println(a);
		System.out.println(a.size());
		a.addAll(b);
		System.out.println(a);
		int w=a.size();
		System.out.println(w);
		System.out.println(a.contains("family"));
		
		
		
		
	}
}
