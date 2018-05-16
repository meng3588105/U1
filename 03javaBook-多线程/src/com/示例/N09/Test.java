package com.示例.N09;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("*****线程强制执行****");
		//创建子线程并启动
		Thread temp=new Thread (new MyThread());
		temp.start();
		for (int i = 0; i < 20; i++) {
			if (i==5) {
				try {
					temp.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"运行"+i);
		}
	}

}
