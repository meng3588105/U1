package com.示例.N02;

public class Test {

	/**
	 * 通过继承Thread类来创建线程  测试类
	 */
	public static void main(String[] args) {
		/*MyThread thread = new MyThread();
		MyThread thread2 = new MyThread();
		thread.start();//启动线程
		thread2.start();//启动线程
*/	
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.run();//启动主线程
		t2.run();//启动主线程
		
	}

}
