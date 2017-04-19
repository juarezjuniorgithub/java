package com.juarezjunior.java.certification.section3.exercise1;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 1
 *
 *         Create one or more classes that demonstrate the use of of Java
 *         Wrapper classes that inherit from the java.lang.Number class.
 *         Demonstrate the use of primitive extraction values - byteValue(),
 *         intValue(), etc), compareTo() and equals() and conversion methods
 *         valueOf(), parseInt(), toString(), others)
 *
 */
public class Section3Exercise1Main {

	private static String line = "========================";

	public static void main(String[] args) {
		byteWrapperTest();
		integerWrapperTest();
		longWrapperTest();
		floatWrapperTest();
		doubleWrapperTest();
	}

	public static void doubleWrapperTest() {

		System.out.println(line + " Double Test " + line);
		Double a = 1.5;
		Double b = new Double("0.5");
		Double c = -1.5;
		System.out.println("Test toString " + b.toString());
		System.out.printf("Test compareTo == %d\n", b.compareTo(b));
		System.out.printf("Test compareTo + %d\n", b.compareTo(a));
		System.out.printf("Test compareTo - %d\n", b.compareTo(c));

		System.out.println("Double variable has a new value: 578.565498765465");
		b = 578.565498765465;
		int v_int = b.intValue();
		long v_long = b.longValue();
		float v_float = b.floatValue();
		double v_double = b.doubleValue();
		byte v_byte = b.byteValue();
		System.out.println("Test conver v_int:\t" + v_int);
		System.out.println("Test conver v_long:\t" + v_long);
		System.out.println("Test conver v_float:\t" + v_float);
		System.out.println("Test conver v_double:\t" + v_double);
		System.out.println("Test conver v_byte:\t" + v_byte);
	}

	public static void floatWrapperTest() {
		System.out.println(line + " Float Test " + line);
		Float a = 1.5f;
		Float b = new Float("0.5");
		Float c = -1.5f;
		System.out.println("Test toString " + b.toString());
		System.out.printf("Test compareTo == %d\n", b.compareTo(b));
		System.out.printf("Test compareTo + %d\n", b.compareTo(a));
		System.out.printf("Test compareTo - %d\n", b.compareTo(c));

		System.out.println("Float variable has a new value: 578.565498765465f");
		b = 578.565498765465f;
		int v_int = b.intValue();
		long v_long = b.longValue();
		float v_float = b.floatValue();
		double v_double = b.doubleValue();
		byte v_byte = b.byteValue();
		System.out.println("Test conver v_int:\t" + v_int);
		System.out.println("Test conver v_long:\t" + v_long);
		System.out.println("Test conver v_float:\t" + v_float);
		System.out.println("Test conver v_double:\t" + v_double);
		System.out.println("Test conver v_byte:\t" + v_byte);
	}

	public static void longWrapperTest() {
		System.out.println(line + " Long Test " + line);
		Long a = 1L;
		Long b = new Long("0");
		Long c = -1L;
		System.out.println("Test toString " + b.toString());
		System.out.printf("Test compareTo == %d\n", b.compareTo(b));
		System.out.printf("Test compareTo + %d\n", b.compareTo(a));
		System.out.printf("Test compareTo - %d\n", b.compareTo(c));

		System.out.println("Long variable has a new value: 578");
		b = 578L;
		int v_int = b.intValue();
		long v_long = b.longValue();
		float v_float = b.floatValue();
		double v_double = b.doubleValue();
		byte v_byte = b.byteValue();
		System.out.println("Test conver v_int:\t" + v_int);
		System.out.println("Test conver v_long:\t" + v_long);
		System.out.println("Test conver v_float:\t" + v_float);
		System.out.println("Test conver v_double:\t" + v_double);
		System.out.println("Test conver v_byte:\t" + v_byte);
	}

	public static void integerWrapperTest() {
		System.out.println(line + " Integer Test" + line);
		Integer a = 1;
		Integer b = new Integer("0");
		Integer c = -1;
		System.out.println("Test toString " + b.toString());
		System.out.printf("Test compareTo == %d\n", b.compareTo(b));
		System.out.printf("Test compareTo + %d\n", b.compareTo(a));
		System.out.printf("Test compareTo - %d\n", b.compareTo(c));

		System.out.println("Integer variable has a new value: 5");
		b = 578;
		int v_int = b.intValue();
		long v_long = b.longValue();
		float v_float = b.floatValue();
		double v_double = b.doubleValue();
		byte v_byte = b.byteValue();
		System.out.println("Test conver v_int:\t" + v_int);
		System.out.println("Test conver v_long:\t" + v_long);
		System.out.println("Test conver v_float:\t" + v_float);
		System.out.println("Test conver v_double:\t" + v_double);
		System.out.println("Test conver v_byte:\t" + v_byte);
	}

	public static void byteWrapperTest() {
		System.out.println(line + " Byte Test" + line);
		Byte a = 1;
		Byte b = new Byte("0");
		Byte c = -1;
		System.out.println("Test toString " + b.toString());
		System.out.println("Test byteValue " + b.byteValue());
		System.out.printf("Test compareTo == %d\n", b.compareTo(b));
		System.out.printf("Test compareTo + %d\n", b.compareTo(a));
		System.out.printf("Test compareTo - %d\n", b.compareTo(c));

		System.out.println("byte variable has a new value: 5");
		b = 127;
		int v_int = b.intValue();
		long v_long = b.longValue();
		float v_float = b.floatValue();
		double v_double = b.doubleValue();
		System.out.println("Test conver v_int:\t" + v_int);
		System.out.println("Test conver v_long:\t" + v_long);
		System.out.println("Test conver v_float:\t" + v_float);
		System.out.println("Test conver v_double:\t" + v_double);
	}

	public static void numberTest() {

		@SuppressWarnings("unused")
		Number n = new Number() {

			private static final long serialVersionUID = 4560789251583403489L;

			@Override
			public int intValue() {
				throw new UnsupportedOperationException("Not supported yet.");
			}

			@Override
			public long longValue() {
				throw new UnsupportedOperationException("Not supported yet.");
			}

			@Override
			public float floatValue() {
				throw new UnsupportedOperationException("Not supported yet.");
			}

			@Override
			public double doubleValue() {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
	}
}
