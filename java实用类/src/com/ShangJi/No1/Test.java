package com.ShangJi.No1;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Register a = new Register();
		Scanner input = new Scanner(System.in);
		System.out.println("*****欢迎进入注册系统*****");
		do {
			System.out.println("请输入用户名：");
			String name=input.next();
			System.out.println("请输入密码：");
			String pwd1=input.next();
			System.out.println("请再次输入密码：");
			String pwd2 = input.next();
			if (name.length() < 3 && pwd1.length() < 6) {
				System.out.println("用户名不能小于3位，密码长度不能小于6位！");
				} else if (!pwd1.equals(pwd2)) {
					System.out.println("两次输入的密码不相同");
				}else {
					a.verify(name, pwd1, pwd2);
					System.exit(0);
				}
			
		} while (true);


	}

}
