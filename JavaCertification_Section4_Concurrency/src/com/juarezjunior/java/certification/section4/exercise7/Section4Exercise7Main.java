package com.juarezjunior.java.certification.section4.exercise7;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 4, Exercise 6
 *
 *         Create a class that demonstrates the use of a synchronized statement
 *         (code block)
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/essential/concurrency/locksync.html
 *
 */
public class Section4Exercise7Main {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ThreadWithSynchronizedStatement());
		Thread t2 = new Thread(new ThreadWithSynchronizedStatement());
		Thread t3 = new Thread(new ThreadWithSynchronizedStatement());
		t1.start();
		t2.start();
		t3.start();

	}
}
