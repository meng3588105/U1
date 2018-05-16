package com.示例.N01;
import java.lang.Thread;
public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("当前线程名"+t.getName());
		t.setName("孟祥龙");
		System.out.println("当前的线程名是："+t.getName());
	}

}
