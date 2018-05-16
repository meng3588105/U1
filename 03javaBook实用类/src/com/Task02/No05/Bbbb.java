package com.Task02.No05;

import java.util.Scanner;

public class Bbbb {
	public static void main(String[] args) {
		String a;
		String b;
		Scanner input = new Scanner(System.in);
		//输入生日

		System.out.print("请输入会员生日<月/日：00/00>:");
		a = input.next();
		
		while (a.indexOf("/") == -1) {
			System.out.print("生日形式输入错误！\n\n");
			System.out.print("请输入会员生日<月/日：00/00>:");
			a = input.next();
		}System.out.print("该会员的生日是："+a+"\n\n");


		//输入密码

		System.out.print("请输入会员密码<6-10位>：");
		b = input.next();
		while (b.length() < 6 || b.length() > 10){
			System.out.print("密码形式输入错误！\n\n");
			System.out.print("请输入会员密码<6-10位>：");
			b = input.next();
		}
		System.out.print("该会员的密码是："+b+"\n");

	}
}
