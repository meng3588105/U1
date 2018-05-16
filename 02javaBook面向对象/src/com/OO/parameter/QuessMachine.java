package com.OO.parameter;

import java.util.Scanner;

public class QuessMachine {
	Scanner input = new Scanner(System.in);
	String commodity="";//商品名字
	int price= 0 ;//商品价格
	public void initial(){			//商品信息，产生的随机数，随机选择商品        
            int temp = (int)(Math.random()*5+1);//随机产生一个 1~5 的整数
            switch (temp) {
			case 1:
				commodity="公主电动车（1200-1700之间）";
				price=1500;
				break;
			case 2:
				commodity="金星牌拖把（2200-2700之间）";
				price=2500;
				break;
			case 3:
				commodity="韩东大傻逼（3200-3700之间）";
				price=3500;
				break;
			case 4:
				commodity="苑阳阳大傻逼（4200-4700之间）";
				price=4500;
				break;
			case 5:
				commodity="赵恒文大傻逼（5200-5700之间）";
				price=5500;
				break;
			}
	}
	public void guess(){			//循环判断价格，if判断猜测次数
		
		for (int i = 0; i < 4; i++) {
			int a =input.nextInt();
			if (i==3) {
				System.out.println("4次内没有猜对，下次努力");
				break;
			}
			if (price>a) {
				System.out.println("再大些\n");
			}else if (price<a) {
				System.out.println("再小些\n");
			}else {
				System.out.println("猜对了！");break;
			}
			System.out.println("再猜一次吧");
			
		}
	}
	
}