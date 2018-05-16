package com.示例.N07;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//通过构造方法指定线程名
		Thread t1 = new Thread(new MyThread(),"线程A");
		Thread t2 = new Thread(new MyThread(),"线程B");
		//Thread t3 = new Thread(new MyThread(),"线程c");
		//设置线程的优先级
		t1.setPriority(Thread.MAX_PRIORITY);//可以由数字代替，1，2，3，4，5，6，7，8，9，10
		t2.setPriority(Thread.MIN_PRIORITY);
		//t3.setPriority(2);
		//设置线程的优先级
		System.out.println("线程A的优先级："+t1.getPriority());
		System.out.println("线程b的优先级："+t2.getPriority());
		//System.out.println("线程c的优先级："+t3.getPriority());
		System.out.println("***********************");
		t1.start();
		t2.start();
		//t3.start();
	}

}
