package com.OO.fengzhuang;

public class Student2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student2 a = null;
		a = new Student2("小龙", 12);//测试类给的值。
		a.print();
		a = new Student2("小丽",13,"女","php");//测试类给的值
		a.print();
	}

}
