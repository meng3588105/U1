package 日期;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class xdf {
/**
 * 日期格式转换类 java.text.SimpleDateFormat
 * 01.把日期转换字符串 format
 * 02.把字符串转换日期 parse
 * @throws ParseException 
 * 
 *  
 * */
	public static void main(String[] args) throws ParseException {
		//创建一个日期对象
		Date date= new Date();
		System.out.println(date);  //这个日期格式是电脑里的日期格式
		//日期格式转换
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(date);
		System.out.println(time);
		//上面正常的日期格式转换电脑日期格式
		String sourceDate = "2012-12-12 08:02:10";
		date = sdf.parse(sourceDate);
		System.out.println(date);
		
	}

}
/*
 * //创建一个日期对象
		Date date = new Date();//Wed Nov 22 08:37:57 CST 2017
		System.out.println("Date类型的格式==》"+date);
		//日期格式转换类
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String time = sdf.format(date);//把日期转换字符串
		System.out.println("String类型的格式==》"+time);
		//定义一个日期格式的字符串
		String sourceDate = "2012-12-12 08:02:10";
		date = sdf.parse(sourceDate);
		System.out.println(date);
 * 
 * 
 *
 * 
 * 
 * */
