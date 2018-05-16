package com.No1.Book;

import java.util.HashMap;
import java.util.Map;

public class Teat3HashMap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//1使用HashMap存储多组国家英文简称和中文全称的“键-值对”
		Map<String, String> cou = new HashMap<String, String>();
		cou.put("CN", "中华人民共和国");
		cou.put("RU", "俄罗斯联邦");
		cou.put("FR", "法兰西共和国");
		cou.put("US", "美利坚合众国");
		//2显示CN对象国家的中文全称
		String country = cou.get("CN");
		System.out.println(country);
		//3显示集合中元素的个数
		System.out.println("Map中共有"+cou.size()+"组数据");
		//两次判断Map中是否存在“FR”键
		System.out.println("Map中包含FR的Key吗？"+cou.containsKey("FR"));
		cou.remove("FR");//在Map中删除了FR
		System.out.println("Map中包含FR的Key吗？"+cou.containsKey("FR"));
		//分别显示键集、值集、和	 键-值对集
		System.out.println(cou.keySet());
		System.out.println(cou.values());
		System.out.println(cou);
		//清空HashMap
		
		cou.clear();//移除所有映射关系
		if (cou.isEmpty()) {
			System.out.println("已清空");
		}else {
			System.out.println("没有清空");
		}
		
	}

}
