package com.cs.hacker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GokiBreakUP {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberOfPeople = Integer.valueOf(br.readLine());
		int expectedSkills = Integer.valueOf(br.readLine());
		for (int i = 0; i < numberOfPeople; i++) {
			int presentSkills = Integer.valueOf(br.readLine());
			if(presentSkills >= expectedSkills)
				System.out.println("YES");
			else
				System.out.println("NO");
		}

		br.close();
	}
}
