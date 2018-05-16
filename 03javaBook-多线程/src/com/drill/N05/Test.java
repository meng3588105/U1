package com.drill.N05;

public class Test {

	/**
	 * 模拟医院叫号看病
	 */
	public static void main(String[] args) {
		MyThread My = new MyThread(10, "特需号", 500);// 调用有参构造 设定值
		MyThread My1 = new MyThread(50, "普通号", 250);// 调用有参构造 设定值

		Thread t1 = new Thread(My);// 调用 两种值 特需号
		Thread t2 = new Thread(My1);// 调用 两种值 普通号

		t1.setPriority(10);// 特需号最高优先级
		t2.setPriority(1);// 普通号最低优先级

		t1.start();
		t2.start();

	}

}
