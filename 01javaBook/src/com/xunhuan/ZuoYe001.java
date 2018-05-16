package com.xunhuan;

import java.util.Scanner;

public class ZuoYe001 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		int ji = 0;		//输入一个int变量   周几
		int sum=0;		//定义一个 求和 的变量
		double pj=0.0;	//定义一个平均 变量
		//for循环 i<5
		for (int i = 0; i < 5; i++) {
			System.out.print("请输入周"+(i+1)+"的学习时间"); 
			ji=meng00.nextInt();
			sum=sum+ji;//求和
		}
		
				 pj=(double) sum/5;//求平均
				System.out.println("周一至周五每日平均学习时间是"+pj+"小时");
	}

}
