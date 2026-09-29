package com.bptn.course._01_variables;

public class VariableOperations {

	public static void main(String[] args) {

		int firstNumber = 10;
		int secondNumber = 5;

		System.out.println("Original first number: " + firstNumber);
		System.out.println("Original second number: " + secondNumber);

		int addition = firstNumber + secondNumber;
		int subtraction = firstNumber - secondNumber;
		int multiplication = firstNumber * secondNumber;
		int division = firstNumber / secondNumber;

		System.out.println("Addition: " + addition);
		System.out.println("Subtraction: " + subtraction);
		System.out.println("Multiplication: " + multiplication);
		System.out.println("Division: " + division);

		firstNumber = 6;
		secondNumber = 3;
		System.out.println("Reassigned first number: " + firstNumber);
		System.out.println("Reassigned second number: " + secondNumber);

		char letter = 'A';
		System.out.println(letter);

		String phrase = "Hello World";
		System.out.println(phrase);
	}
}
