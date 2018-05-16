package com.Task04.Noo05;

public class MuRun implements Runnable {
	 private String name;
	 
	 public MuRun(String name) {
	        this.name = name;
	    }
	@Override
	public void run() {
		 synchronized(MuRun.class){
		        for(int i=0;i<10;i++){
		             
		            if (Test.money > 0) {
		                Test.money = Test.money - 100;
		                System.out.println(name + "取走了100元");
		            } else {
		                System.out.println(name + "没钱了");
		            }
		            try {
		                Thread.sleep(500);
		            } catch (InterruptedException e) {
		                e.printStackTrace();
		            }
		        }
		         
		    }

	}

}
