package com.示例.LLL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/***
 * FileReader  字符读取
 */
public class FileReaderDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		StringBuffer sbf=null;
		try {
			//创建一个FileReader对象
			fr= new FileReader("E:/IO/source.txt");
			//创建字符数组作为中转站
			char ch[]=new char[1024];
			sbf =new StringBuffer();
			//将字符读入数组
			int length=fr.read(ch);
			//循环读取并追加字符
			while ((length!=-1)) {
				sbf.append(ch);//追加到字符串
				length=fr.read();
			}
			System.out.println(sbf);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		                                 
	}                                            
}                                                
                                                 