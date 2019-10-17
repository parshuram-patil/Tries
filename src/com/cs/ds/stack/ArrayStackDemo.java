package com.cs.ds.stack;

import java.util.Arrays;

public class ArrayStackDemo {

	/*
	 * Problem Statement https://www.geeksforgeeks.org/the-stock-span-problem/
	 */

	public static void main(String[] args) throws StackOperationExcetion {
		int price[] = { 10, 15, 17, 78, 20, 36, 77 };
		int n = price.length;
		int S[] = new int[n];

		calculateSpan(price, n, S);

		printArray(S);
	}

	static void printArray(int arr[]) {
		System.out.print(Arrays.toString(arr));
	}

	static void calculateSpan(int price[], int n, int S[]) throws StackOperationExcetion {
		
		int loopCnt = 0;
		ArrayStack<Integer> st = new ArrayStack<>();
		st.push(0);

		S[0] = 1;

		for (int i = 1; i < n; i++) {

			while (!st.isEmpty() && price[st.top()] <= price[i]) {
				loopCnt++;
				st.pop();
			}

			S[i] = (st.isEmpty()) ? (i + 1) : (i - st.top());

			st.push(i);
			System.out.println(st.size());
		}
		
		System.out.println("Loop Count ---> " + loopCnt);
	}

}
