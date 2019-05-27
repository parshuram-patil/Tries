package com.cs.challenges;

public class SpriralArray {

	static final String NEW_LINE_CHAR = "\n";
	static final String TAB_CHAR = "\t";

	public static void printmatrix(int noOfRow, int noOfColumn, int matrix[][]) {

		for (int i = 0; i < 3; i++) {
			if (i % 2 == 0) {
				//System.out.println("Odd");
				for (int j = 0; j < noOfColumn; j++) {
					//System.out.println("\t" + matrix[i][j]);
					printIt(TAB_CHAR, matrix[i][j]);
				}
			} else {
				//System.out.println("Even");
				for (int j = noOfColumn - 1; j >= 0; j--) {
					//System.out.println("\t" + matrix[i][j]);
					printIt(TAB_CHAR, matrix[i][j]);
				}

			}

			//System.out.println(" Row Complete \n");
			printIt(NEW_LINE_CHAR, "");
		}

	}

	private static void printIt(String formatter, Integer e) {
		printIt(formatter, e.toString());
	}

	private static void printIt(String formatter, String e) {
		System.out.print(formatter + e);
	}

	public static void main(String args[]) {
		System.out.println("Printing Spiral Array");

		int noOfRow = 3;
		int noOfColumn = 6;
		int matrix[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 }, { 13, 14, 15, 16, 17, 18 } };
		printmatrix(noOfRow, noOfColumn, matrix);

	}

}
