package com.OO.yichang;

import org.apache.log4j.Logger;

public class ZuoYe01 {
	private static Logger logger=Logger.getLogger(ZuoYe01.class);

	public static void main(String[] args) {
		int []shu = new int [3];
		try {
			for (int i =0 ; i < 4; i++) {
				System.out.println(shu[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("出现错误，数组下标越界");
			
			logger.error(e.getLocalizedMessage()+"输入不匹配");//这句话是在文件中产生异常信息
		}finally{
			System.err.println("感谢使用本程序！");
		}
	}
}
