package com.variable;

import java.util.Scanner;

public class ZuoYe06 {


	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		int ticket=5000;
		System.out.println("请输入您出行的月份1~12");
		int season=meng00.nextInt();
		
		System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
		int cang=meng00.nextInt();
		
		if (season>=4&&season<=10) {
			if (cang==1)
			{
				System.out.println("你的机票价格为："+ticket*0.9);//旺季头等舱
				
			}else{
				System.out.println("你的机票价格为："+ticket*0.8);//旺季经济舱
			}
		}else{
			if (cang==1)
			{
				System.out.println("你的机票价格为："+ticket*0.5);//淡季头等舱
				
			}else{
				System.out.println("你的机票价格为："+ticket*0.4);//淡季经济舱
			}
		}

		
		
		
		/*
		if (season>=4&&season<=10 || ) 
		{
			System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
			int cang=meng00.nextInt();
			if (cang==1)
			{
				System.out.println("你的机票价格为："+ticket*0.9);//旺季头等舱
				if (season<4 && season>10) {
					
				}
				System.out.println("你的机票价格为："+ticket*0.5);//淡季头等舱
			}else{
				System.out.println("你的机票价格为："+ticket*0.8);//旺季经济舱
				System.out.println("你的机票价格为："+ticket*0.4);//淡季经济舱
			}
		}
		*/
		
	
}
}
