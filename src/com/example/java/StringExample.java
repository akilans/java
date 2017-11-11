package com.example.java;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {

		System.out.print("Enter your name : ");
		Scanner sc_name = new Scanner(System.in);
		String name = sc_name.nextLine().trim(); // Get the string & trimming any white spaces
		System.out.println("Hello " + name);

		// Don't compare String Directly

		if (name == "Akilan") {
			System.out.println("Your name is Akilan");
			System.out.println("Length of your name is " + name.length());
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

	}

}
