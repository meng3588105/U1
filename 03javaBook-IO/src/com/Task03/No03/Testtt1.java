package com.Task03.No03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Testtt1 {
	/**
	 * 使用字节流（DataInputStream）读取二进制文件    （DataOutputStream）写入二进制文件
	 */
	public static void main(String[] args) {
		DataInputStream dis = null;
		DataOutputStream dos = null;
		try {
			//创建输入流对象（读取）
			dis = new DataInputStream(new FileInputStream("E:/IO/source.txt"));
			//创建输出流对象（写入）
			dos =new DataOutputStream(new FileOutputStream("E:/IO/target.txt"));		
			int temp;
			//读取文件并且写入文件内容
			while((temp=dis.read())!=-1){
				dos.write(temp);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (dis!=null) {
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (dos!=null) {
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
