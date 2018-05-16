package com.Task02.No06;

import java.util.Random;
import java.util.Scanner;

public class Vip {

	/**
	 * VIP随机编号
	 */
	public static void main(String[] args) {
		String name;
		String sex;
		int age;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入会员姓名：");
		name = input.next();
		System.out.println("请输入会员性别：");
		sex = input.next();
		System.out.println("请输入会员年龄：");
		age = input.nextInt();
		
		int a = (int)(Math.random()*9000+1000);

		
		System.out.println("创建会员成功\n会员编号："+a);
		System.out.println("会员详细信息：\n"+name+"\t"+sex+"\t"+age);
		
	}

}
