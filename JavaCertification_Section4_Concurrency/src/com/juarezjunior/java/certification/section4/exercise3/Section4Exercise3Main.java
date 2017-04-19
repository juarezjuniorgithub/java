package com.juarezjunior.java.certification.section4.exercise3;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 4, Exercise 3
 *
 *         Create a class that demonstrates how to pause a thread for 10 seconds
 *         by using the Thread.sleep() method
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/essential/concurrency/sleep.html
 *
 */
public class Section4Exercise3Main {

	public static void main(String[] args) {
		Thread t = new Thread(new ThreadSleepExample());
		t.start();
	}
}
