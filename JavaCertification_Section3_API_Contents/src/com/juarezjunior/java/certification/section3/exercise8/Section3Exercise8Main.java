package com.juarezjunior.java.certification.section3.exercise8;

import java.io.Console;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 3, Exercise 8
 *
 *         Create a class that demonstrates the use of java.io.Console
 *
 */
public class Section3Exercise8Main {

	public static void main(String[] args) {

		Console c = System.console();
		String name = c.readLine("Name: ");
		char[] pwd = c.readPassword("Password: ");
		System.out.println(name);
		System.out.println(pwd);

	}

}
