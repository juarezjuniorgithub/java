package com.juarezjunior.java.certification.section3.exercise10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 2
 *
 *         Create a class that demonstrate the use of Autoboxing and Unboxing
 *         scenarios.
 *
 */
public class Section3Exercise2Main {

	public static void main(String[] args) {
		autoBoxingTest();
		autoUnboxingTest();
		autoUnboxingAndAutoBoxingTest();
	}

	public static void autoBoxingTest() {
		Double d = 89.5;
		System.out.println(d);
	}

	public static void autoUnboxingTest() {
		Double d = new Double(89.5);
		System.out.println(d);
	}

	public static void autoUnboxingAndAutoBoxingTest() {
		Integer i = new Integer(-8);

		// unboxing through method invocation
		int absVal = absoluteValue(i);
		System.out.println("absolute value of " + i + " = " + absVal);

		List<Double> ld = new ArrayList<>();
		ld.add(3.1416); // autoboxed through method invocation.

		// unboxing through assignment
		double pi = ld.get(0);
		System.out.println("pi = " + pi);
	}

	public static int absoluteValue(int i) {
		return (i < 0) ? -i : i;
	}

}
