package com.juarezjunior.java.certification.section2.exercise3;

/**
 *
 * @author @juarezjuniorgithub
 */
public class TestArithmeticOperators {

	public void testArithmeticOperators() {
		int result = 1 + 2;

		System.out.println("1 + 2 = " + result);
		int original_result = result;
		result = result - 1;

		System.out.println(original_result + " - 1 = " + result);
		original_result = result;
		result = result * 2;

		System.out.println(original_result + " * 2 = " + result);
		original_result = result;
		result = result / 2;

		System.out.println(original_result + " / 2 = " + result);
		original_result = result;
		result = result + 8;

		System.out.println(original_result + " + 8 = " + result);
		original_result = result;

		result = result % 7;

		System.out.println(original_result + " % 7 = " + result);
	}

	public void testStringConcatenation() {
		String firstString = "This is";
		String secondString = " a concatenated String";
		String thirdString = firstString + secondString;
		System.out.println(thirdString);
	}

	public void testUnaryOperators() {
		int result = +1;
		System.out.println(result);

		result--;
		System.out.println(result);

		result++;
		System.out.println(result);

		result = -result;
		System.out.println(result);

		boolean success = false;
		System.out.println(success);
		System.out.println(!success);
	}

	public void testPreAndPostFixOperators() {
		int i = 3;
		i++;
		System.out.println(i);

		++i;
		System.out.println(i);

		System.out.println(++i);

		System.out.println(i++);

		System.out.println(i);
	}

}
