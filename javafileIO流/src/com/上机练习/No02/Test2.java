package com.上机练习.No02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InputStream fis=null;
		OutputStream fos=null;
		
		try {
			//读取文件内容
			fis = new FileInputStream("E:/IO/读取.txt");
			//写出文件内容,写出文件名必须问英文
			fos = new FileOutputStream("E:/IO/chu.txt",true);
			int len;//定义一个存储数组长度的变量
			byte[]sss = new byte[1024];
			//通过循环实现文件读写
			while ((len=fis.read(sss))!=-1) {	
				//显示读取内容
				System.out.println(new String(sss,0,len));
				//写入
				fos.write(sss,0, len);				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			if (fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
