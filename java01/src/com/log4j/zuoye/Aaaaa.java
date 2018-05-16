package com.log4j.zuoye;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Aaaaa {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Logger log = Logger.getLogger(Aaaaa.class);
		System.out.println("请输入账号");
		String name = input.next();
		System.out.println("请输入密码");
		String mi = input.next();
		if (name.equals("long") && mi.equals("123")) {
			log.trace("登录信息======================");
			log.trace("登录成功");
			log.trace("用户名" + name);
			log.trace("密码" + mi);

		} else {
			log.trace("登录信息======================");
			log.trace("登录失败");
			log.trace("用户名" + name);
			log.trace("密码" + mi);

		}

	}

}
