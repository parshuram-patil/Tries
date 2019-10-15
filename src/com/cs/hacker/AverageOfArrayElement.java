package com.cs.hacker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AverageOfArrayElement {
	public static void main(String args[]) throws Exception {
		System.out.println("****************************** Start ****************************** ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Scanner sc = new Scanner(System.in);
		// Size of the Array
		int n = Integer.valueOf(br.readLine());
		// int n = sc.nextInt();
		// Array Elements
		int[] input = new int[n];
		for (int i = 0; i < n; i++)
			input[i] = Integer.valueOf(br.readLine());
		// input[i] = sc.nextInt();

		// int[] output = withNSquareComplexity(n, input);
		int[] output = withNComplexity(n, input);

		for (int e : output) {
			System.out.print(e + "\t");
		}

		br.close();
		//sc.close();
	}

	private static int[] withNComplexity(int n, int[] input) {

		int[] output = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += input[i];

			output[i] = sum / (i + 1);
		}

		return output;
	}

	private static int[] withNSquareComplexity(int n, int[] input) {
		int[] output = new int[n];
		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = 0; j <= i; j++) {
				sum += input[j];
			}

			output[i] = sum / (i + 1);
		}

		return output;
	}
}
