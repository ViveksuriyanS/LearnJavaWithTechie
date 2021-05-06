package com.java.basics;

public class Factorial {

	public static void main(String[] args) {
		int input = 5;
		int output = 1; // 0! => 1

		for (int i = 1; i <= input; i++) {
			output = output * i;
		}
		System.out.println(output);

		System.out.println("Recursive output : " + recursiveFactorial(input));
	}

	private static int recursiveFactorial(int input) {
		if (input == 0)
			return 1;
		if (input == 1)
			return 1;

		return input * recursiveFactorial(input - 1);

	}
}
