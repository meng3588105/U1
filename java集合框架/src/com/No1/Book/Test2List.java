package com.No1.Book;

import java.util.LinkedList;

public class Test2List {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Dog dog1 = new Dog("兰兰",100,90,"拉布拉");
		Dog dog2 = new Dog("楠楠",60,50,"雪纳瑞");
		Dog dog3 = new Dog("娜娜",90,30,"松狮");
		Dog dog4 = new Dog("妮妮",80,100,"可比克");
		Dog dog5 = new Dog("哈哈",80,100,"可比克");
		Dog dog6 = new Dog("么么",80,100,"可比克");
		Dog dog7 = new Dog("木木",80,100,"可比克");
		//声明集合
		LinkedList lis = new LinkedList();
		//添加操作
		lis.add(dog1);//0    Dog类型》object
		lis.add(dog2);//1
		lis.add(dog3);//2
		lis.add(dog4);//3
		lis.add(dog5);
		
		lis.addFirst(dog6);
		lis.addLast(dog7);
		for (int i = 0; i < lis.size(); i++) {
			Object ob = lis.get(i);
			Dog obj = (Dog)ob;
			obj.print();
		}
		
		System.out.println("**********删除后********");
		lis.removeFirst();
		lis.removeLast(); 
		for (Object obj : lis) {
			((Dog)obj).print();
		}
		if (lis.contains(dog2)) {
			System.out.println("aa");
		}else {
			System.out.println("bb");
		}

	}

}
