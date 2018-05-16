package com.OO.parameter;

import java.util.Scanner;

public class ZuoYeA02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ZuoYeA01 aa = new ZuoYeA01();
		Scanner input = new Scanner(System.in);
		System.out.print("请输入月份：");
		 int shuru=input.nextInt();
		 /**
		  * switch选择月份。
		  */
		switch (shuru) {
		case 1:					
		case 2:			
		case 3:	aa.chun();		
			break;
		case 4:		
		case 5:		
		case 6:
			aa.xia();
			break;
		case 7:			
		case 8:		
		case 9:
			aa.qiu();
			break;
		default:aa.dong();
			break;
		}

	}

}
