package com.juarezjunior.java.certification.section3.exercise5;

import javax.swing.text.Segment;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 5
 *
 *         Create a class that demonstrate the use of java.lang.StringBuilder
 *         and at least 3 of its constructors and 6 of its methods
 */
public class Section3Exercise5Main {

	public static void main(String[] args) {

		String a = "Print Test";
		StringBuilder sb = new StringBuilder();
		char chars[] = a.toCharArray();
		CharSequence cs = new Segment(chars, 0, a.length());
		StringBuilder sb1 = new StringBuilder(cs);
		StringBuilder sb2 = new StringBuilder(a);
		StringBuilder sb3 = new StringBuilder(10);
		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());
		StringBuilder sbT = new StringBuilder(cs);
		System.out.println(sbT);
		sbT.append(" tev");
		System.out.println(sbT);
		sbT.delete(5, 10);
		System.out.println(sbT);
		sbT.appendCodePoint(64);
		System.out.println(sbT);
		sbT.reverse();
		System.out.println(sbT);

	}

}
