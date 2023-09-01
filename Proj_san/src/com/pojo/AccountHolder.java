package com.pojo;

public class AccountHolder {

	public static void main(String[] args) {

		Bank bb = new Bank();
		int balance = bb.getMainbalance();
		System.out.println(balance);
		String name = bb.getName();
		System.out.println(name);

	}

}