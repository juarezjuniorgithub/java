package com.juarezjunior.java.certification.section2.exercise3;

/**
 *
 * @author @juarezjuniorgithub
 */
public class TestRelationalAndConditionalOperators {

	public void testComparisonOperators() {
		int value1 = 1;
		int value2 = 2;
		if (value1 == value2) {
			System.out.println("value1 == value2");
		}
		if (value1 != value2) {
			System.out.println("value1 != value2");
		}
		if (value1 > value2) {
			System.out.println("value1 > value2");
		}
		if (value1 < value2) {
			System.out.println("value1 < value2");
		}
		if (value1 <= value2) {
			System.out.println("value1 <= value2");
		}
	}

	public void testConditionalOperators() {
		int value1 = 1;
		int value2 = 2;
		if ((value1 == 1) && (value2 == 2)) {
			System.out.println("value1 is 1 AND value2 is 2");
		}
		if ((value1 == 1) || (value2 == 1)) {
			System.out.println("value1 is 1 OR value2 is 1");
		}
	}

	public void testConditionalOperators2() {
		int value1 = 1;
		int value2 = 2;
		int result;
		boolean someCondition = true;
		result = someCondition ? value1 : value2;

		System.out.println(result);
	}


}
