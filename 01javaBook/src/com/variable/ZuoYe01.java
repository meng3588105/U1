package com.variable;

import java.util.Scanner;

public class ZuoYe01 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("输入用户名：");
		String id=meng00.next();//用户名
		System.out.println("输入密码");
		int mi=meng00.nextInt();//密码
		
			if("青".equals(id)&& mi==123){
			System.out.println("欢迎你，青");
			}else{
			System.out.println("对不起，你不是青");
			}
		
		

	}

}
