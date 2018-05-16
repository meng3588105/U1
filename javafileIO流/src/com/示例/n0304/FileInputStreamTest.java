package com.示例.n0304;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	/**
	 * 字节流读取文件内容
	 */
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			//声明对象
			fis=new FileInputStream("E:/IO/source.txt");
			//定义一个接收变量
			int data;
			//读取文件字节数
			System.out.println("可读取的字节数"+fis.available());
			//循环读数据
			while ((data=fis.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if (fis!= null) {
					fis.close();
				}
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}
}



