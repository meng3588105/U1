package com.练习.LLL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class FileReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1创建一个字符流对象
		Readable fr = null;

		try {
			fr =new FileReader("E:/IO/读取字符流.txt");
			
			// 2读取文本文件
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			// 3关闭流
			if (fr!=null) {
				
			
			}
		}
		
		
		

	}

}
