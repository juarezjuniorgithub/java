package com.juarezjunior.java.certification.section3.exercise10;

import java.util.Locale;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 10
 *
 *         Create a class that demonstrates the use of a pt_BR java.util.Locale
 *         as well as the default java.util.Locale
 *
 */
public class Section3Exercise10Main {

	public static void main(String[] args) {

		Locale locale = new Locale("pt_BR");
		System.out.println(locale.getDisplayName());
		Locale defaultLocale = Locale.getDefault();
		System.out.println(defaultLocale.getDisplayName());
	}

}
