package com.Task04.No05;

public class Bank implements Runnable {

	int num = 5;// 记录余额

	boolean flag = false;// 记录是否取完

	@Override
	public void run() {
		while (!flag) {
			show();
			System.out.println(Thread.currentThread().getName() + "完成取款");
		}
			System.out.println("余额不足以支付" + Thread.currentThread().getName()
				+ "取款，余额为0");
	}
	public synchronized void show() {
		if (num < 0) {
			flag = true;
			return;
		}
		num--;//每次余额减1
		

		try {
			Thread.sleep(500);// 网络延迟
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "准备取款");

	}

}
