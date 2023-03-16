package com.dsa.java.assignments;

import java.util.Scanner;

public class Assignment2 {
	/*
	 * 2. Take name as input and print a greeting message for that particular name.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Hello "+ name +". Good Morning!!");
	}

}
