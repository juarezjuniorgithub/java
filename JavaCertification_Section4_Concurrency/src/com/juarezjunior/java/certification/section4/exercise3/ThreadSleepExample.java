package com.juarezjunior.java.certification.section4.exercise3;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadSleepExample implements Runnable {

	String value = "";

	@Override
	public void run() {

		Random r = new Random();

		for (int i = 0; i < 10; i++) {

			try {
				value += (char) ('A' + r.nextInt(26));
				;
				Thread.sleep(1000L);
				System.out.println(value);
			} catch (InterruptedException ex) {
				Logger.getLogger(ThreadSleepExample.class.getName()).log(Level.SEVERE, null, ex);
			}
		}
	}
}
