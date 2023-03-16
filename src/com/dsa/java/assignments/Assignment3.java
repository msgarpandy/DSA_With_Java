package com.dsa.java.assignments;

import java.util.Scanner;

public class Assignment3 {
/*
 * 3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter principle , time & rate to calculate simple interest: ");
		double p = sc.nextDouble();
		double r = sc.nextDouble();
		double t = sc.nextDouble();
		
		double si = (p*r*t)/100;
		System.out.println("Simple interest is: "+si);
	}

}
