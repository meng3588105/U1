package FileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			//创建输入流对象
			is = new FileInputStream("E:/IO/heihei.txt");
			//创建输出流对象
			os = new FileOutputStream("E:/IO/heihei.txt",true);
			//写入内容
			os.write("123456".getBytes());
			System.out.println("可读取的字节数"+is.available());
			int temp = 0;
			while ((temp=is.read())!=-1) {
				System.out.print((char)temp);//中文乱码，转换char
		} 
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if (is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}