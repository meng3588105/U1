package com.示例.N06;

public class Mythread implements Runnable{

	@Override
	public void run() {
		System.out.println("线程t在运行");
		try {
			Thread.sleep(500);
			System.out.println("线程t在500毫秒休眠后重新运行");
		} catch (InterruptedException e) {
			System.out.println("线程被中断");
			
		}
		
	}
	
}
