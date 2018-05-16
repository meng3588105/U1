package com.示例.N09;

public class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(100);//增加线程交替执行概率
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//输出当前线程的信息
			System.out.println(Thread.currentThread().getName()+"运行"+i);
		}
		

	}

}
