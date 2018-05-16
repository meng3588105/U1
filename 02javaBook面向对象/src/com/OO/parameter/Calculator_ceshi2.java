package com.OO.parameter;

import java.util.Scanner;

public class Calculator_ceshi2 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int op,num1,num2;
		Scanner input = new Scanner(System.in);
		Calculator2 a = new Calculator2();
		System.out.print("请选择运算1.加法2.减法.3乘法4.除法：");
		op=input.nextInt();
		System.out.print("请输入第一个数：");
		num1=input.nextInt();
		System.out.print("请输入第二个数：");
		num2=input.nextInt();
		System.out.println("运算结果为："+a.ope(op, num1, num2));
	}

}
