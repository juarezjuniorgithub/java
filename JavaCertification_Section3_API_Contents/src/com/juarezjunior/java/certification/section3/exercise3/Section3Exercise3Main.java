package com.juarezjunior.java.certification.section3.exercise3;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 3
 *
 *         Create a project with a Java class that demonstrate the use of the
 *         Character class and its main methods - isLetter, isDigit,
 *         isWhitespace, toUpperCase, toLowerCase, others
 *
 *
 */
public class Section3Exercise3Main {

	private static Character value = 'a';
	private static Character value2 = 'a';

	public static void main(String[] args) {
		characterTest();
	}

	public static void characterTest() {
		printVariables();
		value2 = Character.toUpperCase(value);
		printVariables();
		value2 = Character.toLowerCase(value);
		printVariables();
		value2 = Character.toTitleCase(value);
		printVariables();
		System.out.println("isTitleCase " + Character.isTitleCase(value) + " " + Character.isTitleCase(value2));
		value2 = Character.highSurrogate(45);
		printVariables();
		value2 = Character.toChars(value)[0];
		printVariables();
	}

	static void printVariables() {
		System.out.print("a value: " + value);
		System.out.println("b value: " + value2);
	}

}
