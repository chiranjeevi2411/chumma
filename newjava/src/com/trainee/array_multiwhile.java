package com.trainee;

public class array_multiwhile {

	public static void main(String[] args) {
		
		int a[][]= new int [4][4];
		
		a[0][0]=10;
		a[0][1]=20;
		a[1][0]=30;
		a[1][1]=40;
		a[1][2]=50;
		
		int i=0;
		while(i<a.length) {
			
			System.out.println(a[i]);
			i++;
		}

	}

}
