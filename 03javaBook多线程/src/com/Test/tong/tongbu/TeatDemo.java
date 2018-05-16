package com.Test.tong.tongbu;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class TeatDemo extends Thread{
	@Test
	public void test1(){
		String str = "ddd";
		FileWriter fw =null;
		try {
			fw = new FileWriter("E:\\hello.txt");
			fw.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test2(){
		TeatDemo b = new TeatDemo();
		b.run();
		
		
	}
	public void start(){
		for (int i = 0; i <10; i++) {
			System.out.println("d"+i);
		}
	}
	
}
