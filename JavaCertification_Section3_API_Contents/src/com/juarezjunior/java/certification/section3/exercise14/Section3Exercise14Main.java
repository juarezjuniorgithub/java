package com.juarezjunior.java.certification.section3.exercise14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 14
 *
 *         Create a class that has a method that uses a regular expression to
 *         validate an email address, e.g. juarez.barbosa@gmail.com
 */
public class Section3Exercise14Main {

	public static void main(String[] args) {
		Section3Exercise14Main p = new Section3Exercise14Main();
		System.out.println(p.validate("juarez.barbosa@gmail.com"));
		System.out.println(p.validate("sz.ys@gs.sm"));
		System.out.println(p.validate("@"));
	}

	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public Section3Exercise14Main() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	public boolean validate(final String hex) {

		matcher = pattern.matcher(hex);
		return matcher.matches();

	}

}
