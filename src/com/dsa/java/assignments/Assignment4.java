package com.dsa.java.assignments;

import java.util.Scanner;

public class Assignment4 {
/*
 * 4. Take in two numbers and an operator (+, -, *, /) and calculate the value.(Use if conditions)
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method 1 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers and an operator (+, -, *, /) to calculate the value: ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double res = 0;
		char op = sc.next().charAt(0);
		if(op=='+') {
			res = num1+num2;
		}else if(op == '-') {
			res = num1-num2;
		}else if(op=='*') {
			res = num1*num2;
		}else if(op=='/') {
			res = num1/num2;
		}else {
			System.out.println("Invalid operator");
		}
		System.out.println("Answer is: "+res);
		
		//Method 2 --> we can use switch case 
	}

}
