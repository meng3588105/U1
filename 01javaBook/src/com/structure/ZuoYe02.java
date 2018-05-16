package com.structure;

import java.util.Scanner;

public class ZuoYe02 {

	public static void main(String[] args) {
		Scanner meng00=new Scanner(System.in);
		int score=meng00.nextInt();
		int cj= score/10;			//成绩除以
		switch (cj) {
		case 10 :
			System.out.println("父亲给她买一辆车");//==100分
			break;
		case 9 :
			System.out.println("母亲给她买一部笔记本电脑");//=>90分
			break;
		case 8 :
			
		case 7 :
		
		case 6:
			System.out.println("母亲给她买一部手机");//=>60分
			break;
			
			
		default:
			System.out.println("没有礼物");//低于60分
			break;
		}
	}

}
