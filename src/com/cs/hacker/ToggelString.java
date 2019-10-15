package com.cs.hacker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToggelString {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = String.valueOf(br.readLine());
		StringBuffer output = new StringBuffer(input);

		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (Character.isAlphabetic(eachChar)) {

				if (Character.isLowerCase(eachChar)) {
					output.setCharAt(i, Character.toUpperCase(eachChar));
				} else if (Character.isUpperCase(eachChar)) {
					output.setCharAt(i, Character.toLowerCase(eachChar));
				}
			} else {
				output.setCharAt(i, eachChar);
			}
		}

		System.out.println(output);
		br.close();
	}
}
