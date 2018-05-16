package com.log4j.ceshi;

import java.util.Scanner;

import org.apache.log4j.Logger;





public class Aaaaa {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		String name = "龙";
		String mi ="123";
		Logger log = Logger.getLogger(Aaaaa.class);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入账号");
		name=input.next();
		System.out.println("请输入密码");
		mi = input.next();
		if (name.equals("龙") && mi.equals("123")) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}

	}

}
