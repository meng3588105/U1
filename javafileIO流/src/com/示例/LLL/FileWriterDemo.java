package com.示例.LLL;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	/**
	 * FileWriter 字符写入流
	 */
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			// 创建一个FileWriter对象
			fw = new FileWriter("E:/IO/target.txt",true);//true是在结尾写，不加true则覆盖之前
			//写入信息
			fw.write("北国风光，千里冰封万里雪飘");
			//刷新缓冲区
			fw.flush();
		} catch (IOException e) {
			// 异常
			System.out.println("文件不存在");
			e.printStackTrace();
		}finally{
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
