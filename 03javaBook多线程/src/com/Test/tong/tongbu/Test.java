package com.Test.tong.tongbu;

public class Test extends Thread{
	public void run(){
		for (int i = 0; i <3; i++) {
			System.out.println(Thread.currentThread().getName()+"运行，i="+i);
		}
	}
}
