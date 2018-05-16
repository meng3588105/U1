package com.多线程面试题;

public class Test {
	
		 public static void main(String[] args) {  
			  
		        new Thread(//子线程  
		                new Runnable(){  
		                    public void run(){  
		                        for(int i=1;i<=50;i++){  
		                            synchronized(Test.class){  
		                                for(int j=1;j<=10;j++){  
		                                    System.out.println("sub thread: "+i+",loop: "+j);  
		                                }  
		                            }  
		                        }  
		                    }  
		                }  
		                ).start();  
		  
		        new Thread(//主线程  
		                new Runnable(){  
		                    public void run(){  
		                        for(int i=1;i<=50;i++){  
		                            synchronized(Test.class){  
		                                for(int j=1;j<=100;j++){  
		                                    System.out.println("main thread: "+i+",loop: "+j);  
		                                }  
		                            }  
		                        }  
		                    }  
		                }  
		                ).start();  
		    }  
		  
	}


