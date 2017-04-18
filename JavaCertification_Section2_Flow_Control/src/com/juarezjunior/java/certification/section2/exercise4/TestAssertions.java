package com.juarezjunior.java.certification.section2.exercise4;

public class TestAssertions {

	public void testAssertion() {

		boolean assertsEnabled = false;
		assert assertsEnabled = true; // intentional side effect

		if (!assertsEnabled) {
			throw new RuntimeException("Assertions must be enabled!");
		}
	}
}
