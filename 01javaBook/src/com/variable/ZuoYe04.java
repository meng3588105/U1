package com.variable;

import java.util.Scanner;

public class ZuoYe04 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		System.out.println("输入一个整数");
		int ger=meng00.nextInt();//输入一个整数
		if (ger%3==0 || ger%5==0) {//取余，看这个整数余3或5是否会有余数，如果余数为"0"输出是3或5倍数，如果余数大于"0"输出不能被整除。
		
			System.out.println("该整数是3或5的倍数");
		}else{
			System.out.println("该整数不能被3或5中的任何一个数整除");
		}

	}

}
