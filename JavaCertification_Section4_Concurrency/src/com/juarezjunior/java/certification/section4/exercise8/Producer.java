package com.juarezjunior.java.certification.section4.exercise8;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<String> drop;

	public Producer(BlockingQueue<String> drop) {
		this.drop = drop;
	}

	public void run() {
		String importantInfo[] = { "IM message 1", "IM message 2", "IM message 3", "IM message 4" };
		Random random = new Random();

		try {
			for (int i = 0; i < importantInfo.length; i++) {
				drop.put(importantInfo[i]);
				Thread.sleep(random.nextInt(5000));
			}
			drop.put("DONE");
		} catch (InterruptedException e) {
		}
	}
}
