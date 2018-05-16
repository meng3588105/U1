package com.ShangJi.No01;

import java.util.Scanner;
public class Bbbb  {
		
public static void main(String[] args) {
	String name;
	String mi;
	String mi2;

	Aaaa vip = new Aaaa();
	Scanner input = new Scanner(System.in);
	System.out.println("*****欢迎进入注册系统*******");
	do {
		
		System.out.println("请输入用户名");
		 name = input.next();
		System.out.println("请输入密码：");
		 mi = input.next();
		System.out.println("请再次输入密码：");
		 mi2 = input.next();
		 if (name.length() < 3 && name.length() < 6) {
				System.out.println("用户名不能小于3位，密码长度不能小于6位！");
			}
		 
	} while (true);
	
}

}		
		

