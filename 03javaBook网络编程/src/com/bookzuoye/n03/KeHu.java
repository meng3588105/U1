package com.bookzuoye.n03;
/**
 * 客户端
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class KeHu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Socket socket = null;
		OutputStream outputStream=null;
		InputStream inputStream=null;
		BufferedReader br = null;
		
		try {
			socket = new Socket("localhost",8888);
			outputStream = socket.getOutputStream();
			outputStream.write("账号：aaaaaa，密码：123123".getBytes());
			socket.shutdownOutput();
			
			inputStream = socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(inputStream));
			String lines = null;
			while ((lines = br.readLine())!=null) {
				System.out.println("我是客户端，服务器的响应为："+lines);				
			}
			System.out.println("aaaaaaa");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
				inputStream.close();
				outputStream.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
		
	}

}
