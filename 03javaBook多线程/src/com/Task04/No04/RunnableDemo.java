package com.Task04.No04;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+i);
		}

	}
}
