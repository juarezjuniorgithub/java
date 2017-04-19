package com.juarezjunior.java.certification.section4.exercise1;

public class ThreadExample extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Thread: " + currentThread().getName() + " value: " + i);

		}
	}
}
