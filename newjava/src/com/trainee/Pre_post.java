package com.trainee;

public class Pre_post {

	public static void main(String[] args) {
		int i=-2;
		int j=-3;
		
		i++;
		i--;
		j--;
		--i;
		--j;
		++j;
		++i;
		--j;
		
		System.out.println(++i  +  j++  + i);
		System.out.println(j++  + i++  + j );
		System.out.println(j--  +  --i  +  i++);
		
		System.out.println(i);
		System.out.println(j++);
		System.out.println(--i);
		System.out.println(j);
			
		
	}
	
	
	
		
}
