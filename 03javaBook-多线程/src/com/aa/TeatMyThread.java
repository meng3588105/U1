package com.aa;

public class TeatMyThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread t1 = new MyThread("hello");
		MyThread t2 = new MyThread("world");
		
		t1.start();
		t2.start();
	}

}
