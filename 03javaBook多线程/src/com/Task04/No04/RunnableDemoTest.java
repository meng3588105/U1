package com.Task04.No04;

public class RunnableDemoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RunnableDemo a = new RunnableDemo();
		Thread aa = new Thread(a);
		aa.setName("接口类线程");
		aa.start();

	}

}
