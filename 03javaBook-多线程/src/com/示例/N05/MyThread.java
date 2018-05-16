package com.示例.N05;
/**
 * 通过接口Thread类来创建线程
 *
 */
public class MyThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}

}
