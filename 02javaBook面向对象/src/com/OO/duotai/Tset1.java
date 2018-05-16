package com.OO.duotai;

import java.util.Scanner;

public class Tset1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			NiuBen niu = new YueHan();//父类调取子类实例化,牛犇调取约翰爱好
			NiuBen niu1 = new WangXiaoQiang();////父类调取子类实例化，牛犇调取王小强爱好
		//	wang.print();
			System.out.println("牛犇的哪个朋友要来？（1、约翰	2、王小强）");
			int peng  =input.nextInt();
			switch (peng) {//判断牛犇的哪个朋友要来
			case 1:niu.print();
				/*if (niu instanceof YueHan) {
					YueHan yue= (YueHan)niu;
					yue.print();
					
					}
					*/			
				break;
			case 2:niu1.print();
				/*if (niu instanceof WangXiaoQiang) {
				WangXiaoQiang wang = (WangXiaoQiang)niu;
				wang.print();
					}
					*/
			break;

			}
			
			
			
			
				
			
				
			

	

}
}