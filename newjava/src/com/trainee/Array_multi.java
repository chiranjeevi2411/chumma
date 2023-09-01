package com.trainee;

public class Array_multi {

	public static void main(String[] args) {
		
		int a[][]= new int [4][4];
		
a[0][0]=10;
a[0][1]=20;
a[1][0]=30;
a[1][1]=40;
a[1][2]=50;

for (int i=0; i<a.length; i++) {
	for (int j=0; j<a.length; j++) {
		
		System.out.print(a[i][j] + "  ");
	}
	System.out.println();
}


	}

}
