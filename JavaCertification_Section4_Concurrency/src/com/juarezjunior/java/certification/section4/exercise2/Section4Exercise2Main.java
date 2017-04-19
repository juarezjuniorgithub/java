package com.juarezjunior.java.certification.section4.exercise2;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 4, Exercise 2
 *
 *         Create a class that demonstrates the creation and execution of a Java
 *         thread that uses the java.lang.Runnable interface
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
 *
 */
public class Section4Exercise2Main {

	public static void main(String[] args) {
		Thread t = new Thread(new RunnableExample(), "1");
		t.start();
	}
}
