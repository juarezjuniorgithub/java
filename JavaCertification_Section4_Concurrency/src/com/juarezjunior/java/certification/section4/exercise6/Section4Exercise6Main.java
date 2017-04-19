package com.juarezjunior.java.certification.section4.exercise6;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 4, Exercise 6
 *
 *         Create a class that demonstrates the use of synchronized methods
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/essential/concurrency/syncmeth.html
 *
 */
public class Section4Exercise6Main {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadWithSynchronizedMethod());
		Thread t2 = new Thread(new ThreadWithSynchronizedMethod());
		Thread t3 = new Thread(new ThreadWithSynchronizedMethod());
		t1.start();
		t2.start();
		t3.start();
	}
}
