package com.juarezjunior.javase7.binaryliterals;

public class BinaryLiteralsExerciseExample {

	/**
	 *
	 * @author juarezjuniorgithub
	 *
	 *         Bynary Literals - Exercise
	 *
	 *         Create a class that demonstrates the use of binary literals
	 *         (declaration) for all primitive integral types (byte, short, int
	 *         and long)
	 *
	 *         References:
	 *
	 *         https://docs.oracle.com/javase/8/docs/technotes/guides/language/binary-literals.html
	 *
	 */
	public static void main(String[] args) {

		// An 8-bit 'byte' value:
		byte aByte = 0b0100001;
		byte aByte2 = (byte) 0b0111;

		// A 16-bit 'short' value:
		short aShort = 0b1010;
		short aShort2 = 0b111111111111111;

		// Some 32-bit 'int' values:
		int anInt1 = 0b10100001010001011010000101000101;
		int anInt2 = 0b111; // note that the b can be lower case OR
		int anInt3 = 0B111; // or the b can B upper case

		// A 64-bit 'long' value. Note the "L" or "l" suffix:
		long aLong = 0b10100001010000010100010110100001010001011010000101000101L;
		long aLong1 = 0b10100001010000010100010110100001010001011010000101000101l;
		long aLong2 = (long) 0B0111L;

		System.out.println("byte values:");
		System.out.println(aByte);
		System.out.println(aByte2);
		System.out.println("");

		System.out.println("short values:");
		System.out.println(aShort);
		System.out.println(aShort2);
		System.out.println("");


		System.out.println("int values:");
		System.out.println(anInt1);
		System.out.println(anInt2);
		System.out.println(anInt3);
		System.out.println("");

		System.out.println("long values:");
		System.out.println(aLong);
		System.out.println(aLong1);
		System.out.println(aLong2);
	}

}
