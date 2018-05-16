package com.示例.N10;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t1 = new Thread(my,"线程A");
		Thread t2 = new Thread(my,"线程B");
		t1.start();
		t2.start();
	}

}
