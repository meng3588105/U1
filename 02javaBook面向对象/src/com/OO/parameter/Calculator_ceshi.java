package com.OO.parameter;

import java.util.Scanner;

public class Calculator_ceshi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calculator y=new Calculator();
		System.out.println("请输入一个数");
		y.num1=input.nextDouble();
		System.out.println("请输入另一个数");
		y.num2=input.nextDouble();
		System.out.println("请输入运算方式：");
		y.yun=input.next();
		switch (y.yun) {
		case "+":y.add();			
			break;
		case "-":y.minus();			
			break;
		case "*":y.multiple();			
			break;
		case "/":y.divide();			
			break;

		}
		
	}

}
