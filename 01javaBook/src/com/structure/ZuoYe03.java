package com.structure;

import java.util.Scanner;

public class ZuoYe03 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		int ticket =5000;
		System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
		int cang = meng00.nextInt();				//选择舱
		System.out.println("请输入您出行的月份1~12");
		int yuefen=meng00.nextInt();//选择月份
		while (yuefen>=1||yuefen<=12) {//1~12
			System.out.println("请输入正确月份");//错误输入
			yuefen=meng00.nextInt();
		}
			
		
		if (cang==1) {//1头等舱
			switch (yuefen) {
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("你的机票价格为："+ticket*0.9);//旺季
			default:
				System.out.println("你的机票价格为："+ticket*0.5);//淡季
				break;
			}
		}else if (cang==2) {//2经济舱
			switch (yuefen) {
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("你的机票价格为："+ticket*0.8);//旺季
			default:
				System.out.println("你的机票价格为："+ticket*0.4);//淡季
		
		}	
		
		}
		
		}	
		
	}


