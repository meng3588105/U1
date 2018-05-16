package com.Task02.No04;

import java.util.Scanner;

/**
 * 从控制台输入字符串，长度是6，如果输入长度不为6，重新输入 
 */
public class Aaaa {

	public static void main(String[] args) {
		String a ;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("请输入长度为6的字符串");
			a =input.next();
		} while (a.length()!=6);
		System.out.println("程序结束，您输入了："+a);


	}
}
