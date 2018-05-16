package com.mxl.ketang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *  服务器  ===》超市
 */
public class ServerSocketDemo {

	public static void main(String[] args) {
		ServerSocket serverSocket = null; // 超市
		Socket socket = null; // 顾客
		InputStream inputStream = null; // 购物车
		BufferedReader br = null; // 收银员
		OutputStream outputStream = null; // 收银员的反馈
		try {
			// 在指定的位置创建一个超市
			serverSocket = new ServerSocket(8800);
			// 超市开门等待 顾客上门
			socket = serverSocket.accept();
			// 顾客开始购物
			inputStream = socket.getInputStream();
			// 收银员进行多次扫码
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("您购买的商品是===》" + line);
			}
			// 结束购物 不代表顾客 走出超市
			socket.shutdownInput();
			// 打开输出流 给顾客回馈 购物清单
			outputStream = socket.getOutputStream();
			outputStream.write("欢迎您下次光临".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally { // 释放资源
			try {
				outputStream.close();
				socket.close();
				br.close();
				inputStream.close();
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
