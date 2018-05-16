package com.上机练习.No02;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//输入流
		InputStream fis = null;
		//输出流
		OutputStream fos=null;
		
		try {
			fis= new FileInputStream("E:/好好学习.txt");//读取
			fos = new FileOutputStream("E:/hello.txt",true);//输出
			
			int len;//存储读入数组的长度
			byte[]words = new byte[1024];
			while((len=fis.read(words))!=-1){
				System.out.println(new String(words,0,len));
				fos.write(words,0,len);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			//关闭流
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
