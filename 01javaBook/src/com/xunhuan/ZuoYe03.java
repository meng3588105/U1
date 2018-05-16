package com.xunhuan;

import java.util.Scanner;

public class ZuoYe03 {


	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		 
		
		int mun;
        int max=0;
        int min=0;
        
        //进入do...while循环输出
        do {
        	System.out.println("请输入一个数（输入0结束）");
            mun =meng00.nextInt();
			if (mun!=0) {			//if判断输入的数如果不等于0就进入
				if (mun>max) {		//if判断 输入的数如果大于设定的最大值，赋值给最大值
					max=mun;
				}
				
				if (mun<min) {		//如果输入的数小于最小值，就赋值给最小的值
					min=mun;
				}
				if (min==0) {		//如果最小值是0，那么输入的数赋值给最小值
					min=mun;
				}
							
			}
						
		} while (mun!=0);			//输入的数不能是0，是0就结束循环操作
        System.out.print("最大值是："+max);
        System.out.print("最小值是："+min);    
}
}

