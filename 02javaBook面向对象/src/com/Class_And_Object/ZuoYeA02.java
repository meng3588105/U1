package com.Class_And_Object;

import java.util.Scanner;

public class ZuoYeA02 {
	/**
	 * 用面向对象思想，编写一个计算器，可以实现两个整数的加、减、乘、除运算。
	 * 
	 * 首先从该问题中抽象出类，然后找到它具有的属性和方法
	 * 
	 * */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		ZuoYeA01 me = new ZuoYeA01();
		System.out.println("输入一个整数");
		me.a=input.nextInt();
		System.out.println("输入另一个整数");
		me.b=input.nextInt();
		System.out.println("输入算数方式");
		me.fang=input.next();
		switch (me.fang) {
		case "+":
			me.jia();
			break;
		case "-":
			me.jian();
			break;
		case "*":
			me.cheng();
			break;
		case "/":
			me.chu();
			break;

		default:
			break;
		}		
		
	}

}
