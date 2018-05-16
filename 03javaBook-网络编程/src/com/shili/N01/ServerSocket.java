package com.shili.N01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ServerSocket {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
	
	//建立客户端Socket连接,指定服务器的位置为本机以及端口8800
	Socket socket = new Socket("localhost",8000);
	
	OutputStream os = socket.getOutputStream();
	InputStream is = socket.getInputStream();
	//发送客户端登录信息，即向输出流写入信息
	
	}
}
