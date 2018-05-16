package com.drill.N03;

public class MyThread implements Runnable {
	public int time;//爬的时间
	public int num=0;//爬的长度
	public String name;
	
	public MyThread(String name,int time,int kil){
		this.time=time;
		this.name=name;
		this.num=kil*1000/100;
	}	
	@Override
	public void run() {
		while(num>0){
			try {
				Thread.sleep(this.time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"爬完100米！");
			num--;
		}
		System.out.println(Thread.currentThread().getName()+"到达终点！");
		
	}
}
