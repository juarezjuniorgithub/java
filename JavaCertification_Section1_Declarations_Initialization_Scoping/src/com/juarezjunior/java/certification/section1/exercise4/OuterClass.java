package com.juarezjunior.java.certification.section1.exercise4;

/**
 *
 * @author @juarezjuniorgithub
 */
public class OuterClass {

	public boolean test() {

		class LocalClass {

			boolean test() {
				return true;
			}

		}

		LocalClass test = new LocalClass();

		return test.test();

	}

}
