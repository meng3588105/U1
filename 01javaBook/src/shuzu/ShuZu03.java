package shuzu;

import java.util.Scanner;

public class ShuZu03 {
/**
 * 上机练习5
 * */
	public static void main(String[] args) {
		int []zu=new int[4];//定义一个数组长度
		Scanner meng00=new Scanner(System.in);
		System.out.println("请输入4家店的价格");
		
		for (int i = 0; i < zu.length; i++) {
			System.out.print("第"+(i+1)+"家店的价格：");//输入每个数组的数
			zu[i]=meng00.nextInt();
		}
		int min = 0;		//记录最小价格
		min=zu[0];	//每次都和第一家店做比较	
		for (int i = 0; i < zu.length; i++) {		
			if (zu[i]<min) {		//
				min=zu[i];
			}
		}System.out.print("最低价格"+min);
		
	}
	
}


