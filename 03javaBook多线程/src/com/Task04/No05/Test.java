package com.Task04.No05;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread zs = new Thread(bank,"张三");
		Thread zsq = new Thread(bank,"张三的妻子");
		
		zs.start();
		zsq.start();
	}

}
