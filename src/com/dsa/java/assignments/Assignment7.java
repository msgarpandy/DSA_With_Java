package com.dsa.java.assignments;

import java.util.Scanner;

public class Assignment7 {
/*
 * 7. To calculate Fibonacci Series up to n numbers.
 */
	public static void main(String[] args) {
		// Method 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		System.out.println("Fibonacci Series up to "+num+" numbers: ");
		System.out.print(a+" "+b+" ");
		while(num-2>0) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
			num--;
		}
		
		//Method 2 ==> using do while loop/using for loop/using functions

	}

}
