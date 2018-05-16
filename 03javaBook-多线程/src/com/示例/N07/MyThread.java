package com.示例.N07;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+"正在运行"+i);
		}

	}

}
