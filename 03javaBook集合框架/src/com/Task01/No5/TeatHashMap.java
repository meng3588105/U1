package com.Task01.No5;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;//HachMap不能按照顺序输出，用了LinkedHashMap这个包
public class TeatHashMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//用泛型      		LinkedHashMap这个包
		Map<String,Integer> aaa = new LinkedHashMap<String,Integer>();
		aaa.put("老一", 100);
		aaa.put("老二", 90);
		aaa.put("老三", 80);
		aaa.put("老四", 70); 
		
		System.out.println(aaa);//键-值    一起输出
		System.out.println(aaa.values());//只输出值
		//修改后的值
		System.out.println("**********修改后的值***********");
		aaa.put("老四", 70); 
		aaa.put("老四", 50); //键不变，替换了"老四"这个键的值
		System.out.println(aaa);//键-值    一起输出
		System.out.println(aaa.values());//只输出值
		

	}

}
