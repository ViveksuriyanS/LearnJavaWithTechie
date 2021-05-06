package com.java.basics;

public class Maximum {

	public static void main(String[] args) {
		int x = 8;
		int y = 5;
		int z = 10;

		if (x > y && x > z) {
			System.out.println(x + " is the max");
		} else if (y > z) {
			System.out.println(y + " is the max");
		} else {
			System.out.println(z + " is the max");
		}

		System.out.println(Math.max(Math.max(8, 5), z));

	}

}
