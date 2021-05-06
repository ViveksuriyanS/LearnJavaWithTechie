package com.java.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReverse {
	public static void main(String[] args) {
		// method 1
		String input = "ABCDE";
		for (int i = input.length() - 1; i > -1; i--) {
			System.out.print(input.charAt(i));
		}

		// method 2
		System.out.println();
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();

		buffer.append(input);
		builder.append(input);

		buffer = buffer.reverse();
		builder = builder.reverse();
		System.out.println(buffer + "\t" + builder);

		System.out.println();

		// Method 3
		// EBCDA // EDCBA //
		int left = 0;
		int right = input.length() - 1;
		char[] inputArr = input.toCharArray();
		while (left < right) {
			char tmp = inputArr[left];
			inputArr[left] = inputArr[right];
			inputArr[right] = tmp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(inputArr));

		// Method 4
		List<Character> listInput = new ArrayList<Character>();
		for (char c : input.toCharArray()) {
			listInput.add(c);
		}
		Collections.reverse(listInput);
		System.out.println(listInput);
	}
}
