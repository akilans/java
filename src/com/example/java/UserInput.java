package com.example.java;

import java.text.NumberFormat;
import java.util.Scanner;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

import javax.sound.midi.Soundbank;

public class UserInput {

	public static void main(String[] args) {

		System.out.print("Enter your age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt(); // Get the integer
		System.out.println("After 5 years your age will be " + (5 + age));

		System.out.print("Enter your name : ");
		Scanner sc_name = new Scanner(System.in);
		String name = sc_name.nextLine(); // Get the string
		System.out.println("Hello " + name);

		if (name instanceof java.lang.String) {
			System.out.println("Yes it is string");
			System.out.println("Length of your name is " + name.length());
			
			for(int i = 0; i < name.length(); i++){
				System.out.println(name.charAt(i));
			}
		}

		// Don't compare String Directly

		if (name == "Akilan") {
			System.out.println("Your name is Akilan");
		} else {
			System.out.println("Your name is not Akilan");
		}

		// This is the correct way to compare two strings

		if (name.equals("Akilan")) {
			System.out.println("Your name is Akilan");
			System.out.println("Index of 'l' is " + name.indexOf("l"));
			
		} else {
			System.out.println("Your name is not Akilan");
		}
		
		double salary = 50_000.00;
		NumberFormat sal = NumberFormat.getNumberInstance();
		System.out.println(sal.format(salary));
		
		NumberFormat salary_word = NumberFormat.getCurrencyInstance();
		System.out.println(salary_word.format(salary));

	}

}
