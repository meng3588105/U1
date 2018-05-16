package com.示例.LLL;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
/**
 * BufferedReader 字符读取
 *
 */
public class BufferedReaderDemo {
	public static void main(String[] args) {
		Reader fr =null;
		BufferedReader br=null;
		try {
			//创建一个FileReader对象
			fr =new FileReader("E:/IO/source.txt");
			//创建一个BufferedReader对象
			br = new BufferedReader(fr);
			//读取一行数据
			String line=br.readLine();
			while (line!=null) {
				System.out.println(line);
				line=br.readLine();
			}		
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在");
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
			if (br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
