package com.juarezjunior.java.certification.section7.exercise4;

import java.io.Console;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 7, Exercise 4
 *
 *         Create a project that demonstrates the use of java.io.Console class
 *         to read a String and an Integer
 *
 *         Reference:
 *
 *         https://docs.oracle.com/javase/7/docs/api/java/io/Console.html
 *
 */
public class Section7Exercise4Main {

	public static void main(String[] args) {

		Console cons;

		char[] passwd;

		if ((cons = System.console()) != null && (passwd = cons.readPassword("[%s]", "Password:")) != null) {
			System.out.println(passwd);
			java.util.Arrays.fill(passwd, ' ');

			String line = cons.readLine("Read Line: ");
			int i = Integer.parseInt(cons.readLine("Read Integer: "));
			System.out.println(line);
			System.out.println(i);

		}
	}

}
