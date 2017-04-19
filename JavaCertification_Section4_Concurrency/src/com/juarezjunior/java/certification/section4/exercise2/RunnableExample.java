package com.juarezjunior.java.certification.section4.exercise2;

public class RunnableExample implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread: " + Thread.currentThread().getName() + " value: " + i);

		}
	}
}
