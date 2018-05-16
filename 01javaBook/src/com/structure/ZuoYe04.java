package com.structure;

import java.util.Scanner;

public class ZuoYe04 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);

		
		int a = 0;
		int b=0;
		
		System.out.println("请输入第一个操作数：");	
		if (meng00.hasNextInt()==true) {
			a=meng00.nextInt();
			System.out.println("请输入第二个操作数：");
	
			if (meng00.hasNextInt()==true) {					//if 判断输入的数是否合法
			b=meng00.nextInt();
			System.out.println("请输入你的计算符号（只能输入+、-、*、/）");
			String c=meng00.next();	//输入计算符号
			switch (c) {
			case "+":
				System.out.println(a+"+"+b+"="+(a+b));//+计算结果
				break;
			case "-":
				System.out.println(a+"-"+b+"="+(a-b));//-计算结果
				break;
			case "*":
				System.out.println(a+"*"+b+"="+(a*b));//*计算结果
				break;
			case "/":
				System.out.println(a+"/"+b+"="+(a/b));//除计算结果
				break;
			}
			
			}else {
				System.out.println("输入不合法：");	                 //输入错误，提示输入不合法
				}	
			
			}
		}		
}					

