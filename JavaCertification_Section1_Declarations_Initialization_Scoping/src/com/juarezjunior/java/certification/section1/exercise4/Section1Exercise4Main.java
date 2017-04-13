package com.juarezjunior.java.certification.section1.exercise4;

/**
 *
 * @author @juarezjuniorgithub
 *
 *         Section 1, Exercise 4
 *
 *         Create and demonstrate the usage of a local class and an anonymous
 *         inner class
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/java/javaOO/innerclasses.html
 *         http://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html
 *         http://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
 *
 */
public class Section1Exercise4Main {

	public static void main(String[] args) {

		final OuterClass outer = new OuterClass();

		System.out.println(outer.test());

		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(outer.test());
			}

		}).start();

	}

}
