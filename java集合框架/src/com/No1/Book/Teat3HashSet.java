package com.No1.Book;

import java.util.HashSet;
import java.util.Set;

public class Teat3HashSet {

	/**
	 * HashSet使用示例
	 * 泛型
	 */
	public static void main(String[] args) {
		Penguin uin1= new Penguin("丽丽",100,100);
		Penguin uin2= new Penguin("碰碰",100,100);
		Penguin uin3= new Penguin("国国",100,100);
		Penguin uin4= new Penguin("呃呃",100,100);
		//创建HashSet集合对象并把4个企鹅对象放入其中，泛型定义元素类型
		Set<Penguin> uins = new HashSet<Penguin>();
		uins.add(uin1);
		uins.add(uin2);
		uins.add(uin3);
		uins.add(uin4);
		System.out.println("遍历集合中的企鹅");
		
		for (Penguin uin : uins) {
			uin.print();
		}
		
		System.out.println("*****************");
		
	}

}
