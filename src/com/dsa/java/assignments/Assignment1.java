package com.dsa.java.assignments;

import java.util.Scanner;

public class Assignment1 {

	/*
	 * 1. Write a program to print whether a number is even or odd, also take input from the user.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a number: ");
		int num = sc.nextInt();
		
		if(num%2==0) {System.out.println(num + " is even.");}
		else {System.out.println(num+ " is odd");}
	}

}
