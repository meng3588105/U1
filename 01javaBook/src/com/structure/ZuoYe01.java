package com.structure;

import java.util.Scanner;

public class ZuoYe01 {


	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("请输入星期几");
		int xingqi=meng00.nextInt();  //选择星期
		
		switch (xingqi) {
		case 1:
			System.out.println("学习编程");
			break;
		case 2:
			System.out.println("学习英语");
			break;
		case 3:
			System.out.println("学习编程");
			break;
		case 4:
			System.out.println("学习英语");
			break;
		case 5:
			System.out.println("学习编程");
			break;
		case 6:
			System.out.println("学习英语");
			break;	
		case 7:
			System.out.println("休息");//周日休息
		default :
			System.out.println("输入星期错误，请重新运行");
			break;
		}
	}

}
