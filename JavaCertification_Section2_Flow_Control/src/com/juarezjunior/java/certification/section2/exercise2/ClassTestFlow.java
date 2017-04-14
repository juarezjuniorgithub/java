package com.juarezjunior.java.certification.section2.exercise2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juarezjuniorgithub
 */
public class ClassTestFlow {

	public void forTest() {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

		for (int i : list) {
			System.out.println(i);
		}
	}

	public void enhancedForTest() {

		ArrayList<String> stockExchanges = new ArrayList<String>();
		stockExchanges.add("NASDAQ");
		stockExchanges.add("FTSE");
		stockExchanges.add("BOVESPA");

		for (String aluno : stockExchanges) {
			System.out.println("Iterating through the enhanced for loop. Array element: " + aluno);
		}
	}

	public void whileTest() {
		boolean test = true;
		int i = 0;
		while (test) {
			if (i > 10) {
				test = false;
			}
			i++;
		}
		System.out.println("enf of while loop");

	}

	public void doWhileTest() {
		boolean test = true;
		int i = 0;
		do {
			if (i > 10) {
				test = false;
			}
			i++;
		} while (test);
		System.out.println("end of while loop");

	}

	public void breakTest() {
		boolean test = true;
		int i = 0;
		do {
			if (i > 10) {
				break;
			}
			i++;
		} while (test);
		System.out.println("end with break");

	}

	public void labeledBreakTest() {
		int[][] arrayOfInts = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 0, 1, 2 } };
		int searchfor = 12;

		int i;
		int j = 0;
		boolean foundIt = false;

		search: for (i = 0; i < arrayOfInts.length; i++) {
			for (j = 0; j < arrayOfInts[i].length; j++) {
				if (arrayOfInts[i][j] == searchfor) {
					foundIt = true;
					break search;
				}
			}
		}

		if (foundIt) {
			System.out.println("Found " + searchfor + " at " + i + ", " + j);
		} else {
			System.out.println(searchfor + " not in the array");
		}
	}

	public void continueTest() {
		boolean test = true;
		int i = 0;
		do {
			i++;
			if (i > 20) {
				break;
			} else if (i > 10) {
				continue;
			}
		} while (test);
		System.out.println("end of continue");
	}

	public void labeledContinueTest() {
		boolean test = true;
		int i = 0;
		labelContinue: do {
			i++;
			if (i > 20) {
				break labelContinue;
			} else if (i > 10) {
				continue labelContinue;
			}

		} while (test);
		System.out.println("end of labeled continue");
	}
}
