package com.No1.Book;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Teat3HashMap {

	/**
	 * HashMap使用示例
	 * 泛型
	 */
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("兰兰",100,90,"拉布拉");
		Dog dog2 = new Dog("楠楠",60,50,"雪纳瑞");
		Dog dog3 = new Dog("娜娜",90,30,"松狮");
		Dog dog4 = new Dog("妮妮",80,100,"可比克");
		
		//创建map集合对象并把多个狗狗对象放入其中
		Map<String, Dog> dogs = new HashMap<String,Dog>();
		dogs.put(dog1.getName(), dog1);
		dogs.put(dog2.getName(), dog2);
		dogs.put(dog3.getName(), dog3);
		dogs.put(dog4.getName(), dog4);
		
		//遍历集合Iterator
		Set<String> keys = dogs.keySet();//取出所有Key集合
		Iterator<String> it = keys.iterator();//获取Iterator对象
		while (it.hasNext()) {
			String key = it.next();
			Dog dog = dogs.get(key);
			System.out.println(key+""+dog.getStain());
		}
		System.out.println("*********forarch");
		

		

	}
		
}
