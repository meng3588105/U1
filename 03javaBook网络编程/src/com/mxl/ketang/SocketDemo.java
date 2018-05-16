package com.mxl.ketang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 客户端 ====》顾客
 */
public class SocketDemo {

	public static void main(String[] args) {

		Socket socket = null; // 顾客
		OutputStream outputStream = null;// 钱包
		InputStream inputStream = null; // 收银员的回馈信息 购物清单
		BufferedReader br = null; // 获取收银员的回馈信息
		try {
			socket = new Socket("localhost", 8800);
			outputStream = socket.getOutputStream(); // 钱 从钱包出去
			outputStream.write("回家的车票".getBytes());
			// 购物完毕
			socket.shutdownOutput();

			// 接收收银员的回馈信息
			inputStream = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("收银员给我们的回馈信息是===》" + line);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 释放资源
			try {
				br.close();
				inputStream.close();
				outputStream.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
