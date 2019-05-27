package com.cs.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CostOfConnectingPipes {

	static Integer findCost(Integer[] arr) {
		List<Integer> arrayList = Arrays.asList(arr);
		arrayList.sort(null);
		// arrayList.forEach(e -> System.out.println(e));
		Integer sum = arrayList.get(0) + arrayList.get(1);
		List<Integer> cost = new ArrayList<>();
		cost.add(sum);

		for (int looCount = 2; looCount < arrayList.size(); looCount++) {
			sum += arrayList.get(looCount);
			cost.add(sum);
		}

		sum = 0;
		for (Integer e : cost) {
			//System.out.println(e);
			sum += e;
		}

		return sum;

	}

	public static void main(String[] args) {
		System.out.println("\t\tFinding Cost of connecting Pipes or ropes\n\n");
		Integer arr[] = {9, 10, 1, 3, 45 };
		Integer minCost = findCost(arr);
		System.out.println("Minimum Cost : " + minCost);
	}

}
