package com.drill.N05;

public class MyThread implements Runnable {
	int num;// 叫号个数
	int time;// 设置看病的时间
	String name;// 病人名

	public MyThread(int num, String name, int time) {
		this.num = num;
		this.time = time;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= this.num; i++) {
			try {
				Thread.sleep(time);// 休眠时间
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(this.name + i + "号病人在看病");// 定义输出格式 ，姓名、 几号

			// 判断 如果 this.name 等于普通号 并且 循环了10次，则普通号暂停3000毫秒。强制执行特需号
			if (this.name.equals("普通号") && i == 10) {
				try {
					Thread.currentThread().join(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
