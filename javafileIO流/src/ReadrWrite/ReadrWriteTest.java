package ReadrWrite;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadrWriteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Reader reader = null;
		Writer writer = null;
		
		try {
			//创建对应输出流对象
			writer = new FileWriter("E:/IO/haha.txt");
			//写入内容
			writer.write("大家辛苦了！");
			writer.close();
			//创建对应输入流对象
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
