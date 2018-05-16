package com.xunhuan;

public class ZuoYe002 {
	public static void main (String[]args){
		int j =0;//鸡
		int t = 0 ;//兔
		for (j =0; j <=35 && j>=0 ; j++) {		
			t=35-j;				//总头数减去鸡的头数 等于兔子的
			
		    if ((2*j + 4*t) == 94) {	//if判断 如果总脚数等于94进入 输出。
		    	System.out.println("鸡的个数："+j); //求鸡的个数
		    	System.out.println("兔的个数："+t);//求兔子的个数
		        break;
		    }
		}
	}
}
