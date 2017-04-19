package com.juarezjunior.java.certification.section6.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 6, Exercise 6
 *
 *         Create a class that demonstrates the use of java.util classes.
 *         Demonstrate List manipulation using classification, perform a binary
 *         search and convert the List to an array
 *
 */
public class Section6Exercise6Main {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			a.add(r.nextInt(10));
		}

		System.out.println(a);
		int k = r.nextInt(10);
		System.out.println(k);

		Object[] ar = a.toArray();
		Arrays.sort(ar);
		System.out.println(Arrays.binarySearch(ar, k));
	}

}
