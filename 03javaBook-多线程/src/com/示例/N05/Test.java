package com.示例.N05;

public class Test {

	/**
	 * 通过继承Thread类来创建线程  测试类
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread a = new Thread(t);
		a.start();
		a.run();

	}

}
