package com.juarezjunior.java.certification.section3.exercise4;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 4
 *
 *         Create a class that demonstrate the use of java.lang.String class,
 *         showing the use of at least 3 of its constuctors and at least 10 of
 *         its methods, including format() and printf()
 */
public class Section3Exercise4Main {

	public static void main(String[] args) {

		double pi = Math.PI;
		String construtor1 = new String();
		char chars[] = { 'a', 'v' };
		String construtor2 = new String(chars);
		String construtor3 = new String(chars, 1, 1);
		System.out.println(construtor1);
		System.out.println(construtor2);
		System.out.println(construtor3);
		String a = "Print Test ";
		System.out.println(a);
		System.out.println(a.concat(a));
		System.out.println(a);
		System.out.println(a.replace(" ", ""));
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.intern());
		System.out.println(a.substring(2));
		System.out.println(a.substring(2, 5));
		System.out.println(a.length());
		System.out.println(a.hashCode());
		System.out.println(String.valueOf(a));
		System.out.printf("%s\n", a);
		System.out.format("%f\n", pi);

	}

}
