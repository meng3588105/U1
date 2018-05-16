package com.OO.jiekou;

public class AnimalTest {
	/**
	 * 测试类
	 * @param args
	 */
	public static void main(String[] args) {
		Animal a1 = Store.get("pig");
		a1.shout();
	}
}
