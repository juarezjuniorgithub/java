package com.juarezjunior.java.certification.section4.exercise4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadInterruptExample {

	public static void testInterrupt() {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				boolean isLooping = true;

				while (isLooping) {
					try {
						Thread.sleep(1000L);
					} catch (InterruptedException ex) {
						System.err.println(
								Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());
						System.err.println(Thread.currentThread().getName() + " was interruped");
						System.err.println(
								Thread.currentThread().getName() + " " + Thread.currentThread().isInterrupted());
						isLooping = false;
					}
				}
			}
		});
		t.start();
		System.out.println(Thread.currentThread().getName() + " " + t.isInterrupted());
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException ex) {
			Logger.getLogger(ThreadInterruptExample.class.getName()).log(Level.SEVERE, null, ex);
		}
		t.interrupt();
		System.out.println(Thread.currentThread().getName() + " " + t.isInterrupted());
	}
}
