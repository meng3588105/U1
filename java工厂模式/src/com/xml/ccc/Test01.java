package com.xml.ccc;

import java.util.Scanner;

public class Test01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("输入第一个数字");
		double num1=input.nextDouble();
		System.out.println("输入运算符");
		String yun=input.next();
		System.out.println("输入第一个数字");
		double num2=input.nextDouble();
		// 调用算术类的计算方法
				opp operation = GongChang.getOperate(yun);
				double result = operation.jiekou(num1, num2);
				System.out.println("运算结果是===》" + result);

	}

}
