package com.dsa.java.assignments;

import java.util.Scanner;

public class Assignment6 {
/*
 * 6. Input currency in rupees and output in USD.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter currency in rupees: ");
		double amnt = sc.nextDouble();
		//let's assume 1 USD is equivalent price to 70 rupees 
		System.out.println("Currency is USD: "+amnt/70+"$");
	}

}
