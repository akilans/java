package com.example.java;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args){
		
		calculator();
		
	}
	
	public static void calculator() {
		
		System.out.print("Enter number 1 :");
		int number1 = getNumber("number 1");
		
		System.out.print("Enter number 2 :");
		int number2 = getNumber("number 1");
		
		System.out.println("Addition of "+number1+ "& "+number2+" is :"+ (number1 + number2));
		System.out.println("Subtraction of "+number1+ "& "+number2+" is :"+ (number1 - number2));
		System.out.println("Multiplication of "+number1+ "& "+number2+" is :"+ (number1 * number2));
		System.out.println("Division of "+number1+ "& "+number2+" is :"+ ((double) number1 / number2));
		
		
	}
	
	public static int getNumber(String number) {
		Scanner sc = new Scanner(System.in);
		while (!sc.hasNextInt()) {
			System.out.println("Enter a Valid number!!! :");
			System.out.print("Enter "+number +":");
			sc.next();
		}
		return sc.nextInt();
		
	}

}
