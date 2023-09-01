package com.trainee;

public class StudentDetails {

	public StudentDetails() {
		System.out.println("student details");
		System.out.println("===========");
	}
	public StudentDetails(String name) {
		this();
		
		System.out.println("student name ="+ name);
	}
	public StudentDetails(int id) {
		this("chiran");
		System.out.println("student id=" + id);
	}
	public StudentDetails(int total,int per) {
		this(98417);
		System.out.println("student total="+ total);
		System.out.println("student percentagr="+per);
		}
	public StudentDetails(String grade,int rank) {
		this(490,98);
	 System.out.println("grade="+grade);	
	 System.out.println("rank="+rank);
	}
public static void main(String[] args) {
	StudentDetails f=new StudentDetails("low",1);
	
}	
}
