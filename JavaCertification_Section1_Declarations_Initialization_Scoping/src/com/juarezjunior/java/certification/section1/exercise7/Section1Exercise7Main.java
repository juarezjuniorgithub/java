package com.juarezjunior.java.certification.section1.exercise7;

import com.juarezjunior.java.certification.section1.exercise7.a1.X;
import com.juarezjunior.java.certification.section1.exercise7.b1.Y;

/**
 *
 * @author @juarezjuniorgithub
 *
 *         Section 1, Exercise 7
 *
 *         Create two classes that demonstrate the use of package and import
 *         statements
 *
 *         Reference:
 *
 *         http://docs.oracle.com/javase/tutorial/java/package/packages.html
 *
 */
public class Section1Exercise7Main {

	public static void main(String[] args) {
		Y y = new Y(new X());
		System.out.println(y.toString());
	}

}
