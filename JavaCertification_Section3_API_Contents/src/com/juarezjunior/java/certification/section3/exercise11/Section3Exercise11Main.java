package com.juarezjunior.java.certification.section3.exercise11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 11
 *
 *         Create a class that demonstrates the use of java.util.regex.Pattern
 *         and at lest 3 of its methods
 */
public class Section3Exercise11Main {

	public static void main(String[] args) {

		// String to be scanned to find the pattern
		String line = "The order was placed for MT8000!";

		// Create a Pattern object
		String stringPattern = "(.*)(\\d+)(.*)";
		Pattern pattern = Pattern.compile(stringPattern);
		System.out.println(pattern.pattern());

		// Now create matcher object
		Matcher matcher = pattern.matcher(line);

		if (matcher.find()) {
			System.out.println(matcher.toString());
			System.out.println("Found value: " + matcher.group(0));
			System.out.println("Found value: " + matcher.group(1));
			System.out.println("Found value: " + matcher.group(2));
		} else {
			System.out.println("NO MATCH");
		}
	}

}
