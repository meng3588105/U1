package com.drill.N04;

public class Test {

	/**
	 * 显示、设置优先级
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyThread());		
		Thread t = Thread.currentThread();

		
		System.out.println("————显示默认优先级————");
		System.out.println("主线程："+t.getName()+"优先级："+t.getPriority());
		System.out.println("子线程："+t1.getName()+"优先级："+t1.getPriority());
		System.out.println("_______修改后的优先级________");
		t.setPriority(6);
		t1.setPriority(1);
		System.out.println("主线程："+t.getName()+"优先级："+t.getPriority());
		System.out.println("子线程："+t1.getName()+"优先级："+t1.getPriority());

	}
}
