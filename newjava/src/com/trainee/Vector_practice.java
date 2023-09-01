package com.trainee;

import java.util.Vector;

public class Vector_practice {

	public static void main(String[] args) {
		
		
		Vector a=new Vector();

		a.add("chiranjevi");
		a.add("durai");
		a.add("karthik");
		a.add("poornima");
		a.add("kavya");
		a.add("malliswari");
		
		a.add(2,"priya");
		
		
		System.out.println(a);
		System.out.println("size "+a.size());
		System.out.println("capacity " +a.capacity());
			System.out.println(a.get(4));
			System.out.println(a.remove(5));
			System.out.println(a);
			a.remove(3);
			System.out.println(a);
			System.out.println(a.firstElement());
			System.out.println(a.lastElement());
		}
	}


