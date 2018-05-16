package com.示例.n0304;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	/**
	 * 字节流写入文件内容
	 */
	public static void main(String[] args) {
		FileOutputStream fos=null;
		try {	
			String str = "好好学习java";//要写入的内容
			byte[]words = str.getBytes();//字节数组
			//创建流对象，以追加方式写入文件
			fos = new FileOutputStream("E:/hello.txt",true);//true是在结尾写，不加true则覆盖之前
			//写入文件
			fos.write(words,0,words.length);
			System.out.println("hello文件已经更新");		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		

	}

}
