package com.cs.hacker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inputNumber = Integer.valueOf(br.readLine());
		int factorial = getFactorial(inputNumber);
		System.out.println(factorial);
		
		br.close();
	}

	private static int getFactorial(int inputNumber) {
		if (inputNumber == 0 || inputNumber == 1)
			return 1;

		return inputNumber * getFactorial(inputNumber - 1);
	}

}
