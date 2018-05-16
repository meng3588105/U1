package com.aa;

public class MyThread extends Thread {
	private String data;
	public MyThread(String data) {
		this.data=data;
	}
	public void run(){
		synchronized(data){
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep((int)(Math.random()*1000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(data);
			}
		}
	}
}	
