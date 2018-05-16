package com.bookzuoye.n03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.sun.security.ntlm.Server;


/**
 * 服务器
 */
public class FuWu {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		InputStream inputStream = null;
		BufferedReader br = null;
		OutputStream outputStream = null;
		
		try {
			serverSocket  = new ServerSocket(8888);
			socket = serverSocket.accept();
			inputStream = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			while ((line = br.readLine())!=null) {
				if (line.equals("账号：aaaaaa，密码：123123")) {
					System.out.println("我是服务器，客户的登录信息为："+line);
					socket.shutdownInput();
					outputStream = socket.getOutputStream();
					outputStream.write("登录成功，已经接受登录信息".getBytes());
				}else{
					System.out.println("我是服务器：不存在用户，登录失败");
					socket.shutdownInput();
					outputStream = socket.getOutputStream();
					outputStream.write("不存在此用户，重新输入，或者注册".getBytes());
				}
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				outputStream.close();
				socket.close();
				br.close();
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
		
		

	}

}
