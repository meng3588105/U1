package com.No1.Book;

import java.util.HashMap;
import java.util.Map;

public class Abb {
	public static void main(String[] args) {
		Map  map = new HashMap();
		String s = "key";
		map.put(s, "Hello");
		map.put(s, "hello");
		System.out.println(map.size());
	}
}
