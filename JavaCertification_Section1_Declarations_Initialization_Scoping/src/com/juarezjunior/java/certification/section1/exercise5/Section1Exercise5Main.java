package com.juarezjunior.java.certification.section1.exercise5;

/**
 *
 * @author @juarezjuniorgithub
 *
 *         Section 1, Exercise 5
 *
 *         Create a class and an interface and demonstrate the use of an
 *         interface by a class, e.g. java.lang.Runnable
 *
 */
public class Section1Exercise5Main {

	public static void main(String[] args) {

		Thread t = new Thread(new SimpleThread());
		t.start();
	}

}
