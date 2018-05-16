package com.示例.N06;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new Mythread());
		System.out.println("线程t为新建！");
		t.start();
		System.out.println("线程t为就绪");
	}

}
