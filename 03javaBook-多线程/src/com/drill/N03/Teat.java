package com.drill.N03;

public class Teat {

	/**
	 * 多线程 模拟多人爬山，这里是年轻人和 老人
	 */
	public static void main(String[] args) {
		MyThread my =new MyThread("年轻人",500,1);
		MyThread my1 =new MyThread("老年人",1500,1);
		Thread nian = new Thread(my,"年轻人");
		Thread lao  = new Thread(my1,"老年人");
		System.out.println("————————————开始爬山——————————");
		nian.start();
		lao.start();

	}

}
