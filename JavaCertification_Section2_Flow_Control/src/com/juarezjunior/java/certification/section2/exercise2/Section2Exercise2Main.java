package com.juarezjunior.java.certification.section2.exercise2;

/**
 *
 * @author @juarezjuniorgithub
 *
 *         Section 2, Exercise 2
 *
 *         Create one or more classes that can demonstrate the use of loop
 *         constructs: for, enhanced for, while, do...while, break, labeled
 *         break, continue, labeled continue.
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html
 *         https://blogs.oracle.com/CoreJavaTechTips/entry/using_enhanced_for_loops_with
 *         http://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html
 *         http://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.htm
 *
 */
public class Section2Exercise2Main {

	public static void main(String[] args) {

		ClassTestFlow main = new ClassTestFlow();
		main.breakTest();
		main.continueTest();
		main.doWhileTest();
		main.forTest();
		main.labeledBreakTest();
		main.labeledContinueTest();
		main.whileTest();

	}
}
