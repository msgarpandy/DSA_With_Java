package com.dsa.java.assignments;

import java.util.Scanner;

public class Assignment5 {
	/*
	 * 5. Take 2 numbers as input and print the largest number.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Method 1 
		System.out.println("Enter 2 numbers: ");
		int num1 = sc.nextInt();
		int num2 =sc.nextInt();
		if(num1>num2) {
			System.out.println(num1+" is largest");
		}else {
			System.out.println(num2+" is largest");
		}
		
		//method 2 --> Using Math.max function
	}

}
