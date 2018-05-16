package com.ShangJi.No2;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Register ab = new Register();
		Scanner input = new Scanner(System.in);
		System.out.println("*****欢迎进入注册系统******");

		do {
			System.out.print("请输入身份证：");
			String id = input.next();
			System.out.print("请输入手机号：");
			String phone = input.next();
			System.out.print("请输入座机号：");
			String number = input.next();

			String stu1 = number.substring(4,5);
			if (id.length() != 16 && id.length() != 18) {
				System.out.println("身份证号必须是16位或者18位");
			} else if (number.length() != 12 && !stu1.equals("-")) {
				System.out.println("-,前面必须是4位，后面必须是7位");
			} else if (phone.length() != 11) {
				System.out.println("手机号码必须是11位");
			} else {
				ab.show(id, phone, number);
				System.exit(0);
			}
		} while (true);
	}

}
/*
 * private static String substring(int i, int j) {
 * //number.indexOf("-")!=-1&&number.substring(index-4,number.length() //TODO
 * Auto-generated method stub return null; }
 */