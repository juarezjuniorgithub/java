package com.juarezjunior.java.certification.section4.exercise6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadWithSynchronizedMethod implements Runnable {

	private static int value = 0;

	@Override
	public void run() {

		System.out.println(value + " for:" + Thread.currentThread().getName());

		for (int i = 0; i < 10; i++) {

			add();

			System.out.println(value + " for:" + Thread.currentThread().getName());

			try {
				Thread.sleep(1000L);
			} catch (InterruptedException ex) {
				Logger.getLogger(ThreadWithSynchronizedMethod.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}

	private synchronized void add() {
		value += 1;
	}
}
