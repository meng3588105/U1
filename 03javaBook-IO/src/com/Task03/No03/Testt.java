package com.Task03.No03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Testt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			//读取
			fr = new FileReader("E:/Man/U1/SousouMove/src/explain.txt");
			br = new BufferedReader(fr);
			//写入
//			fw = new FileWriter("E:/IO/target.txt",true);			
//			bw = new BufferedWriter(fw);
			
			StringBuffer sb = new StringBuffer();
			String ll= null;
			
			while ((ll=br.readLine())!=null) {
				sb.append(ll+"\n");
			}
			System.out.println(sb);
			
			/*bw.write("今天圣诞节");//写入的语句
			bw.newLine();//换行
			bw.write("我正在苦逼的写作业");//写入的语句
			bw.newLine();//换行
			bw.write("哎呦我的天");//写入的语句
			 */			
			/*StringBuffer sb = new StringBuffer();
			String ll= null;
			
			while ((ll=br.readLine())!=null) {
				sb.append(ll);
			}
			System.out.println(sb);
			String a = sb.toString().replace("{name}", "屁屁");
			a= a.toString().replace("{tupe}", "狗狗");
			a=a.toString().replace("{master}","啦啦啦");
			bw.write(a);
			bw.flush();*/
				
			
	
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
