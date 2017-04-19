package com.juarezjunior.java.certification.section7.exercise2;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 7, Exercise 2
 *
 *         Create a class that demonstrates the passing of three different
 *         arguments to the main() method and their usage inside of it as well
 *
 *         Reference:
 *
 *         https://docs.oracle.com/javase/tutorial/getStarted/application/index.html
 *
 */
public class Section7Exercise2Main {

	public static void main(String[] args) {

		for (String arg : args) {
			System.out.println(arg);
		}

		if (args.length > 1) {
			System.out.println("Number of arguments:" + args.length);
		}
	}

}
