package com.juarezjunior.java.certification.section4.exercise8;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

/**
 *
 * @author juarezjuniorgithub
 *
 *         Section 4, Exercise 8
 *
 *         Create a class that demonstrates the use of the Producer / Consumer
 *         design pattern
 *
 *         References:
 *
 *         http://docs.oracle.com/javase/tutorial/essential/concurrency/sync.html
 *         http://docs.oracle.com/javase/tutorial/essential/concurrency/memconsist.html
 *
 */
public class Section4Exercise8Main {

	public static void main(String[] args) {

		BlockingQueue<String> drop = new SynchronousQueue<String>();
		(new Thread(new Producer(drop))).start();
		(new Thread(new Consumer(drop))).start();

	}

}
