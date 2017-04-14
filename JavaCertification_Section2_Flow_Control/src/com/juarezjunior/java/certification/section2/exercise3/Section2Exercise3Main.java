package com.juarezjunior.java.certification.section2.exercise3;

/**
 *
 * @author @juarezjuniorgithub
 *
 *         Section 2, Exercise 3
 *
 *         Create one or more classes that demonstrate the use of the following
 *         operators: : 3 basic arithmetic operators like +, -, *, /, ternary
 *         operator, assignment operators like =, +=, unary bitwise complement
 *         operator "~", instanceof, conditional &&, comparison operators ==, !=
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/extra/certification/javase-7-programmer1.html#operators
 *
 */
public class Section2Exercise3Main {

	public static void main(String[] args) {

		TestBitwiseBitShiftOperators bw = new TestBitwiseBitShiftOperators();
		bw.testBitwiseOperator();

		TestRelationalAndConditionalOperators rco = new TestRelationalAndConditionalOperators();
		rco.testComparisonOperators();
		rco.testConditionalOperators();
		rco.testConditionalOperators2();

		TestInstanceOfOperator io = new TestInstanceOfOperator();
		io.testInstanceofOperator();

		TestArithmeticOperators ao = new TestArithmeticOperators();
		ao.testArithmeticOperators();
		ao.testStringConcatenation();
		ao.testPreAndPostFixOperators();
		ao.testUnaryOperators();

	}
}
