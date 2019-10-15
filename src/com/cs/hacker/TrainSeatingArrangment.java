package com.cs.hacker;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TrainSeatingArrangment {
	
	public static void main(String args[]) throws Exception {
		System.out.println("Stat");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> input = new ArrayList<>();
		int numOfTests = Integer.valueOf(br.readLine());
		//int input = 15;
		for(int cnt = 0; cnt < numOfTests; cnt++) {
			input.add(Integer.valueOf(br.readLine()));
		}
		
		int[] diffByModululoIndex = {-11, 11, 9, 7, 5, 3, 1, -1, -3, -5, -7, -9};
		String[] seatTypeByModuloIndex = {"WS", "WS", "MS", "AS", "AS", "MS", "WS", "WS", "MS", "AS", "AS", "MS"};
		input.forEach(e -> {
			int moduloIndex = e % 12;
			int oppositeSeatNumber = e + diffByModululoIndex[moduloIndex];
			String seatType = seatTypeByModuloIndex[moduloIndex];
			System.out.println(oppositeSeatNumber + " " + seatType);
		});
		
        br.close();
		
	}

}
