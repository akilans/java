package com.example.java;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args){
		
		System.out.println("Enter your age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();  // Get the integer
		System.out.println("After 5 years your age will be " + (5+age));
		
		
		System.out.println("Enter your name : ");
		Scanner sc_name = new Scanner(System.in);
		String name = sc_name.nextLine(); // Get the string
		System.out.println("Hello " + name);
		
	}

}
