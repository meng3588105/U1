package com.示例.LLL;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	/**
	 * BufferedWriter 字符写入流
	 */
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			// 创建一个FileWriter对象
			fw = new FileWriter("E:/IO/target.txt", true);// true是在结尾写，不加true则覆盖之前
			// 创建一个BufferedWriter对象
			bw = new BufferedWriter(fw);
			// 写入信息
			bw.write("北国风光，千里冰封，万里雪飘。");
			bw.newLine();// 换行符
			bw.write("望长城内外，惟余莽莽；大河上下，顿失滔滔。");
			bw.newLine();// 换行符
			bw.write("山舞银蛇，原驰蜡象，欲与天公试比高。");
			bw.newLine();// 换行符
			bw.flush();// 刷新缓冲区

			// 写完后，读取文件内容用（BufferedReader 字符读取）
			FileReader fr = new FileReader("E:/IO/target.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			//关闭流
			fr.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (bw != null) {
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
