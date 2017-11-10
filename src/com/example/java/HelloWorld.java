package com.example.java;

public class HelloWorld {

	public String greeting;

	// Main method - It ll get called by default
	public static void main(String[] args) {
		System.out.println("Hello Akilan, Welcome to Java");
		HelloWorld greeting = new HelloWorld();
		greeting.test();

	}

	// Constructor get called every time when object created
	public HelloWorld() {
		System.out.println("Constructor Call");

	}

	// User Defined function
	public void test() {
		System.out.println("Calling test function");

	}

}
