package com.Test.tong.tongbu;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test mt = new Test();
			new Thread(mt,"线程").start();
			mt.run();
	}

}
