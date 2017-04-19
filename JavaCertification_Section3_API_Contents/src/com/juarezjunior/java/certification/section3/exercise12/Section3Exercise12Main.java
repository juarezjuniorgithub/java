package com.juarezjunior.java.certification.section3.exercise12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 11
 *
 *         Create a class that demonstrates the use of java.util.regex.Matcher
 *         and at lest 2 of its methods
 */
public class Section3Exercise12Main {

	public static void main(String[] args) {

		String text = "https://twitter.com/juarezjunior";

		String patternString = "https://";

		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);

		System.out.println("lookingAt = " + matcher.lookingAt());
		System.out.println("matches   = " + matcher.matches());

	}
}
