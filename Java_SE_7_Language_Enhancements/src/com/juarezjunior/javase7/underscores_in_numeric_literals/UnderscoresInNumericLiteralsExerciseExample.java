package com.juarezjunior.javase7.underscores_in_numeric_literals;

public class UnderscoresInNumericLiteralsExerciseExample {

	/**
	 *
	 * @author juarezjuniorgithub
	 *
	 *         Underscores In Numeric Literals - Exercise
	 *
	 *         Create a class that demonstrates the use of underscores in
	 *         numeric literals with at least 5 usage examples
	 *
	 *         References:
	 *
	 *         https://docs.oracle.com/javase/8/docs/technotes/guides/language/binary-literals.html
	 *
	 */
	public static void main(String[] args) {

		// improve code legibility
		long creditCardNumber = 1234_5678_9012_3456L;
		long socialSecurityNumber = 999_99_9999L;
		float pi = 3.14_15F;
		long hexBytes = 0xFF_EC_DE_5E;
		long hexWords = 0xCAFE_BABE;
		long maxLong = 0x7fff_ffff_ffff_ffffL;
		byte nybbles = 0b0010_0101;
		long bytes = 0b11010010_01101001_10010100_10010010;

		// float pi1 = 3_.1415F; // Invalid; cannot put underscores adjacent to
		// a decimal point
		// float pi2 = 3._1415F; // Invalid; cannot put underscores adjacent to
		// a decimal point
		// long socialSecurityNumber1 = 999_99_9999_L; // Invalid; cannot put
		// underscores prior to an L suffix

		// int x1 = _52; // This is an identifier, not a numeric literal
		int x2 = 5_2; // OK (decimal literal)
		// int x3 = 52_; // Invalid; cannot put underscores at the end of a
		// literal
		int x4 = 5_______2; // OK (decimal literal)

		// int x5 = 0_x52; // Invalid; cannot put underscores in the 0x radix
		// prefix
		// int x6 = 0x_52; // Invalid; cannot put underscores at the beginning
		// of a number
		int x7 = 0x5_2; // OK (hexadecimal literal)
		// int x8 = 0x52_; // Invalid; cannot put underscores at the end of a
		// number

		int x9 = 0_52; // OK (octal literal)
		int x10 = 05_2; // OK (octal literal)
		// int x11 = 052_; // Invalid; cannot put underscores at the end of a
		// number

		System.out.println("Credit Card Number (long) 1234_5678_9012_3456L = " + creditCardNumber);
		System.out.println("");
		System.out.println("Social Security Number (long) 999_99_9999L = " + socialSecurityNumber);
		System.out.println("");
		System.out.println("Pi (float) 3.14_15F = " + pi);
		System.out.println("");
		System.out.println("Hex Bytes (long) 0xFF_EC_DE_5E = " + hexBytes);
		System.out.println("");
		System.out.println("Hex Words (long) 0xCAFE_BABE = " + hexWords);
		System.out.println("");
		System.out.println("Max long (long) 0x7fff_ffff_ffff_ffffL = " + maxLong);
		System.out.println("");
		System.out.println("Nybbles (byte) 0b0010_0101 = " + nybbles);
		System.out.println("");
		System.out.println("bytes (long) 0b11010010_01101001_10010100_10010010 = " + bytes);
		System.out.println("");
		System.out.println("Valid decimal literal (int) 5_2 = " + x2);
		System.out.println("");
		System.out.println("Valid ecimal literal (int) 5_______2 = " + x4);
		System.out.println("");
		System.out.println("Valid hexadecimal literal (int) 0x5_2 = " + x7);
		System.out.println("");
		System.out.println("Valid octal literal (int) 0_52 = " + x9);
		System.out.println("");
		System.out.println("Valid octal literal (int) 05_2 = " + x10);
		System.out.println("");

	}

}
