package com.示例.N08;

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Wait");
		Wait.bySec(5);//让主线程等待5秒钟再执行
		System.out.println("start");
	}

}
