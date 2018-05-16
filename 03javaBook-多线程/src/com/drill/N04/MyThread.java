package com.drill.N04;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.err.println(Thread.currentThread().getName());
		}

	}

}
