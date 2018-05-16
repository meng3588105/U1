package com.示例.n0304;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testt {
	/**
	 * 替换文本文件内容
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;	
		BufferedWriter bw = null;
		
		try {//读取字符流
			fr = new FileReader("E:/IO/source.txt");
			br = new BufferedReader(fr);
			//写入字符流
			fw = new FileWriter("E:/IO/target.txt");		
			bw = new BufferedWriter(fw);			
			StringBuffer sbf = new StringBuffer();//接收变量sbf
			String line= null;//定义一个循环接收变量
			//循环读取并追加字符
			while ((line=br.readLine())!=null) {
				sbf.append(line);
			}
			System.out.println("替换前"+sbf);
			//替换内容
			String a = sbf.toString().replace("name", "屁屁");
			a= a.toString().replace("tupe", "狗狗");
			a=a.toString().replace("master","啦啦啦");			
			System.out.println("替换后"+a);
			bw.write(a);//写入文件内容
			bw.flush();//刷新
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
			if (fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (bw!=null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		


	}

}
