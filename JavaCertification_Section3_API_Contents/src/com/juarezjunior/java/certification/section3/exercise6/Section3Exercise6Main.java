package com.juarezjunior.java.certification.section3.exercise6;

import javax.swing.text.Segment;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 6
 *
 *         Create a class that demonstrate the use of java.lang.StringBuffer and
 *         at least 2 of its constructors and 6 of its methods
 */
public class Section3Exercise6Main {

	public static void main(String[] args) {

		String a = "Print Test";
		StringBuffer sb = new StringBuffer();
		char chars[] = a.toCharArray();
		CharSequence cs = new Segment(chars, 0, a.length());
		StringBuffer sb1 = new StringBuffer(cs);
		StringBuffer sb2 = new StringBuffer(a);
		StringBuffer sb3 = new StringBuffer(10);

		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
		System.out.println(sb3.toString());

		StringBuffer sbT = new StringBuffer(cs);
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
