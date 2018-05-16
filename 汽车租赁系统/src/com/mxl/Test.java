package com.mxl;

import java.util.Random;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JiaoChe jiaoche = new JiaoChe();// 轿车对象
		KeChe keche = new KeChe();// 客车对象
		Scanner input = new Scanner(System.in);
		Random r=new Random();      //随机数 
		
		int sj=r.nextInt(1000);  
		
		System.out.println("欢迎来到汽车租赁公司");
		System.out.println("请输入要租赁的天数");
		int days = input.nextInt();
		System.out.println("请输入要租赁的汽车类型（1：轿车   2：客车）");
		int leixing = input.nextInt();
		if (leixing ==1) {
			System.out.println("请输入要租赁的汽车品牌（1：宝马  2：别克）");
			int pingpai = input.nextInt();
			if (pingpai==1) {
				System.out.println("请选择型号：（1、m3，2、m4）");
				int xinghao = input.nextInt();
				System.out.println("分配给您的车牌是：京AU"+sj);
				double money=keche.zujin(days, leixing);  
		
				System.out.println("顾客你好！你需要支付的租赁金额为："+money);  
			}
		}
		if (leixing==2) {
			System.out.println("请输入租赁的客车品牌（1、金杯  ，2、金龙）");
			int pingpai = input.nextInt();
			System.out.println("请输入客车的座位数");
			int zuoweishu = input.nextInt();
			System.out.println("分配给您的车牌是：京AU"+sj);
			double money=keche.zujin( days, leixing);  
			System.out.println("顾客你好！你需要支付的租赁金额为："+money);  
			
		}

	}

}
