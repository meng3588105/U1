package com.Task04.Noo05;

public class Test {
	public static int money = 500;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    
	        Thread zf = new Thread(new MuRun("妻子"));
	        Thread qz = new Thread(new MuRun("丈夫"));
	            zf.start();
	            qz.start();
	    

	}

}
